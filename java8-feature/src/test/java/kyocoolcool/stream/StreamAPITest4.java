package kyocoolcool.stream; /**
 * @ClassName StreamAPITest4
 * @Description 練習
 * @Author chris
 * @Date 2019-04-08 19:20
 * @Version 1.0
 **/

import kyocoolcool.bean.Employee;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamAPITest4 {
    List<Employee> list;

    {
        list = Arrays.asList(
                new Employee(1, "Chris", 20, 100.0, Employee.Status.BUSY),
                new Employee(2, "Jack", 30, 200.0, Employee.Status.VOCATION),
                new Employee(3, "Nick", 40, 300.0, Employee.Status.BUSY),
                new Employee(4, "Mary", 50, 400.0, Employee.Status.FREE),
                new Employee(5, "Mary", 50, 400.0, Employee.Status.FREE),
                new Employee(6, "Cary", 50, 500, Employee.Status.FREE)
        );
    }

    /**
     * @Author chris
     * @Description //給定一個數字列表，如何返回每一個數平方構成的列表呢? [1,2,3,4,5]->[1,4,9,16,25]
     * @Date 19:22 2019-04-08
     * @Param
     * @return void
     **/
    @Test
    public void test1(){
        Integer[] integers = {1, 2, 3, 4, 5};
        Arrays.stream(integers).map((x)->x*x).forEach(System.out::println);
    }

    /**
     * @Author chris
     * @Description //怎麼用map和reduce數一數stream中有多少個Employee呢?
     * @Date 19:27 2019-04-08
     * @Param
     * @return void
     **/
    @Test
    public void test2(){
        Optional<Integer> reduce = list.stream().map((e) -> 1).reduce(Integer::sum);
        System.out.println(reduce.get());
    }
}