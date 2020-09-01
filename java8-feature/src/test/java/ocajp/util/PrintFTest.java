package ocajp.util;

import org.junit.Test;

/**
 * @ClassName PrintFTest
 * 
 * @Author Chris Chen
 * @Date 2019-06-28 14:01
 * @Version 1.0
 **/

public class PrintFTest {
    int i = 10;

    @Test
    public void test() {
        System.out.printf("(01) : i ==>"+i);
    }

    @Test
    public void test2() {
        System.out.printf("(02) : i ==>%d%n",i);
    }

    @Test
    public void test3() {
        System.out.printf("(03) : PI ==>%f",Math.PI).println();
    }

    @Test
    public void test4() {
        System.out.printf("(04) : PI ==>%e%n",Math.PI);
    }

    @Test
    public void test5() {
        System.out.printf("(05) : PI ==>%f , E ==>%e%n",Math.PI,Math.E);
    }

    @Test
    public void test6() {
        System.out.printf("(06) : PI ==>%2$f , E ==>%1$en",Math.E,Math.PI);
    }

    @Test
    public void test7() {
        System.out.printf("(07) : PI ==>%2$f , E ==>%<en",Math.E,Math.PI);
    }

    @Test
    public void test8() {
        System.out.printf("(08) : x ==>%10.2f ",12345.6789);
    }

    @Test
    public void test9() {
        System.out.printf("(09) : x ==>%10.6f ",12345.6789);
    }

    @Test
    public void test10() {
        System.out.printf("(10) : x ==>%.3g ",12345.6789);
    }

    @Test
    public void test11() {
        System.out.printf("(11) : x ==>%.2s ",12345.6789);
    }

    @Test
    public void test12() {
        System.out.printf("(12) : x ==>%-10.2f ",12345.6789);
    }

    @Test
    public void test13() {
        System.out.printf("(13) : x ==>%+15.2f ",12345.6789);
    }

}