package kyocoolcool.exam2.exam138;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/24 1:49 PM
 * @Version 1.0
 **/

public class Test {
    String mystr = "7007";
    public void dosum(String str){
        int myNum = 0;
        try {
            String mystr = str;
            myNum = Integer.parseInt(mystr);
        } catch (NumberFormatException e) {
            System.out.println("error");
        }
        System.out.println("mystr:"+mystr+"----mynum"+myNum);
    }

    public static void main(String[] args) {
        final Test test = new Test();
        test.dosum("9009");

    }
}
