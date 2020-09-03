package kyocoolcool.exam_v1495.exam185;

import java.sql.*;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/1 下午 09:36
 **/
public class Test {
    public static void main(String[] args) {
        String url = "jdbc:derby://localhost:1527//Users/chris/tmpdb";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
            stmt.execute("SELECT * FROM Animal");
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                if
                (rs.getInt(1) == 7) {
                    rs.updateString(3, "Jack");
                    rs.updateRow();
                }
            }
            rs.absolute(6);
            System.out.println(rs.getInt(1) + " " + rs.getString(2)+" "+rs.getString(3));
        } catch (SQLException ex) {
//            System.out.println("Exception is raised");
            ex.printStackTrace();
        }
    }
}
