package sample.sp;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

/**
 * @ClassName RowSetAddTest
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-06-18 14:28
 * @Version 1.0
 **/

public class RowSetAddTest {
    public static void main (String[] args) throws Exception {
        RowSetFactory factory = RowSetProvider.newFactory();
//        jdbcRs = new JdbcRowSetImpl();
//        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "APP", "APP");
        try (JdbcRowSet rowSet = factory.createJdbcRowSet()) {
//            rowSet.setAutoCommit(false);
            rowSet.setUrl("jdbc:derby://localhost:1527/sample");
            rowSet.setUsername("APP");
            rowSet.setPassword("APP");
            rowSet.setCommand("select * from APP.MEMBER");
//            Savepoint point1 = con.setSavepoint("point");
//            rowSet.setCommand("insert into APP.MEMBER values(5,'XX',F)");
//            rowSet.rollback(point1);
//            rowSet.commit();
            rowSet.execute();
            addEmployee(rowSet);
        }
    }
    private static void addEmployee(JdbcRowSet jdbcRowSet) throws SQLException {
        //Moves the cursor to the insert row.
        jdbcRowSet.moveToInsertRow();
        jdbcRowSet.updateInt("id", 5);
        jdbcRowSet.updateString("name", "XX");
        jdbcRowSet.updateString("sex", "M");

        //Inserts the contents of the insert row into this ResultSet object and into the database
        jdbcRowSet.insertRow();
        System.out.println("A new MEMBER is added..");
        //Moves the cursor to the front of this ResultSet object, just before the first row.
        jdbcRowSet.beforeFirst();
    }
}