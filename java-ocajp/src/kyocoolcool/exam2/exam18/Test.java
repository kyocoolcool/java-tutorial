package kyocoolcool.exam2.exam18;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/21 3:07 PM
 * @Version 1.0
 **/

public class Test {

    public static void main(String[] args)  {
        System.out.println("aaaa");
        try {

            throw new MyException();
        } catch (Exception e) {
            System.out.println("catch");
        }
    }
}
