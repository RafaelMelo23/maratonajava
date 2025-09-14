package devdojo.maratona.java.javacore.ZZJcrud.repository;

import devdojo.maratona.java.javacore.ZZJcrud.conn.ConnectionFactory;
import devdojo.maratona.java.javacore.ZZJcrud.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

}
