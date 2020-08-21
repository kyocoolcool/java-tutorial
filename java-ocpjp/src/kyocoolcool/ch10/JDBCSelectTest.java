package kyocoolcool.ch10;

import java.sql.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.TimeZone;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className JDBCSelectTest
 * @description
 * @date 2020/8/17 6:37 PM
 **/

public class JDBCSelectTest {
    public static void main(String[] args) {
        String url = "jdbc:derby://localhost:1527//Users/chris/tmpdb";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement(ResultSet.CONCUR_READ_ONLY,2)) {
            System.out.println(conn.getClass().getName());
//            final ResultSet rs = stmt.executeQuery("select SPECIES_ID as SPECIES_ID from animal where SPECIES_ID=2");
            final ResultSet rs = stmt.executeQuery("select DATE_BORN  from animal where SPECIES_ID=2");
            {
                while (rs.next()) {
//                rs.next();
//                    System.out.println(rs.getDate("DATE_BORN"));
                    final Timestamp date_born = rs.getTimestamp("DATE_BORN");
                    System.out.println(LocalDateTime.ofInstant(Instant.ofEpochMilli(date_born.getTime()), TimeZone
                            .getDefault().toZoneId()));
                }
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}

