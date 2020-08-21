package kyocoolcool.core;

/**
 * @author Chris Chen
 * @version 1.0
 * @className Chinese
 * @description
 * @date 2020/4/12 2:25 PM
 **/

public class Chinese extends Person{
    public Chinese(String name, int age) {
        super(name,age);
    }

    public static void main(String[] args) {
        final Chinese chinese = new Chinese("nick",20);
        System.out.println(chinese.toString());
    }
}
