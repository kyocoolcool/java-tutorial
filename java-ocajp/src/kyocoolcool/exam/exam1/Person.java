package kyocoolcool.exam.exam1;

/**
 * @ClassName Person
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/5 3:36 PM
 * @Version 1.0
 **/

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
