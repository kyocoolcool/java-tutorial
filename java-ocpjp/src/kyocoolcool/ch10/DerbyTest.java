package kyocoolcool.ch10;

import java.sql.*;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Ch10
 * @description
 * @since  2020/8/14 11:19 AM
 **/

public class DerbyTest {

    public static void main(String[] args) throws ClassNotFoundException {
        String url ="jdbc:derby://localhost:1527//Users/chris/tmpdb";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            System.out.println(conn.getClass().getName());
//            stmt.executeUpdate("CREATE TABLE species ("
//                    + "id INTEGER PRIMARY KEY, "
//                    + "name VARCHAR(255), "
//                    + "num_acres DECIMAL)");
//            stmt.executeUpdate(
//                    "CREATE TABLE animal ("
//                            + "id INTEGER PRIMARY KEY, "
//                            + "species_id integer, "
//                            + "name VARCHAR(255), "
//                            + "date_born TIMESTAMP)");
//          stmt.executeUpdate("INSERT INTO species VALUES (1, 'African Elephant', 7.5)");
//            System.out.println(timestamp);
//            stmt.executeUpdate("INSERT INTO animal VALUES (1, 1, 'Elsa',  '2020-08-14 17:04:10.315')");
//            stmt.executeUpdate("INSERT INTO animal VALUES (2, 2, 'Zelda', '2020-08-14 17:04:10.315')");
//            stmt.executeUpdate("INSERT INTO animal VALUES (3, 1, 'Ester', '2020-08-14 17:04:10.315')");
//            stmt.executeUpdate("INSERT INTO animal VALUES (4, 1, 'Eddie', '2020-08-14 17:04:10.315')");
//            stmt.executeUpdate("INSERT INTO animal VALUES (5, 2, 'Zoe', '2020-08-14 17:04:10.315')");
            final ResultSet rs = stmt.executeQuery("select name from animal");
            {
                while (rs.next()) {
                    System.out.println(rs.getString(1));
                }
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
