package kyocoolcool.Example;

/**
 * @ClassName Person
 * @Description TODO
 * @Author chris
 * @Date 2019-04-25 14:32
 * @Version 1.0
 **/

public class Person {
    public String name;
    public Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public void hello() {
        System.out.println("123");
    }

    @Deprecated
    public void hello2() {
        System.out.println("456");
    }
}