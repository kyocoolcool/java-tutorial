package kyocoolcool.lambda;

import kyocoolcool.Generic;
import kyocoolcool.MyFun;
import org.junit.Test;

import java.util.*;
import java.util.function.Consumer;

/**
 * @ClassName LambdaTest
 * @Description TODO
 * @Author chris
 * @Date 2019-03-24 20:43
 * @Version 1.0
 * Lambda表達式:
 * 左側L:Lambda表達式參數列表
 * 右測:Lambda表達式所需執行的功能，稱Lambda體
 * 語法格式1:無參數，無返回值
 * ()->System.out.print("Hello Lambda!");
 *
 * 語法格式2:有1參數，無返回值
 * (x) -> System.out.println(x);
 *
 * 語法格式3:若只有1參數，參數小括弧可以不寫，無返回值
 * x -> System.out.println(x);
 *
 * 語法格式4:有2以上參數，Lambda有多條語句
 *  Comparator<Integer> com=(x1,x2)->{
 *             System.out.println("comparetor ExceptionTest");
 *             return x1.compareTo(x2);
 *         };
 *
 * 語法格式5:若Lambda只有一條語句 return和大括號都可以省略
 * Comparator<Integer> com=(x1,x2)-> Integer.compare(x1,x2);
 *
 * 語法格式6:Lambda表達式的數據類型可省略，因為JVM編譯器可以通過上下文推斷數據類型，"即類型推斷"
 * Comparator<Integer> com = (Integer x1,Integer x2) -> Integer.compare(x1, x2);
 *
 * 上聯:左右遇一，括號省
 * 下聯:左側推斷，類型省
 * 橫批:能省則省
 *
 * Lambda表達式需要函數式接口的支持
 * 函數式接口:Interface中只有一個抽象方法，稱為函數式接口，可以使用@FunctionInterface修飾:
 * 可以檢查是不是函數式接口
 **/

public class LambdaTest {
    @Test
    public void test1(){
        int num=0;//在1.7前必須+final到1.8本質還是一樣，默認定義了final在匿名類中不能改變其值
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Lambda Test1!"+num);
            }
        };
        r1.run();
        System.out.println("------------------");

        Runnable r2 = () -> System.out.println("Hello Lambda Test2!"+num);
        r2.run();
    }

    @Test
    public void test2(){
        Consumer<String> con = (x) -> System.out.println(x);
        con.accept("我思故我在");
    }

    @Test
    public void test3(){
        Consumer<String> con = x -> System.out.println(x);
        con.accept("我思故我在");
    }

    @Test
    public void test4(){
        Comparator<Integer> com=(x1,x2)->{
            System.out.println("comparetor ExceptionTest");
            return x1.compareTo(x2);
        };

        System.out.println(com.compare(3, 5));
    }

    @Test
    public void test5(){
        Comparator<Integer> com=(x1,x2)-> Integer.compare(x1,x2);
        System.out.println(com.compare(8,6));
    }

    public void test6(){
        Comparator<Integer> com = (Integer x1,Integer x2) -> Integer.compare(x1, x2);
    }

    @Test
    public void test7(){
        Generic<Integer> genericInteger = new Generic<Integer>(123456);

//传入的实参类型需与泛型的类型参数类型相同，即为String.
        Generic<String> genericString = new Generic<String>("key_vlaue");
        System.out.println("泛型测试 key is " + genericInteger.getKey());
        System.out.println("泛型测试 key is " + genericString.getKey());
    }

    @Test
    public void test8(){
        Map<String, String> objectObjectHashMap = new HashMap<String, String>();
        objectObjectHashMap.put("123", "789");
        show(objectObjectHashMap);
    }


    public void show(Map<String,String> map){
        System.out.println(map.get("123"));
    }

    public Integer operation (Integer num, MyFun myFun){
         return myFun.getValue(num);
    }


    //對一個數進行運算
    @Test
    public void test9(){
        Integer result=operation(100, (x) -> x * x);
        System.out.println(result);
        Integer result2=operation(200, (y) -> y + y);
        System.out.println(result2);
    }
}