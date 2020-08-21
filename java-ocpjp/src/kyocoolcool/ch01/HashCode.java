package kyocoolcool.ch01;

import java.util.Objects;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className HashCode
 * @description
 * @date 2020/6/18 11:57 AM
 **/

public class HashCode {
    private String name;

    public HashCode() {
    }

    public HashCode(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashCode hashCode = (HashCode) o;
        return Objects.equals(name, hashCode.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }



    public static void main(String[] args) {
        HashCode hashCode = new HashCode("chris");
        HashCode hashCode2 = new HashCode("nick");
        System.out.println(hashCode.hashCode());
        System.out.println(hashCode2.hashCode());
    }
}
