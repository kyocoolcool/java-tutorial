package kyocoolcool.exam_v1475.exam56;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/7 5:33 PM
 **/
public class Test {
    int sum = 0;

    public void doCheck(int num) {
        if (num % 2 == 0) {
        } else {
           outer: for (int i = 0; i < num; i++) {
                 if (i == 2) {
                    break outer;
                }
                sum += i;
            }
        }

    }

    public static void main(String[] args) {
        final Test test = new Test();
        System.out.println("red:"+test.sum);
        test.doCheck(2);
        System.out.println("green:"+test.sum);
        test.doCheck(3);
        System.out.println("yellow:"+test.sum);
    }
}
