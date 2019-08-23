package sample.sp;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

/**
 * @ClassName RowSetTest
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-06-18 14:03
 * @Version 1.0
 **/

public class RowSetTest {
    public static void main(String[] args) throws SQLException {
        RowSetFactory factory = RowSetProvider.newFactory();
        try (JdbcRowSet rowSet = factory.createJdbcRowSet()) {
            rowSet.setUrl("jdbc:derby://localhost:1527/sample");
            rowSet.setUsername("APP");
            rowSet.setPassword("APP");
            rowSet.setCommand("select * from APP.MEMBER where ID=?");
            rowSet.setInt(1, 1);
            rowSet.execute();
            while (rowSet.next()) {
                System.out.print(rowSet.getInt("ID") + ",");
                System.out.print(rowSet.getString("NAME") + ",");
                System.out.print(rowSet.getString("SEX"));
                System.out.println();
            }
        }

    }
}