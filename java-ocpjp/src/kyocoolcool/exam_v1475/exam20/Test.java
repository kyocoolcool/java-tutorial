package kyocoolcool.exam_v1475.exam20;

import lombok.extern.java.Log;

import java.util.ArrayList;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/4 4:46 PM
 **/

class Alpha {
    public String doStuff(String msg) {
        return msg;
    }
}
class  Beta extends Alpha {
    public String doStuff(String msg) {
        return msg.replace('a','e');
    }
}

class  Gamma extends Beta {
    public String doStuff(String msg) {
        return msg.substring(2);
    }
}
@Log
public class Test {
    public static void main(String[] args) {
        final ArrayList<Alpha> list = new ArrayList<>();
        list.add(new Alpha());
        list.add(new Beta());
        list.add(new Gamma());
        for (Alpha alpha : list) {
            log.info(alpha.doStuff("Java"));
        }
    }
}
