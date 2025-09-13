package devdojo.maratona.java.javacore.ZZIjdbc.conn;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    // java.sql = Connection, Statement, ResultSet, DriverManager

    public static Connection getConnection() {

        Connection conn = null;

        String url = "jdbc:mysql://localhost:3306/anime_store";
        String username = "root";
        String password = "secret";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            System.out.println(connection);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static JdbcRowSet getJdbcRowSet() throws SQLException{

        String url = "jdbc:mysql://localhost:3306/anime_store";
        String username = "root";
        String password = "secret";

        JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
        jdbcRowSet.setUrl(url);
        jdbcRowSet.setUsername(username);
        jdbcRowSet.setPassword(password);
        return jdbcRowSet;
    }
}
