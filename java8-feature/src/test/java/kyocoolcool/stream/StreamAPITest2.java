package kyocoolcool.stream;

import kyocoolcool.bean.Employee;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @ClassName StreamAPITest2
 * @Description
 * 篩選與切片
 * filter:接收lambda從stream排除某些元素
 * limit(n):截斷stream，使其元素不超過給定數量
 * skip(n):跳過元素，返回扔掉前n個元素的stream，若元素不足n個，則返回空的stream，與limit(n)互補
 * distinct:刪選，通過stream所生成元素的hashCode()和equals()去除重複元素
 *
 * 映射
 * map:接收lambda，將元素轉換成其他形式或提取信息，接收一個函數作為參數，該函數會被運用到每個元素上，並將其映射為新元素
 * flatMap:接收一個函數作為參數，將stream中的每個值都換成另一個stream，然後把所有stream連成一個stream
 *
 * @Author chris
 * @Date 2019-04-05 22:35
 * @Version 1.0
 **/

public class StreamAPITest2 {
    List<Employee> list = Arrays.asList(
            new Employee(1,"Chris",20,100.0),
            new Employee(2,"Jack",30,200.0),
            new Employee(3,"Nick",40,300.0),
            new Employee(4,"Mary",50,400.0),
            new Employee(4,"Mary",50,400.0),
            new Employee(4,"Mary",50,400.0)
           );

    //內部迭代:由Stream API 完成
    @Test
    public void test1(){
//        中間操作:不會執行任何操作
        Stream<Employee> employeeStream = list.stream()
//                .filter(Employee::getAgeBig);
                .filter((e) -> {
                    System.out.println("Stream API中間操作");
                    return e.getAge() > 35;});
//        終止操作:一次性執行全部操作，即"惰性求值"
        employeeStream.forEach(System.out::println);
    }

    //外部迭代
    @Test
    public void test2(){
        Iterator<Employee> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test3(){
        list.stream().filter((e) -> e.getSalary() >= 100).limit(5).forEach(System.out::println);

    }

    @Test
    public void test4(){
        list.stream().filter(e->e.getSalary()>=100).skip(2).distinct().forEach(System.out::println);
    }

    @Test
    public void test5() {
        List<String> list2 = Arrays.asList("aaa", "bbb", "ccc", "ddd");
        list2.stream().map((x) -> x.toUpperCase()).forEach(System.out::println);
        System.out.println("----------------");
        list.stream().map(Employee::getName).forEach(System.out::println);
        System.out.println("----------------");
        Stream<Stream<Character>> streamStream = list2.stream().map(StreamAPITest2::filterCharacter);
        streamStream.forEach(
                (e)->{e.forEach(System.out::println);
//                (e)->{e.forEach(x-> System.out.println(x));
                });
        System.out.println("----------------");
        Stream<Character> characterStream = list2.stream().flatMap(StreamAPITest2::filterCharacter);
        characterStream.forEach(System.out::println);

    }

    public static Stream<Character> filterCharacter(String str) {
        ArrayList<Character> list3 = new ArrayList<>();
        for (Character character : str.toCharArray()) {
            list3.add(character);
        }
        return list3.stream();
    }

//    中間操作
//    sorted():自然排序(Comparable)
//    sorted(Comparator com):訂製排序(Comparator)
        @Test
        public void test6(){
            List<String> list2 = Arrays.asList("aaa", "bbb", "ccc", "ddd");
            list2.stream().sorted().forEach(System.out::println);
            list.stream().sorted((e1,e2)->{
                if(e1.getAge().equals(e2.getAge())){
                    return e1.getName().compareTo(e2.getName());
                } else return -e1.getAge().compareTo(e2.getAge()); //加負號倒著排
            }).forEach(System.out::println);
        }


}