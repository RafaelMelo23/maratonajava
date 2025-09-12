package devdojo.maratona.java.javacore.ZZIjdbc.repository;

import devdojo.maratona.java.javacore.ZZIjdbc.conn.ConnectionFactory;
import devdojo.maratona.java.javacore.ZZIjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    public static List<Producer> findAll() {
        log.info("Finding All Producers");
        return findByName("");
    }

    public static List<Producer> findByName(String nameToSearch) {
        log.info("Finding All Producers by name: {}", nameToSearch);
        List<Producer> producers = new ArrayList<>();

        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%'".formatted(nameToSearch);
        try (Connection conn = ConnectionFactory.getConnection()) {

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            {
                while (rs.next()) {
                    var id = rs.getInt("id");
                    var name = rs.getString("name");

                    producers.add(Producer.builder().id(id).name(name).build());
                }
            }
        } catch (SQLException e) {
            log.error("Error while trying to fetch all Producers", e);
        }

        return producers;
    }

    public static void showProducerMetadata() {
        log.info("Showing Producer Metadata");
        String sql = "SELECT * FROM `anime_store`.producer";

        try (Connection conn = ConnectionFactory.getConnection();

             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            ResultSetMetaData rsMetaData = rs.getMetaData();
            rs.next();
            int columnCount = rsMetaData.getColumnCount();
            log.info("Column Count: {}", columnCount);

            for (int i = 1; i < columnCount; i++) {

                log.info("Table name: {}", rsMetaData.getTableName(i));
                log.info("Column name: {}", rsMetaData.getColumnName(i));
                log.info("Display Size: {}", rsMetaData.getColumnDisplaySize(i));
                log.info("Column Type: {}", rsMetaData.getColumnType(i));
            }

        } catch (SQLException e) {
            log.error("Error while trying to fetch all Producers", e);
        }
    }

    public static void showDriverMetadata() {
        log.info("Showing Driver Metadata");
        try (Connection conn = ConnectionFactory.getConnection()) {

            DatabaseMetaData dbMetaData = conn.getMetaData();
            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                log.info("Supports TYPE_FORWARD_ONLY");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("Supports CONCUR_UPDATABLE");
                }
            }

            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                log.info("Supports TYPE_SCROLL_SENSITIVE");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("Supports CONCUR_UPDATABLE");
                }
            }

            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                log.info("Supports TYPE_SCROLL_INSENSITIVE");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("Supports CONCUR_UPDATABLE");
                }
            }

        } catch (SQLException e) {
            log.error("Error while trying to fetch all Producers", e);
        }
    }

    public static void showTypeScrollWorking() {
        String sql = "SELECT * FROM anime_store.producer";
        try (Connection conn = ConnectionFactory.getConnection()) {

            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql);
            log.info("Last row? {}", rs.last());
            log.info("Row number: {}", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("First row? {}", rs.first());
            log.info("Row number: {}", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("Row Absolute? {}", rs.absolute(2));
            log.info("Row number: {}", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("Row Relative? {}", rs.relative(-1));
            log.info("Row number: {}", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("Is Last? {}", rs.last());
            log.info("-----------");
            while (rs.previous()) {
                log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());
            }

        } catch (SQLException e) {
            log.error("Error while trying to fetch all Producers", e);
        }

    }

    public static List<Producer> findByNameAndUpdateToUpperCase(String nameToSearch) {
        log.info("Finding All Producers by name: {}", nameToSearch);
        List<Producer> producers = new ArrayList<>();

        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%'".formatted(nameToSearch);
        try (Connection conn = ConnectionFactory.getConnection()) {

            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql);
            {
                while (rs.next()) {
                    rs.updateString("name", rs.getString("name").toUpperCase());
                    rs.updateRow();
                    var id = rs.getInt("id");
                    var name = rs.getString("name");

                    producers.add(Producer.builder().id(id).name(name).build());
                }
            }
        } catch (SQLException e) {
            log.error("Error while trying to fetch all Producers", e);
        }

        return producers;
    }

    public static List<Producer> findByNameAndInsertIfNotFound(String nameToSearch) {
        log.info("Finding producers by name: {}", nameToSearch);
        List<Producer> producers = new ArrayList<>();

        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%'".formatted(nameToSearch);
        try (Connection conn = ConnectionFactory.getConnection()) {

            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) return producers;

            rs.moveToInsertRow();
            rs.updateString("name", nameToSearch);
            rs.insertRow();

            boolean isAdded = producers.add(getProducer(rs));
            log.info("Added producer to db: {}", isAdded);

        } catch (SQLException e) {
            log.error("Error while trying to fetch all Producers", e);
        }

        return producers;
    }

    public static void findByNameAndDelete(String nameToSearch) {
        log.info("Finding producers with the name: {}", nameToSearch);

        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%'".formatted(nameToSearch);
        try (Connection conn = ConnectionFactory.getConnection()) {

            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                log.info("Deleting producer found with the name: {}", nameToSearch);
                rs.deleteRow();
            }
        } catch (SQLException e) {
            log.error("Error while trying to fetch all Producers", e);
        }
    }

    private static Producer getProducer(ResultSet rs) throws SQLException {
        rs.beforeFirst();
        rs.next();
        return Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build();
    }


}
