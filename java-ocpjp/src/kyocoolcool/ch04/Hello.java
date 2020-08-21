package kyocoolcool.ch04;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Hello
 * @description
 * @date 2020/7/20 5:25 PM
 **/

public class Hello {
    public final <R> List<R> hi(List<? super R> list) {
        list.remove(0);
        list.clear();
        return (List<R>) list;
    }

    public static void main(String[] args) {
        final Hello hello = new Hello();
        final ArrayList<Animal> integers = new ArrayList<>();
        integers.add(new Dog("aaa"));
        integers.add(new Dog("bbb"));
        integers.add(new Dog("ccc"));
        final List<Dog> hi = hello.hi(integers);
        System.out.println(hi);
    }
}
