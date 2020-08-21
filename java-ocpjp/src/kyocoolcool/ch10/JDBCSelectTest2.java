package kyocoolcool.ch10;

import java.sql.*;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className JDBCSelectTest
 * @description
 * @date 2020/8/17 6:37 PM
 **/

public class JDBCSelectTest2 {
    public static void main(String[] args) {
        String url = "jdbc:derby://localhost:1527//Users/chris/tmpdb";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
            System.out.println(conn.getClass().getName());
            final ResultSet rs = stmt.executeQuery("select id  from animal");
            {
                rs.next();
                rs.previous();
                rs.previous();
                rs.previous();
                rs.previous();
                rs.first();
                rs.relative(2);
//                rs.next();
//                rs.next();
                System.out.println(rs.getInt("id"));
                rs.relative(-1);
                final Integer id = rs.getInt("id");
                System.out.println(id);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

