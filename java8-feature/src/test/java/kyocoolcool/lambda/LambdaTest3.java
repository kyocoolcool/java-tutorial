package kyocoolcool.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @ClassName LambdaTest3
 * @Description Java 內置的四大核心函數式接口
 * Consumer <T> :消費型接口
 *              void accept(T t);
 * Supplier <T> :供給型接口
 *              T get();
 * Function <T,R> :函數型街口
 *              R apply(T t);
 * Predicate <T> :斷言行接口
 *              Boolean ExceptionTest(T t);
 *
 * @Author chris
 * @Date 2019-04-03 09:04
 * @Version 1.0
 **/

public class LambdaTest3 {
    @Test
    public void test1(){
        happy((double) 10000, m-> System.out.println("I get money: "+m+" NT"));
    }

    public void happy(Double money, Consumer<Double> con){
        con.accept(money);
    }

    public List<Integer> getNumberList(Integer num, Supplier<Integer> sup){
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer i = 0; i < num; i++) {
            list.add(sup.get());
        }
        return list;
    }

    @Test
    public void test2(){
        List<Integer> result=getNumberList(5, () ->  (int)(Math.random()*100));
        result.forEach((a)-> System.out.println(a));
//        for (Integer integer : result) {
//            System.out.println(integer);
//        }

    }

   public String strHandler(String str, Function<String,String> fun){
       return fun.apply(str);
   }

   @Test
   public void test3(){
        String trimStr=strHandler("\t\t\t\t I like money    ",(x)->x.trim());
       System.out.println(trimStr);
   }


   public List<String> strFilter(List<String> list, Predicate<String> pre){
       List<String> strings = new ArrayList<>();
       list.forEach((x)-> {
           if(pre.test(x))
           strings.add(x);
       });
       return strings;
   }

    @Test
   public void test4(){
        List<String> listStr=strFilter(Arrays.asList("Hello","HiHi","你好"),(x)->x.length()>3);
       listStr.forEach(x-> System.out.println(x));
   }
}