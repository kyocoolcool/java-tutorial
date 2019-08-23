package myjava8;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @ClassName ForTest
 * @Description TODO
 * @Author chris
 * @Date 2019-02-15 16:13
 * @Version 1.0
 **/

public class ForTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        for (int i = 1; i <=list.size(); ++i) {
            System.out.println(i);
        }

        System.out.println("----------------");

        for (Integer i : list) {
            System.out.println(i);
        }

        System.out.println("----------------");

        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        System.out.println("----------------");

        list.forEach(integer -> System.out.println(integer));

        System.out.println("----------------");

        List<String> list2 = Arrays.asList("hello", "yes", "no");

        list2.forEach(item -> System.out.println(item.toUpperCase()));

        System.out.println("1----------------");

        List<Object> arrayList = new ArrayList<>();
        list2.forEach(item -> arrayList.add(item.toUpperCase()));
        arrayList.forEach(item -> System.out.println(item));

        System.out.println("2----------------");

        list2.stream().map(item -> item.toUpperCase()).forEach(item -> System.out.println(item));

        System.out.println("3----------------");

        list2.stream().map(String::toString).forEach(item -> System.out.println(item));

        System.out.println("4----------------");

        Function<String,String> function=String::toString;
        System.out.println(function.getClass().getInterfaces()[0]);
    }
}