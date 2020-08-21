package kyocoolcool.ch08;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Animal
 * @description
 * @date 2020/8/6 10:08 AM
 **/

public class Animal implements Serializable {
    private String name;
    private transient Integer age;
    //    private Dog dog;
//    {
//        this.dog = new Dog("QQ");
//    }
    private List<Dog> dogs=new ArrayList<>();

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Animal(String name, Integer age, Dog dog) {
//        this.name = name;
//        this.age = age;
//        this.dog = dog;
//    }
//
//    @Override
//    public String toString() {
//        return "Animal{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", dog=" + dog +
//                '}';
//    }




    public Animal(String name, Integer age, List<Dog> dogs) {
        this.name = name;
        this.age = age;
        this.dogs = dogs;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dogs=" + dogs +
                '}';
    }
}
