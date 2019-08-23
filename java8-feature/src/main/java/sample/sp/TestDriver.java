package sample.sp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

/**
 * @ClassName TestDriver
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-06-18 12:46
 * @Version 1.0
 **/

public class TestDriver {

        public static void main (String[] args) throws Exception {
            Connection conn = null;
            CallableStatement stmt = null;
            try {
                // IMPORTANT! The Derby driver e.g. derbyclient.jar must be on the classpath
                Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();

                // Connect to the database
                conn = DriverManager
                        .getConnection("jdbc:derby://localhost:1527/sample;user=APP;password=APP");

                // Create the CALL statement
                stmt = conn.prepareCall("CALL GETCUSTOMERLASTNAME( ?, ? )");
                // Bind the customer id to the first parameter
                stmt.setLong(1, 2);
                // Register the second parameter as an OUT parameter
                stmt.registerOutParameter(2, Types.VARCHAR);

                stmt.execute();

                // Print result in the OUT parameter - e.g. the customer's last name
                System.out.println(stmt.getString(2));
            } finally {
                // Release db resources
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            }
        }

}