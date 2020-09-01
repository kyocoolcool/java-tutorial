package ocajp.IO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @ClassName DerbyJDBCTest
 * 
 * @Author Chris Chen
 * @Date 2019-06-17 11:33
 * @Version 1.0
 **/

public class DerbyJDBCTest {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:" + "derby://localhost:1527/sample", "app", "app");) {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}