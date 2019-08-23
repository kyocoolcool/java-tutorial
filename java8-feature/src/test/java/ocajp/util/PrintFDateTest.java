package ocajp.util;

import org.junit.Test;

import java.util.Calendar;

/**
 * @ClassName PrintFDateTest
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-06-28 14:44
 * @Version 1.0
 **/

public class PrintFDateTest {

    @Test
    public void test() {
        Calendar calendar = Calendar.getInstance();
        System.out.println("(1) : "+calendar);
        System.out.printf("(2) : %tA%n",calendar);
        System.out.printf("(3) : %ta%n",calendar);
        System.out.printf("(4) : %tB%n",calendar);
        System.out.printf("(5) : %tB%n",calendar);
        System.out.printf("(6) : %tC 世紀 %n",calendar);
        System.out.printf("(7) : %tc 世紀 %n",calendar);
        System.out.printf("(8) : %tD  %n",calendar);
        System.out.printf("(9) : %td  %n",calendar);
        System.out.printf("(9) : %te  %n",calendar);
        System.out.format("(10) : Right now is %tr on "+"%<tA,%<tb,%<te,%<tY.%n",calendar);
    }
}