package ocajp;

import java.io.IOException;

/**
 * @ClassName ExceptionTest
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-07-09 16:18
 * @Version 1.0
 **/

public class ExceptionTest {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("hello");
                try {
                    int a = 3 / 0;
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("aaa" + e.getMessage());
                }
            } catch (Exception e) {
                System.out.println("bbb" + e.getMessage());
                continue;
            }
            System.out.println("aaaaa");
        }
    }
}