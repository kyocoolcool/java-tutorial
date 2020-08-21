package kyocoolcool.ch01;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test18
 * @description
 * @date 2020/6/21 11:01 AM
 **/

public class Test18 {
    enum Season {
        SPRING{
            @Override
            public boolean what() {
                return false;
            }
        }, SUMMER{
            public boolean what() {
                System.out.println("Summer coming");
                return true;
            }
        };

        public abstract boolean what();
    }

    public static void main(String[] args) {
        System.out.println(Season.SUMMER);
        System.out.println(Season.SUMMER.ordinal());
        System.out.println(Season.SUMMER.what());
        System.out.println(Season.SPRING.what());
    }
}
