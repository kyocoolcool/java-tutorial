package kyocoolcool.ch06;

import java.io.IOException;
import java.sql.SQLException;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test19
 * @description
 * @date 2020/7/27 11:34 AM
 **/

public class Test19 {
    public void hello() throws SQLException,IOException{

    }

    public void hi() throws SQLException {
        try {
            hello();
        } catch (IOException |SQLException e) {
            e.getMessage();
        }
    }
}
