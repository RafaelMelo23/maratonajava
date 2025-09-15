package devdojo.maratona.java.javacore.ZZJcrud.repository;

import devdojo.maratona.java.javacore.ZZJcrud.conn.ConnectionFactory;
import devdojo.maratona.java.javacore.ZZJcrud.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class ProducerRepository {

    public static List<Producer> findByNamePreparedStatement(String nameToSearch) {
        log.info("Finding Producer by name: {}", nameToSearch);

        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement pstmt = createPreparedStatementByName(conn, nameToSearch);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                Producer producer = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();

                producers.add(producer);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return producers;
    }

    private static PreparedStatement createPreparedStatementByName(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where name like ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, "%" + name + "%");
        return pstmt;
    }

    public static void delete(int id) {

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement pstmt = createPreparedStatementDelete(conn, id)) {

            pstmt.execute();
            log.info("Deleted producer: {} from the database", id);

        } catch (SQLException e) {
            log.error("Error while deleting producer with id: {}", id, e);
        }
    }

    private static PreparedStatement createPreparedStatementDelete(Connection conn, Integer id) throws SQLException {
        String sql = "DELETE FROM `producer` WHERE `id` = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        return pstmt;
    }

    public static void save(Producer producer) {

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement pstmt = createPreparedStatementSave(conn, producer)) {

            pstmt.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update producer: {} ", producer.getId(), e);
        }
    }

    public static PreparedStatement createPreparedStatementSave(Connection conn, Producer producer) throws SQLException {

        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES (?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, producer.getName());
        return pstmt;
    }

    public static void update(Producer producer) {
        log.info("Updating producer '{}'", producer);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementUpdate(conn, producer)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);
        }
    }

    private static PreparedStatement createPrepareStatementUpdate(Connection conn, Producer producer) throws
            SQLException {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = ? WHERE (`id` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;
    }

    public static Optional<Producer> findById(Integer id) {
        log.info("Finding Producer by ID: {}", id);

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement pstmt = createPreparedStatementFindById(conn, id);
             ResultSet rs = pstmt.executeQuery()) {
            if (!rs.next()) return Optional.empty();

            return Optional.of(Producer.builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build());

        } catch (SQLException e) {
            log.info("Error while trying to find producer with id: {}", id, e);
        }
        return Optional.empty();
    }



    private static PreparedStatement createPreparedStatementFindById(Connection conn, Integer id) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        return pstmt;
    }

}
