package kyocoolcool.exam_v1495.exam30;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/11 2:42 PM
 * @Version 1.0
 **/

public class Test {
    int num;

    int do1(int a) {
      return   a = a * a;
    }

    void do2(StringBuilder s) {
        s.append(s);
    }
    public static void main(String[] args) {
        final Test test = new Test();
        test.num = 11;
        Integer i = 10;
        final StringBuilder hello = new StringBuilder("hello");
        test.do1(i);
        test.do2(hello);
        test.num=test.do1(test.num);
        System.out.println("i:"+i+"  "+"hello:"+hello+" "+"test.num:"+" "+test.num);
    }
}
