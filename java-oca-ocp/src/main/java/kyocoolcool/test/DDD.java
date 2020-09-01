package kyocoolcool.test;

import kyocoolcool.AAA;

/**
 * @ClassName DDD
 * 
 * @Author Chris Chen
 * @Date 2019/11/1 2:26 PM
 * @Version 1.0
 **/

public class DDD {

    public void main() {
    }

    public void main(String a) {

    }

    public void main(Integer a) {

    }


    public void test1() {
//        AAA.age = 30; //final不能更改
        System.out.println(AAA.age);
    }

    public void test2() {
//        AAA.age = 40; //final不能更改
        System.out.println(AAA.age);
    }

    public void test3() {
        System.out.println(AAA.age);
    }

    public static void main(String[] args) {
        DDD ddd = new DDD();
        ddd.test1();
        ddd.test2();
        ddd.test3();
        int i = -7, j = -8;

        i = i * j;
        j = i - j;
        i = i - j;
        j = (j+i)/i;
        System.out.println(i);
        System.out.println(j);

//        System.out.println(1+3&5);
    }
}