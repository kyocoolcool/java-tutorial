package kyocoolcool;

/**
 * @ClassName StaticExam
 * @Description static field testing
 * @Author Chris Chen
 * @Date 2019/10/22 12:46 AM
 * @Version 1.0
 **/

public class StaticExam {
    static void one() {
        two();
        StaticExam.two();
    }

    static void two() {
    }

    void three() {
        one();
        StaticExam.one();
        four();
    }

    void four() {

    }

    public static void main(String[] args) {
        A b = new B();
        b.show();
        b.hello();
    }
}

class A {
    static void show() {
        System.out.println("from A show");
    }

    void hello() {
        System.out.println("from A hello");
    }
}

class B extends A {
    static void show() {
        System.out.println("from B show");
    }

    void hello() {
        System.out.println("from B hello");
    }

}