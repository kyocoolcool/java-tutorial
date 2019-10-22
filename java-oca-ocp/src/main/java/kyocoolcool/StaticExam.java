package kyocoolcool;

/**
 * @ClassName StaticExam
 * @Description TODO
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
}