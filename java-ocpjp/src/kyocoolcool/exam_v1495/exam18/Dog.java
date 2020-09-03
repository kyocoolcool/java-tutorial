package kyocoolcool.exam_v1495.exam18;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/24 4:04 PM
 **/
public class Dog implements Comparable<Dog>{
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(@NotNull Dog o) {
        return this.age-o.age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        final ArrayList<Dog> dogs = new ArrayList<>();
        final Dog kitty = new Dog("kitty", 30);
        final Dog ken = new Dog("ken", 20);
        dogs.add(kitty);
        dogs.add(ken);
        System.out.println(dogs);
        System.out.println(kitty.compareTo(ken));

    }
}
