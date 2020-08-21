package kyocoolcool.ch08;

import java.io.Serializable;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Dog
 * @description
 * @date 2020/8/6 10:31 AM
 **/

public class Dog  implements Serializable {
    private String hobby;

    public Dog(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "hobby='" + hobby + '\'' +
                '}';
    }
}
