package kyocoolcool.methodRef;

import kyocoolcool.bean.Employee;
import org.junit.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.*;

/**
 * @ClassName MethodRefTest
 * @Description
 * 一、方法引用
 * 若Lambda體中的內容，有方法已經實現了，就能使用"方法引用"
 * （可以理解方法引用是Lambda表達式的另外一種形式)
 * 主要有三種語法格式
 * 對象::實例方法名
 *
 * 類::靜態方法名
 *
 * 類::實例方法名
 *
 * 注意1: Lambda 體中的調用方法參數列表中與返回值類型，要與函數式接口中抽象方法的參數列表和返回值類型保持一致
 * 注意2: 若Lambda 體中參數列表的第一個參數 是方法調用者，而第二個參數是實例方法的參數時，就可以使用 ClassName::method
 *
 * 二、構造器引用
 * 格式
 * ClassName::new
 *
 * 注意:需要調用的構造器參數列表要與函數式接口抽象方法參數列表保持一致
 *
 * 三、數組引用
 * 格式
 * Type::new
 *
 * @Author chris
 * @Date 2019-04-04 23:04
 * @Version 1.0
 **/

public class MethodRefTest {
    /**
     * @Author chris
     * @Description 對象::實例方法名
     * @Date 23:28 2019-04-04
     * @Param
     * @return void
     **/
    @Test
    public void test1(){
        Consumer<String> con = x -> System.out.println(x);

        PrintStream ps =System.out;
        Consumer<String> con1=ps::println;
        Consumer<String> con2=System.out::println;
        con2.accept("abcdefg");
    }

    @Test
    public void test2(){
        Employee emp = new Employee();
        emp.setName("Chris");
        emp.setAge(18);
        Supplier<String> sup = () -> emp.getName();
        String s = sup.get();
        System.out.println(s);

        Supplier<Integer> sup2=emp::getAge;
        Integer s1 = sup2.get();
        System.out.println(s1);
    }

    /**
     * @Author chris
     * @Description 類::靜態方法名
     * @Date 00:02 2019-04-05
     * @Param
     * @return void
     **/
    @Test
    public void test3(){
        Comparator<Integer> com = (x1, x2) -> Integer.compare(x1, x2);
        Comparator<Integer> compare = Integer::compare;
        Integer value=compare.compare(50, 20);
        System.out.println(value);

    }

    /**
     * @Author chris
     * @Description 類::實例方法名
     * @Date 00:12 2019-04-05
     * @Param
     * @return void
     **/
    @Test
    public void test4(){
        BiPredicate<String,String> bp=(x1,x2)->x1.equals(x2);
        Boolean a=bp.test("hi","hi");
        System.out.println("Ans: "+a);
        BiPredicate<String, Object> biFunction = String::equals;
        biFunction.test("hello", "hello");


    }

    /**
     * @Author chris
     * @Description 構造器引用(無參)
     * @Date 00:26 2019-04-05
     * @Param
     * @return void
     **/
    @Test
    public void test5(){
        Supplier<Employee> sup = () -> new Employee();
        Supplier<Employee> sup2 = Employee::new;
        Employee employee = sup2.get();
        System.out.println(employee);
    }

    @Test
    public void test6(){
        Function<Integer, Employee> fun = (x) -> new Employee(x);
        Function<Integer, Employee> fun2 = Employee::new;
        Employee  emp=fun2.apply(2);
        System.out.println(emp);

        BiFunction<Integer,Integer,Employee>bif=Employee::new;
        System.out.println(bif.apply(20,30));
    }

    @Test
    public void test7(){
        Function<Integer,String[]> fun=(x)->new String[x];
        String a[]=fun.apply(10);
        System.out.println(a.length);

        Function<Integer,String[]> fun2 = String[]::new;
        System.out.println(fun2.apply(100).length);

    }
}
