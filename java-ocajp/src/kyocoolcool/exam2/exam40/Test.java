package kyocoolcool.exam2.exam40;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/21 4:39 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        int num1[] = {1, 2, 3};
        int num2[] = {1, 2, 3, 4, 5};
        num2 = num1;
        for (int i : num2) {
            System.out.println(i+":");
        }
    }
}
