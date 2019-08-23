package sample.sp;

import java.sql.*;

/**
 * @ClassName RowBackTest
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-06-18 15:23
 * @Version 1.0
 **/

public class RowBackTest {
    public static void main(String[] args) throws Exception {
        Connection conn = null;
        Statement statement = null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();

            conn = DriverManager
                    .getConnection("jdbc:derby://localhost:1527/sample;user=APP;password=APP");
            conn.setAutoCommit(false);
            statement = conn.createStatement();
            String sql = "insert into APP.MEMBER values(7,'AA','A') ";
            statement.executeUpdate(sql);
            Savepoint point = conn.setSavepoint("point");
            String sql2 = "insert into APP.MEMBER values(8,'BB','B') ";
            statement.executeUpdate(sql2);
            conn.rollback(point);
            conn.releaseSavepoint(point);
            String sql3 = "insert into APP.MEMBER values(9,'CC','C') ";
            statement.executeUpdate(sql3);
            conn.commit();

        } finally {
            // Release db resources
            if (statement != null) {
                statement.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }
}