package kyocoolcool.stream;

import kyocoolcool.bean.Trader;
import kyocoolcool.bean.Transaction;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName TransactionTest
 * @Description
 *
 * @Author chris
 * @Date 2019-04-08 19:39
 * @Version 1.0
 **/
public class TransactionTest {

    List<Transaction> transactions=null;
//
    @Before
    public void before() {
        Trader trader1 = new Trader("aee", "Taipei");
        Trader trader2 = new Trader("bCb", "Beijing");
        Trader trader3 = new Trader("def", "Shanghai");
        Trader trader4 = new Trader("Qdd", "Taipei");

                 transactions = Arrays.asList(
                new Transaction(trader1, 2011, 500),
                new Transaction(trader1, 2012, 200),
                new Transaction(trader3, 2011, 300),
                new Transaction(trader3, 2012, 300),
                new Transaction(trader4, 2011, 400)
        );
    }


    //1.找出2011年所有交易，並按交易額排序(由低到高)
    @Test
    public void test1(){
        transactions.stream()
                .filter((x)->x.getYear()==2011)
                .sorted((x1,x2)->-Integer.compare(x1.getValue(),x2.getValue()))
//                .sorted(Comparator.comparingInt(Transaction::getValue))
                .forEach(System.out::println);
    }

    //2.交易員都在哪些不同城市工作
    @Test
    public void test2(){
        transactions.stream().map((x)->x.getTrader().city).distinct().forEach(System.out::println);
    }

    //3.查找所有來自台北的交易員，並按姓名排序
    @Test
    public void test3(){
         transactions.stream().filter(
                (x) -> x.getTrader().city.equals("Taipei")).sorted(Comparator.comparing(x -> x.getTrader().name)).distinct().forEach(System.out::println);
    }

    //4.返回所有交易員姓名字符串，按字母順序排序
    @Test
    public void test4(){
        transactions.stream().map(Transaction::getTrader).map(Trader::getName).distinct().sorted().forEach(System.out::println
        );
        System.out.println("---------------------");
        String reduce = transactions.stream().map((x) -> x.getTrader().getName()).sorted().reduce("",(x1,x2)->x1.concat(x2));
        String reduce2 = transactions.stream().map((x) -> x.getTrader().getName()).sorted().reduce("",String::concat);
        System.out.println(reduce);
        System.out.println(reduce2);
        System.out.println("---------------------");
        transactions.stream().map(Transaction::getTrader).map(Trader::getName).flatMap(TransactionTest::charFilter).sorted((x1,x2)->x1.compareToIgnoreCase(x2)).forEach(System.out::print);
    }

    public  static Stream<String> charFilter(String str){
        ArrayList<String> ch = new ArrayList<>();
        for (Character c : str.toCharArray()) {
            ch.add(c.toString());
        }
        return ch.stream();
    }

    //5.有沒有交易員在台北工作
    @Test
    public void test5(){
        boolean anyMatch = transactions.stream().anyMatch((x) -> x.getTrader().city.equals("Taipei"));
        System.out.println(anyMatch);
    }

    //6.打印生活在台北交易員的所有交易額
    @Test
    public void test6(){
        long sum = transactions.stream().filter((x) -> x.getTrader().getCity().equals("Taipei")).collect(Collectors.summarizingInt((x) -> x.getValue())).getSum();
        System.out.println(sum);
        System.out.println("----------");
        Optional<Integer> op = transactions.stream().filter(x -> x.getTrader().city.equals("Taipei")).map(Transaction::getValue).reduce(Integer::sum);
        System.out.println(op.get()
        );
    }

    //所有交易中最高的金額
    @Test
    public void test7(){
        Optional<Integer> max = transactions.stream().map(Transaction::getValue).max(Integer::compare);
        System.out.println(max.get());
    }

    //找到最小的交易
    @Test
    public void test8(){
        Optional<Transaction> op = transactions.stream().min(Comparator.comparingInt(Transaction::getValue));
        System.out.println(op.get());
    }

}