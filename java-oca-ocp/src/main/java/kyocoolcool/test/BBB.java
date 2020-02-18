package kyocoolcool.test;

import kyocoolcool.AAA;

/**
 * @ClassName BB
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019/10/31 10:36 PM
 * @Version 1.0
 **/

public class BBB extends AAA {
    public int age=30;
    public int number = 20;
    static String name;
    static {
        name = "little ball";
    }
    static {
        name = "large ball";
    }

    public static void call() {
        System.out.println("111");
    }

    public String address = "taipei";

    private void test() {
        System.out.println(age);
        BBB BBB = new BBB();
        System.out.println(BBB.number);
        AAA aaa = new BBB();
        System.out.println("!!!"+aaa.getAge2());

        BBB.number = 40;
        System.out.println(BBB.number);
        System.out.println("@@@"+BBB.getAge2());
        System.out.println(((BBB)aaa).number);
        AAA aaa1 = new AAA();
        System.out.println(((BBB)aaa1).number);//父類實體不能轉為子類引用
    }

    public int getAge2() {
        return 123;
    }

    public static void main(String[] args) {
        final BBB BBB = new BBB();
        BBB.test();
        final AAA aaa = new AAA();
        System.out.println(aaa.money);
        System.out.println(name);
        try {
            aaa.setAge2(-20);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        System.out.println(aaa.getAge2());

        hello();
    }

    public static void hello() {
        System.out.println("666");
    }
}