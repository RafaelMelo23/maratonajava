package devdojo.maratona.java.javacore.ZZIjdbc.repository;

import devdojo.maratona.java.javacore.ZZIjdbc.conn.ConnectionFactory;
import devdojo.maratona.java.javacore.ZZIjdbc.dominio.Producer;

import javax.sql.rowset.JdbcRowSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProducerRepositoryRowSet {

    public static List<Producer> findByNameJdbcRowSet(String name) {

        String sql = "SELECT * FROM anime_store.producer WHERE NAME LIKE ?";
        List<Producer> producers = new ArrayList<>();

        try (JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()) {

            jrs.setCommand(sql);
            jrs.setString(1, String.format("%%%s%%", name));
            jrs.execute();

            while (jrs.next()) {
                producers.add(Producer.builder().id(jrs.getInt("id"))
                        .name(jrs.getString("name"))
                        .build());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return producers;
    }
}
