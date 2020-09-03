package kyocoolcool.exam_v1495.exam184;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/1 下午 09:07
 **/
public class Test implements Comparable<Test> {
    String name;

    public Test(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(@NotNull Test o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        final ArrayList<Test> tests = new ArrayList<Test>();
        tests.add(new Test("Hello"));
        tests.add(new Test("Apple"));
        Collections.sort(tests);
        System.out.println(tests);
//        final Test hello = new Test("Hello");
//        final Test hello2 = new Test("Apple");
//        final int i = hello2.compareTo(hello);
//        System.out.println(i);
    }
}