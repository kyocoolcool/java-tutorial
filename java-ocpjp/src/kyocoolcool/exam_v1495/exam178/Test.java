package kyocoolcool.exam_v1495.exam178;

import java.sql.*;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/1 下午 05:42
 **/
public class Test {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:derby://localhost:1527//Users/chris/tmpdb";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            stmt.executeUpdate("INSERT INTO animal VALUES (11, 3,'Zoe', '2020-08-14 17:04:10.315')");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
