package kyocoolcool.exam_v1495.exam41;

/**
 * @ClassName A
 * 
 * @Author Chris Chen
 * @Date 2020/2/12 11:10 AM
 * @Version 1.0
 **/

public class A {
    public String name = "A";

    public A() {
        System.out.println("無參constructor"+name);
    }

    public A(String name) {
        this.name = name;
        System.out.println("有參constructor"+name);
    }
}
