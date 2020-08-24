package kyocoolcool.exam.exam24;

import java.sql.*;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/24 5:37 PM
 **/
public class Test {
    public static void main(String[] args) throws SQLException {
        String url ="jdbc:derby://localhost:1527//Users/chris/tmpdb";
        Connection conn = DriverManager.getConnection(url);
        final Statement stmt = conn.createStatement();
        final ResultSet rs = stmt.executeQuery("select * from Animal where ID=3");
//        rs.next();
//        final String name = rs.getString("name");
        final Integer id = rs.getInt("ID");
        System.out.println(id);
    }
}
