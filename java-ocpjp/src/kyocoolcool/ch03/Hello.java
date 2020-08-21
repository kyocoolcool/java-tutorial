package kyocoolcool.ch03;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Hello
 * @description
 * @date 2020/6/24 10:26 AM
 **/

public class Hello {
    public static void play(List<Morning> list) {
        list.forEach(System.out::println);
    }

    public static void test1(List<? extends Number> list) {
        for (Number number : list) {
            System.out.println(Integer.toString(number.intValue()));
        }
    }

    public static void test2(List<? super Integer> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {


//        final ArrayList arrayList = new ArrayList();
//        arrayList.add("new Morning()");
//        Hello.play(arrayList);
//        final ArrayList<Integer> list = new ArrayList();
//        list.add(5);
//        final Integer o = list.get(0);
//        System.out.println(o);
//        final ArrayList<String> strings = new ArrayList<String>();
//        final Integer[] integers = new Integer[1];
//        Object[] o = integers;
//        o[0] = "aa";
//        System.out.println(o[0]);
        final Hello hello = new Hello();
        final ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        hello.test1(nums);


        final ArrayList<? super Number> integers = new ArrayList<Number>();
        integers.add(1);
        integers.add(new Number() {
            @Override
            public int intValue() {
                return 0;
            }

            @Override
            public long longValue() {
                return 0;
            }

            @Override
            public float floatValue() {
                return 0;
            }

            @Override
            public double doubleValue() {
                return 0;
            }
        });
        Hello.test2(integers);


    }
}
