package kyocoolcool.test1;

import kyocoolcool.X;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.*;

/**
 * @ClassName XXX
 *
 * @Author Chris Chen
 * @Date 2019/11/28 7:04 PM
 * @Version 1.0
 **/

public class XXX extends X {

    public XXX(int age) {
        System.out.println(age);
    }

    public XXX() {
    }

    String age="10000";

    public void hey() {
        final X x = new X();
        x.say();
    }

    private static final int year = 2019;

    public static int getYear() {
        return year;
    }

    public static void setYear(int year) {
        year = year;
    }

    {
        c = 99;
    }

    static int c = 10;

    private static final ArrayList<String> values = new ArrayList<>();

    private static final int NUM_SECONDS_PER_HOUR;

    static {
        int numSecondsPerMinute = 60;
        int numMinutesPerHour = 60;
        NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
    }

    private static int one=100;
    private static final int two=200;
    private static final int three = 3;

     {
        one = 1;
//        two = 2;
         System.out.println("AAAAA:"+NUM_SECONDS_PER_HOUR);
         System.out.println("BBBBB:"+c);
    }

    public void fly(int numMiles) { }
    public void fly(short numFeet) { }
    public boolean fly() { return false; }
    void fly(int numMiles, short numFeet) { }
    public void fly(double numMiles, short numFeet) { }
    public void fly(short numFeet, int numMiles) throws Exception { }
    public void fly(Integer numMiles) { }

    public static void main(String[] args) {
//        final XXX xxx = new XXX(1);
////        xxx.hey();
//        System.out.println(xxx.age);
        String b = null;

        XXX xxx1 = new XXX();
        System.out.println(xxx1.age);
        xxx1 = null;
        System.out.println(xxx1);
        System.out.println(b);
        setYear(2020);
        System.out.println(year);
        values.add("changed");
        System.out.println(values);
        System.out.println(c);
        System.out.println(NUM_SECONDS_PER_HOUR);
        System.out.println(one);
        System.out.println(two);
         List<Integer> integers = asList(1, 2);
        System.out.println(integers);
        integers.add(3);
        System.out.println(integers);
    }
}