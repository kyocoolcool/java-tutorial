package kyocoolcool.ch04;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Dof
 * @description
 * @date 2020/7/20 5:48 PM
 **/

public class Dog extends Animal{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
