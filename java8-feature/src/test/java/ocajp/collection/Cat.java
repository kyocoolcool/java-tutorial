package ocajp.collection;

/**
 * @ClassName Cat
 * 
 * @Author Chris Chen
 * @Date 2019-06-13 14:24
 * @Version 1.0
 **/

public class Cat {
    private String name;
    private Integer age;

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
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}