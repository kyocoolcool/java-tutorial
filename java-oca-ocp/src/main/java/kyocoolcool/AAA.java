package kyocoolcool;

/**
 * @ClassName AAA
 * 
 * @Author Chris Chen
 * @Date 2019/10/31 10:35 PM
 * @Version 1.0
 **/

public class AAA {
    public final static int age = 18;
    public int number = 10;
    public int money = 1000;
    private int age2;


    public static void call() {
        System.out.println("call 6");
    }

    public int getAge2() {
        return age2;
    }

    public void setAge2(int age2) throws Exception {
        if (age2 > 0 && age2 < 120) {
            this.age2 = age2;
        } else {
           throw  new Exception("不在正常年齡範圍");
        }
    }
}