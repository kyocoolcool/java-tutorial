package kyocoolcool.core;

/**
 * @author Chris Chen
 * @version 1.0
 * @className Person
 * @description
 * @date 2020/4/12 2:25 PM
 **/

public class Person {
    private String name;
    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
