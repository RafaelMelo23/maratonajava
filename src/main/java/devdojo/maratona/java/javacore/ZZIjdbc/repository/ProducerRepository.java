package devdojo.maratona.java.javacore.ZZIjdbc.repository;

import devdojo.maratona.java.javacore.ZZIjdbc.conn.ConnectionFactory;
import devdojo.maratona.java.javacore.ZZIjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Log4j2
public class ProducerRepository {

    public static void save(Producer producer) {

        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s')".formatted(producer.getName());
        try (Connection conn = ConnectionFactory.getConnection()) {

            Statement stmt = conn.createStatement();
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Rows affected: " + rowsAffected);
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
