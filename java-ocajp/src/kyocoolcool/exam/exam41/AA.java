package kyocoolcool.exam.exam41;

/**
 * @ClassName AA
 * 
 * @Author Chris Chen
 * @Date 2020/2/12 11:12 AM
 * @Version 1.0
 **/

public class AA extends A{
    public int age;
    public int height;
    public int weight;

    public AA(int age) {
        super("aaaa");
//        this(20,30);
        this.age = age;
        System.out.println("AA有參");
    }

    public AA(int height, int weight) {
        this.height = height;
        this.weight = weight;
        System.out.println("AA height,weight");
    }
}
