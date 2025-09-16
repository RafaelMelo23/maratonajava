package devdojo.maratona.java.javacore.ZZJcrud.repository;

import devdojo.maratona.java.javacore.ZZJcrud.conn.ConnectionFactory;
import devdojo.maratona.java.javacore.ZZJcrud.dominio.Anime;
import devdojo.maratona.java.javacore.ZZJcrud.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class AnimeRepository {

    public static List<Anime> findByNamePreparedStatement(String nameToSearch) {
        log.info("Finding Anime by name: {}", nameToSearch);

        List<Anime> animes = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement pstmt = createPreparedStatementFindByName(conn, nameToSearch);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                Producer producer = Producer.builder()
                        .name(rs.getString("name"))
                        .id(rs.getInt("id"))
                        .build();
                Anime anime = Anime.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .episodes(rs.getInt("episodes"))
                        .producer(producer)
                        .build();

                animes.add(anime);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return animes;
    }

    private static PreparedStatement createPreparedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = """
                SELECT a.id, a.name, a.episodes, a.producer_id, p.name AS producer_name
                FROM anime_store.anime a
                INNER JOIN anime_store.producer p ON a.producer_id = p.id
                WHERE a.name LIKE ?;
                """;

        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, "%" + name + "%");
        return pstmt;
    }

    public static void delete(int id) {

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement pstmt = createPreparedStatementDelete(conn, id)) {

            pstmt.execute();
            log.info("Deleted anime: {} from the database", id);

        } catch (SQLException e) {
            log.error("Error while deleting anime with id: {}", id, e);
        }
    }

    private static PreparedStatement createPreparedStatementDelete(Connection conn, Integer id) throws SQLException {
        String sql = "DELETE FROM `anime` WHERE `id` = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        return pstmt;
    }

    public static void save(Anime anime) {

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement pstmt = createPreparedStatementSave(conn, anime)) {

            pstmt.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update anime: {} ", anime.getId(), e);
        }
    }

    public static PreparedStatement createPreparedStatementSave(Connection conn, Anime anime) throws SQLException {

        String sql = "INSERT INTO `anime_store`.`anime` (`name`, `episodes`, `producer_id`) VALUES (?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, anime.getName());
        pstmt.setInt(2, anime.getEpisodes());
        pstmt.setInt(3, anime.getProducer().getId());
        return pstmt;
    }

    public static void update(Anime anime) {
        log.info("Updating anime '{}'", anime);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementUpdate(conn, anime)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update anime '{}'", anime.getId(), e);
        }
    }

    private static PreparedStatement createPrepareStatementUpdate(Connection conn, Anime anime) throws
            SQLException {
        String sql = "UPDATE `anime_store`.`anime` SET `name` = ?, `episodes` = ? WHERE (`id` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(2, anime.getEpisodes());
        ps.setInt(3, anime.getId());
        return ps;
    }

    public static Optional<Anime> findById(Integer id) {
        log.info("Finding Anime by ID: {}", id);

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement pstmt = createPreparedStatementFindById(conn, id);
             ResultSet rs = pstmt.executeQuery()) {
            if (!rs.next()) return Optional.empty();

            return Optional.of(Anime.builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build());

        } catch (SQLException e) {
            log.info("Error while trying to find anime with id: {}", id, e);
        }
        return Optional.empty();
    }


    private static PreparedStatement createPreparedStatementFindById(Connection conn, Integer id) throws SQLException {
        String sql = "SELECT * FROM anime_store.anime where id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        return pstmt;
    }

}
