package devdojo.maratona.java.javacore.ZZJcrud.repository;

import devdojo.maratona.java.javacore.ZZJcrud.conn.ConnectionFactory;
import devdojo.maratona.java.javacore.ZZJcrud.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

}
