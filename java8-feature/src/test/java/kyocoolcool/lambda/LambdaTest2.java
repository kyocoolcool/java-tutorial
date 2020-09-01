package kyocoolcool.lambda;

import kyocoolcool.MyFunction;
import kyocoolcool.MyFunction2;
import kyocoolcool.bean.Employee;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName LambdaTest2
 * 
 * @Author chris
 * @Date 2019-03-30 13:33
 * @Version 1.0
 **/

public class LambdaTest2 {


    @Test
    public void test1(){
        List<Employee> employees= Arrays.asList(
                new Employee(101,"Chris",20,2000.1),
                new Employee(102,"Mandy",30,1990.1),
                new Employee(103,"Nick",29,3890.1),
                new Employee(104,"Zacky",30,8219.22)
        );
        employees.forEach(x-> System.out.println(x));
        Collections.sort(employees,(e1,e2)->{
            if (e1.getAge()==e2.getAge()) {
//                System.out.println(e1.getName().compareTo(e2.getName()));
                return e1.getName().compareTo(e2.getName());
            }
                else {
                System.out.println(Integer.compare(e1.getAge(), e2.getAge()));
                return Integer.compare(e1.getAge(), e2.getAge());
                }
        });
        System.out.println("---------------------");
        employees.forEach(x-> System.out.println(x));
    }

    /**
     * @Author chris
     * @Description //用於處理字符串
     * @Date 00:25 2019-04-03
     * @Param
     * @return java.lang.String
     **/
    public String strHandler(String str, MyFunction mf){
        return mf.getValue(str);
    }

    @Test
    public void test2(){
     String trimStr= strHandler("\t\t\t 我愛Java   ",str ->str.trim());
        System.out.println(trimStr);
    }
    @Test
    public void test3(){
        String upperStr=strHandler("abcdefg", str -> str.toUpperCase());
        System.out.println(upperStr);
        String subStr=strHandler("我愛Java", str -> str.substring(2, 6));
        System.out.println(subStr);
    }

    public void op(Long l1, Long l2, MyFunction2<Long,Long> mf2){
        System.out.println(mf2.getValue(l1,l2));
    }
    @Test
    public void test4(){
         op(100L, 200L, (l1, l2) -> l1 + l2);
         op(100L, 200L, (l1, l2) -> l1 * l2);
    }

}