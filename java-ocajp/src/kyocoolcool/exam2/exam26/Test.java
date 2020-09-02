package kyocoolcool.exam2.exam26;

import java.util.ArrayList;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/21 3:45 PM
 * @Version 1.0
 **/

public class Test {
   static String[] myArray;
    public static void main(String[] args) {
        final ArrayList myList = new ArrayList();

//        System.out.println(myArray);
        try {
            while (true) {
                myList.add("hhh");
            }
        } catch (Error e) {
            System.out.println("aaaa");
        } catch (Exception e) {
            System.out.println("bbbb");
        }
        System.out.println("ok");
    }
}
