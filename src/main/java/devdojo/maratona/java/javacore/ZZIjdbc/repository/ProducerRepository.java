package devdojo.maratona.java.javacore.ZZIjdbc.repository;

import devdojo.maratona.java.javacore.ZZIjdbc.conn.ConnectionFactory;
import devdojo.maratona.java.javacore.ZZIjdbc.dominio.Producer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProducerRepository {

    public static void save(Producer producer) {

        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s')".formatted(producer.getName());
        try (Connection conn = ConnectionFactory.getConnection()) {

            Statement stmt = conn.createStatement();
            int rowsAffected = stmt.executeUpdate(sql);
            System.out.println("Rows affected: " + rowsAffected);
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
