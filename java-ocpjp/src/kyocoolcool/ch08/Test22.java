package kyocoolcool.ch08;

import java.io.Serializable;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test22
 * @description
 * @date 2020/8/7 2:05 PM
 **/

public class Test22  implements Serializable {
    public Test22() {
    }

    public Test22(String name) {
        this.name = name;
    }

     String name="AAA";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test22{" +
                "name='" + name + '\'' +
                '}';
    }
}
