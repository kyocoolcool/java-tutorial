package kyocoolcool.optional;

import kyocoolcool.bean.Employee;
import kyocoolcool.bean.Goddness;
import kyocoolcool.bean.Man;
import kyocoolcool.bean.NewMan;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.Optional;

/**
 * @ClassName OptionalTest
 * @Description
 * Optional容器類的常用方法
 * Optional.of(T t):創建一個Optional 實例
 * Optional.empty():創建一個空的Optional實例
 * Optional.ofNullable(T t):若t不為null，創建Optional 實例，否則創建空實例
 * isPresent():判斷是否包含值
 * orElse(T t):如果調用對象包含值，返回該值，否則返回t
 * orElseGet(Supplier s):如果調用對象包含值，返回該值，否則返回s獲取得值
 * map(Function f):如果有值對其處理，並返回處理後的Optional，反則返回Optional.empty()
 * flatMap(Function mapper):與map類似，要求返回值必須是Optional
 * @Author chris
 * @Date 2019-04-17 15:11
 * @Version 1.0
 **/

public class OptionalTest {
    @Test
    public void test1(){
        Optional<Employee> op = Optional.of(new Employee());
            Employee employee = op.get();
            System.out.println(employee);
    }

    @Test
    public void test2(){
        Optional<Object> op = Optional.empty();
        System.out.println(op.get());
    }

    @Test
    public void test3(){
        Optional<Employee> op = Optional.ofNullable(null);
        if(op.isPresent())
        System.out.println(op.get());

    }

    @Test
    public void test4(){
        Optional<Employee> op = Optional.ofNullable(null);
        Employee employee = op.orElse(new Employee(1,"Chris",20,10000));
        System.out.println(employee);
    }

    @Test
    public void test5(){
        Optional<Employee> op = Optional.ofNullable(null);
        Employee employee = op.orElseGet(()->new Employee(1,"Chris",20,10000));
        System.out.println(employee);
    }
    @Test
    public void test6(){
        Optional<Employee> op = Optional.ofNullable(new Employee(1,"Chris",20,10000));
        Optional<Integer> op2 = op.map((x) -> x.getAge());
        System.out.println(op2.get());
    }

    @Test
    public void test7(){
        Optional<Employee> op = Optional.ofNullable(new Employee(1,"Chris",20,10000));
        Optional<String> optional = op.flatMap((x) -> Optional.of(x.getName()));
        System.out.println(optional.get());
    }

    //例題
    @Test
    public void example(){
        Man man = new Man();
        String goddnessName = getGoddnessName(man);
        System.out.println(goddnessName);
    }

    //需求:獲取一個男人心中女神的名字
    public String getGoddnessName(Man man){
        if(man.goddness !=null){
            Goddness goddness = man.getGoddness();
            if(goddness !=null){
                return goddness.getName();
            }
        }
        return "蒼老師";
    }

    @Test
    public void example2(){
        Optional<Goddness> gn = Optional.ofNullable(new Goddness("許老師"));
        Optional<NewMan> op = Optional.ofNullable(new NewMan());
        String goddnessName2 = getGoddnessName2(op);
        System.out.println(goddnessName2);

    }

    public String getGoddnessName2(Optional<NewMan> man){
        return  man.orElse(new NewMan())
                .getGoddness()
                .orElse(new Goddness("蒼老師"))
                .getName();
    }
}