package kyocoolcool.exam2.exam14;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/21 2:50 PM
 * @Version 1.0
 **/

public class Test {
    String name;
    int age = 25;

    public Test(String name) {
        setName(name);
    }

    public Test(String name, int age) {
//        Test(name);
        setAge(age);
    }

    public String show() {
        return name + " " + age;
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

    public static void main(String[] args) {
        final Test p1 = new Test("Jesse");
        final Test p2 = new Test("Waiter", 52);
        System.out.println(p1.show());
        System.out.println(p2.show());
    }
}
