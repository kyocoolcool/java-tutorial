package ocajp.extend;

import org.junit.Test;

/**
 * @ClassName AAA
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-05-31 17:17
 * @Version 1.0
 **/

public class AAA {
   static String id;
   static int no;
    String name;



    public AAA(String id, int no, String name) {
        this.id = id;
        this.no = no;
        this.name = name;
    }

    public AAA(int oo) {

    }

    public AAA(String id, int no) {
        this.id = "ZZZZ";
        this.no = 5555;
    }

    public AAA() {
//        id = "XXX";
    }



    static {
        id = "aaa";
        no = 1;
//        name = "bbb";
    }

//    {
//        id = "ddd";
//        no = 2;
//        name = "fff";
//    }



    @Test
    public void test1() {
        AAA aaa = new AAA();
//        System.out.println(aaa.id);
    }

    public static void main(String[] args) {
        AAA aaa = new AAA();
        System.out.println(aaa.id);
        System.out.println(aaa.no);
        System.out.println(aaa.name);
//        System.out.println(AAA.id);
    }
}