package kyocoolcool.ch08;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Puppy_Child
 * @description
 * @date 2020/8/7 2:38 PM
 **/

public class Puppy_Child extends Puppy {
    {
        this.play = "AAAA";
    }

    @Override
    public String toString() {
        return "Puppy_Child{" +
                "Puppy_Child='" + play + '\'' +
                '}';
    }

    public static void main(String[] args) {
        final Puppy puppy = new Puppy();
        System.out.println(puppy);
    }
}
