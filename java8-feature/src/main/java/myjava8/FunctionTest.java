package myjava8;

import java.util.function.Function;

/**
 * @ClassName FunctionTest
 * 
 * @Author chris
 * @Date 2019-02-19 09:38
 * @Version 1.0
 **/

public class FunctionTest {
    public static void main(String[] args) {
        String a="abcdefghijk";
        System.out.println(a.length());
        FunctionTest functionTest = new FunctionTest();
        System.out.println(functionTest.excute(2,item -> item+1));
        System.out.println(functionTest.excute(2,item ->{return item*2;}));
        System.out.println(functionTest.convert(5,item->String.valueOf(item+" HelloWorld")));
    }

    public Integer excute(Integer a, Function<Integer,Integer> b){
        return b.apply(a);
    }

    public String convert(Integer a,Function<Integer,String> b){
        return b.apply(a);
    }
}