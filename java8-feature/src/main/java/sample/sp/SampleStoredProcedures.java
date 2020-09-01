package sample.sp;

import java.sql.*;

/**
 * @ClassName SampleStoredProcedures
 *
 * @Author Chris Chen
 * @Date 2019-06-18 11:42
 * @Version 1.0
 **/

public class SampleStoredProcedures {
    public static void getCustomerLastNameById(long customerId, String[] customerLastName) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet res = null;

        try {
            // re-use the existing JDBC connection
            // IMPORTANT! "jdbc:default:connection" tells the DriverManager to use the existing connection.
            conn = DriverManager.getConnection("jdbc:default:connection");

            // prepare the query
            String sql = "SELECT LASTNAME FROM CUSTOMER WHERE ID = ?";
            stmt = conn.prepareStatement(sql);
            // bind parameters
            stmt.setLong(1, customerId);
            res = stmt.executeQuery();

            // set the result in OUT parameter
            // IMPORTANT: Notice that we never instantiate the customerLastName array.
            // The array is instead initialized and passed in by Derby, our SQL/JRT implementor
            customerLastName[0] = (res.next()) ? res.getString(1) : "Customer not Found.";
        } finally {
            if (res != null) {
                // close the result set
                res.close();
            }

            if (stmt != null) {
                // close the statement
                stmt.close();
            }

            if (conn != null) {
                // close the db connection
                conn.close();
            }
        }
    }
}