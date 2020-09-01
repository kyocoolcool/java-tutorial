package kyocoolcool.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * @ClassName Test4
 *
 * @Author Chris Chen
 * @Date 2019/12/14 11:43 AM
 * @Version 1.0
 **/

public class Test4 {
    @Test
    public void test2() {
        List<Integer> list = Arrays.asList(121, 1231, 455, 56, 67, 78);
        List<Integer> numList = getNumberList(1, () -> (int) (Math.random() * 100));
        for (Integer num : numList) {
            System.out.println(num);
        }
    }


    public List<Integer> getNumberList(Integer num, Supplier<Integer> sup) {
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer i = 0; i < num; i++) {
            list.add(sup.get());
        }
        return list;
    }
}