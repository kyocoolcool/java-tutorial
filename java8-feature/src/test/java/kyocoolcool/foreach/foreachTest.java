package kyocoolcool.foreach;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName foreachTest
 *
 * @Author Chris Chen
 * @Date 2019-04-27 18:43
 * @Version 1.0
 **/

public class foreachTest {
    public Integer sum=0;
    @Test
    public void test() {
//        int[] a = {1, 2, 3, 4, 5};
        List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5);
        asList.forEach(x->test2(x));
        System.out.println(sum);
    }
    public Integer test2(Integer a){
        sum+=a;
        return sum;
    }

}