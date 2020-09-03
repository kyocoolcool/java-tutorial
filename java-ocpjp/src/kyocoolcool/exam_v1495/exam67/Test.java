package kyocoolcool.exam_v1495.exam67;

import java.sql.*;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 1:45 PM
 **/
public class Test {
    public static void main(String[] args) {
        String url ="jdbc:derby://localhost:1527//Users/chris/tmpdb";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            System.out.println(conn.getClass().getName());
            final ResultSet rs = stmt.executeQuery("select * from item");
            {
                while (rs.next()) {
                    System.out.println("id:"+rs.getString(1));
                    System.out.println("describe:"+rs.getString(2));
                    System.out.println("price:"+rs.getString(3));
                    System.out.println("quantity:"+rs.getString(4));
                    System.out.println("date:"+rs.getString(5));
                    System.out.println("time:"+rs.getTime(6));
                    System.out.println("timeStamp:"+rs.getTimestamp(7));
                }
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
