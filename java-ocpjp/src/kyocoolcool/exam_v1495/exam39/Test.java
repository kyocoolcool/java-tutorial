package kyocoolcool.exam_v1495.exam39;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/25 3:12 PM
 **/
public class Test {
    String name;
    static int age;

    public Test(String name) {
        this.name = name;
    }

    public void hello(String a, int b) {
        name = a;
        age = b;
        class HelloClass {
            String game = "QQ";

            public void playGame() {
                System.out.println(game + ":" + name + ":" + age);
            }
        }
        final HelloClass helloClass = new HelloClass();
        helloClass.playGame();
    }

    public static void main(String[] args) {
        final Test chris = new Test("Chris");
        chris.hello("aa", 20);
    }
}
