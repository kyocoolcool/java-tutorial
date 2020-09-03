package kyocoolcool.exam_v1495.exam120;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/20 2:57 PM
 * @Version 1.0
 **/

public class Test {
   static int a = 5;
    public static void main(String[] args) {
//        final Test test = new Test();
//        System.out.println(test.a());
        System.out.println(a--);
    }

    public int a() {
        return a--;
    }
}
