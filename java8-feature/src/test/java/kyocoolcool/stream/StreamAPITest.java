package kyocoolcool.stream;

import kyocoolcool.bean.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @ClassName StreamAPITest
 * @Description
 * Stream三個操作步驟:
 * 1.創建Stream
 *
 * 2.中間操作
 *
 * 3.終止操作(終端操作)
 *
 * @Author chris
 * @Date 2019-04-05 18:24
 * @Version 1.0
 **/

public class StreamAPITest {
    /**
     * @Author chris
     * @Description
     * @Date 18:30 2019-04-05
     * @Param
     * @return void
     **/
    @Test
    public void test1(){
//        1.可以通過Collection系列集合提供的stream()方法或parallelStream()
        ArrayList<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();
//        2.通過Arrays中的靜態方法stream()獲取數組流
        Employee[] employees = new Employee[10];
        Stream<Employee> stream1 = Arrays.stream(employees);
//        3.透過Stream類中的靜態方法 of()
        Stream<String> stream2 = Stream.of("aa", "bb", "cc");
//        4.創建無限流
//        迭代
        Stream<Integer> stream3 = Stream.iterate(0, (x) -> x + 2);
//        stream3.forEach(System.out::println);
//        stream3.limit(10).forEach(System.out::println);
//        生成
        Stream.generate(() -> Math.random()).limit(10).forEach(System.out::println);


    }
}