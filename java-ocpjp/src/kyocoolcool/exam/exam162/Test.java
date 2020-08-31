package kyocoolcool.exam.exam162;

import java.sql.*;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/31 2:00 PM
 **/
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        String url ="jdbc:derby://localhost:1527//Users/chris/tmpdb";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {

            final ResultSet rs = stmt.executeQuery("select * from animal");
            rs.absolute(2);
//            rs.moveToInsertRow();
//            rs.updateInt(1, 11);
            rs.updateInt(2, 4);
//            rs.insertRow();
            rs.updateRow();
            rs.refreshRow();
            System.out.println(rs.getInt(1) + " ," + rs.getString(2));
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
