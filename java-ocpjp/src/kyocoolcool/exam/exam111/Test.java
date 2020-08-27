package kyocoolcool.exam.exam111;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/27 3:26 PM
 **/
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        String url ="jdbc:derby://localhost:1527//Users/chris/tmpdb";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            System.out.println(conn.getClass().getName());
//            final boolean execute = stmt.execute("delete  from animal where species_id=2");
//            final boolean execute = stmt.execute("insert into animal values(5,1,'chris','2020-08-27 12:00:00')");
            final boolean execute = stmt.execute("select *  from animal where species_id=2");
            System.out.println(execute);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
