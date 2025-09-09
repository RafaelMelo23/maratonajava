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
            log.info("Inserted producer: {}, Rows affected: {} ", producer.getName(), rowsAffected);
            stmt.close();

        } catch (SQLException e) {
            log.error("Error while inserting producer : {}", e.getMessage());
        }
    }

    public static void delete(int id) {

        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d')".formatted(id);
        try (Connection conn = ConnectionFactory.getConnection()) {

            Statement stmt = conn.createStatement();
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Deleted producer: {} from the database, Rows affected: {} ", id, rowsAffected);
            stmt.close();

        } catch (SQLException e) {
            log.error("Error while deleting producer with id: {}", id, e);
        }
    }

    public static void update(Producer producer) {

        String sql = "UPDATE `anime_store`.`producer` SET `name` = '%s' WHERE (`id` = '%d')".formatted(producer.getName(), producer.getId());
        try (Connection conn = ConnectionFactory.getConnection()) {

            Statement stmt = conn.createStatement();
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Updated producer: {}, Rows affected: {} ", producer.getId(), rowsAffected);
            stmt.close();

        } catch (SQLException e) {
            log.error("Error while trying to update producer: {} ", producer.getId(), e);
        }
    }
}
