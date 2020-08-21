package kyocoolcool.ch03;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test14
 * @description
 * @date 2020/7/14 2:44 PM
 **/

public class Test14 implements Comparable<Test14>, Comparator<Test14> {
    String text;
    int number;

    public Test14() {
    }

    public Test14(String text, int number) {
        this.text = text;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Test14{" +
                "number=" + number +
                '}';
    }

    @Override
    public int compareTo(Test14 o) {
        return text.compareTo(o.text);
    }

    @Override
    public int compare(Test14 o1, Test14 o2) {
        return o1.number-o2.number;
    }

    public static void main(String[] args) {
        final Test14 a = new Test14("a", 88);
        final Test14 b = new Test14("b", 55);
        final TreeSet<Test14> treeSet = new TreeSet();
        treeSet.add(a);
        treeSet.add(b);
        System.out.println(treeSet);
        final TreeSet<Test14> treeSet1 = new TreeSet(a);
        treeSet1.add(a);
        treeSet1.add(b);
        System.out.println(treeSet1);
    }
}
