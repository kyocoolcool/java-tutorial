package kyocoolcool.test1;

/**
 * @ClassName Water
 *
 * @Author Chris Chen
 * @Date 2019/11/14 11:47 AM
 * @Version 1.0
 **/

public class Water {
    String number;
    @Override
    protected void finalize() throws Throwable {
        System.out.println("over");
    }

    public static void main(String[] args) {
        Water water1 = new Water();
        water1.number = "a";
        Water water2 = new Water();
        Water water3 = water1;
        System.out.println(water3.number);
        water1.number = "aa";
        System.out.println(water3.number);
        water1 = null;
        water3 = null;
        water2 = null;
        System.gc();
//        water2 = new Water();
//        water2.number = "aaa";
        System.out.println(water2.number);



    }

}