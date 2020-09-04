package kyocoolcool.exam_v1475.exam6;

import java.sql.*;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/4 2:45 PM
 **/
public class Test {
    public static void main(String[] args) {
        String url = "jdbc:derby://localhost:1527//Users/chris/tmpdb";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
            final ResultSet rs = stmt.executeQuery("select * from \"Employee\"");
            while (rs.next()) {
                if (rs.getInt(1) == 112) {
                    rs.updateString(2, "JACK");
//                    rs.updateRow();
                }
            }
            rs.absolute(2);
            System.out.println(rs.getInt(1) + "   " + rs.getString(2));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
