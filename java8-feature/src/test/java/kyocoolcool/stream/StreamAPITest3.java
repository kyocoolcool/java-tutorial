package kyocoolcool.stream;

import kyocoolcool.bean.Employee;
import org.junit.Test;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @ClassName StreamAPITest3
 * @Description
 * 查找與匹配
 * allMatch:檢查是否匹配所有元素
 * anyMatch:檢查至少匹配一個元素
 * noneMatch:檢查是否沒有匹配所有元素
 * findFirst:返回第一個元素
 * fineAny:返回當前流的任一元素
 * count:返回流中元素總個數
 * max:返回流中最大值
 * min:返回流中最小值
 *
 *
 * @Author chris
 * @Date 2019-04-07 19:29
 * @Version 1.0
 **/

public class StreamAPITest3 {
    List<Employee> list = Arrays.asList(
            new Employee(1,"Chris",20,100.0, Employee.Status.BUSY),
            new Employee(2,"Jack",30,200.0,Employee.Status.VOCATION),
            new Employee(3,"Nick",40,300.0,Employee.Status.BUSY),
            new Employee(4,"Mary",50,400.0,Employee.Status.FREE),
            new Employee(5,"Mary",50,400.0,Employee.Status.FREE),
            new Employee(6,"Cary",50,500,Employee.Status.FREE)
    );
    @Test
    public void test1(){
        boolean b = list.stream().allMatch(e -> e.getStatus().equals(Employee.Status.BUSY));
        System.out.println(b);
        System.out.println("----------------");
        boolean b1 = list.stream().anyMatch(e -> e.getStatus().equals(Employee.Status.BUSY));
        System.out.println(b1);
        System.out.println("----------------");
        boolean b2 = list.stream().noneMatch(e -> e.getStatus().equals(Employee.Status.BUSY));
        System.out.println(b2);
        System.out.println("----------------");
        Optional<Employee> first = list.stream().sorted((e1, e2) -> -Double.compare(e1.getSalary(), e2.getSalary())).findFirst();
        System.out.println(first.get());
        System.out.println("----------------");
        Optional<Employee> any = list.stream().filter(e1 -> e1.getStatus().equals(Employee.Status.BUSY)).findAny();
        System.out.println(any.get());
        System.out.println("----------------");
        Optional<Employee> any2 = list.parallelStream().filter(e1 -> e1.getStatus().equals(Employee.Status.BUSY)).findAny();
        System.out.println(any2.get());
        System.out.println("----------------");
        long count = list.stream().count();
        System.out.println(count);
        System.out.println("----------------");
        Optional<Employee> max = list.stream().max((x1, x2) -> Double.compare(x1.getSalary(), x2.getSalary()));
        System.out.println(max.get());
        System.out.println("----------------");
        Optional<Double> min = list.stream().map(Employee::getSalary).min(Double::compareTo);
        System.out.println(min.get());

    }

    /**
     * @Author chris
     * @Description
     * 規約:
     * reduce(identity,BinaryOperator)/reduce(BinaryOperator):將流中反覆結合起來得到一個值
     * @Date 23:49 2019-04-07
     * @Param
     * @return void
     **/
    @Test
    public void test2(){
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer reduce = list2.stream().reduce(0, (x, y) -> x + y);
        System.out.println(reduce);
        System.out.println("-------------");
        Optional<Double> reduce1 = list.stream().map(Employee::getSalary).reduce(Double::sum);
        System.out.println(reduce1.get());

    }

    /**
     * @Author chris
     * @Description
     *
     * 收集:
     * collect:將流轉換為其他形式，接收一個Collect接口的實現，用於給stream中元素作總匯的方法
     * @Date 23:50 2019-04-07
     * @Param
     * @return void
     **/
    @Test
    public void  test3(){
        list.stream().map(Employee::getName).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("----------");
        list.stream().map(Employee::getName).collect(Collectors.toSet()).forEach(System.out::println);
        System.out.println("----------");
        HashSet<String> hashSet = list.stream().map(Employee::getName).collect(Collectors.toCollection(HashSet::new));
        hashSet.forEach(System.out::println);
    }

    @Test
    public void test4(){
        //總數
        Long collect = list.stream().collect(Collectors.counting());
        System.out.println(collect);
        System.out.println("-------------");
        //平均值
        Double avg = list.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println(avg);
        System.out.println("-------------");
        //總和
        Double sum = list.stream().collect(Collectors.summingDouble(Employee::getSalary));
        System.out.println(sum);
        System.out.println("-------------");
        //最大值
        Optional<Employee> collect1 = list.stream().collect(Collectors.maxBy((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())));
        System.out.println(collect1.get());
        System.out.println("-------------");
        //最小值
        Optional<Double> min = list.stream().map(Employee::getSalary).collect(Collectors.minBy(Double::compareTo));
        System.out.println(min);
    }

    /**
     * @Author chris
     * @Description
     * 分組
     *
     * @Date 00:31 2019-04-08
     * @Param
     * @return void
     **/
    @Test
    public void test5(){
        Map<Employee.Status, List<Employee>> collect = list.stream().collect(Collectors.groupingBy(Employee::getStatus));
        collect.get(Employee.Status.BUSY).forEach(System.out::println);
        System.out.println("-------------");
        System.out.println(collect);
    }

    /**
     * @Author chris
     * @Description
     * 多級分組
     *
     * @Date 08:58 2019-04-08
     * @Param
     * @return void
     **/
    @Test
    public void test6(){
        Map<Employee.Status, Map<String, List<Employee>>> mapMap = list.stream().collect(Collectors.groupingBy(Employee::getStatus, Collectors.groupingBy((e) -> {
            if (e.getAge() <= 35) {
                return "青年";
            } else if (e.getAge() <= 50) {
                return "壯年";
            } else
                return "老年";
        })));
        System.out.println(mapMap);
    }
    /**
     * @Author chris
     * @Description
     * 分區
     *
     * @Date 09:14 2019-04-08
     * @Param
     * @return void
     **/
    @Test
    public void test7(){
        Map<Boolean, List<Employee>> listMap = list.stream().collect(Collectors.partitioningBy(e -> e.getSalary() <= 200));
        System.out.println(listMap);
    }

    /**
     * @Author chris
     * @Description
     * Collectors.summarizingDouble:另種運算總和
     * @Date 09:17 2019-04-08
     * @Param
     * @return void
     **/
    @Test
    public void  test8(){
        DoubleSummaryStatistics collect = list.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(collect.getAverage());
        System.out.println(collect.getMax());
        System.out.println(collect.getMin());
        System.out.println(collect.getSum());

    }

    /**
     * @Author chris
     * @Description
     * 字串拼接
     *
     * @Date 09:20 2019-04-08
     * @Param
     * @return void
     **/
    @Test
    public void test9(){
        String collect = list.stream().map(Employee::getName).collect(Collectors.joining(",","------","-----"));
        System.out.println(collect);
    }

}