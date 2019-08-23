package ocajp;

/**
 * @ClassName TestStudent
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-07-08 17:58
 * @Version 1.0
 **/

public class TestStudent {
    public static void main(String[] args) {
        Student bob = new Student();
        Student jian = new Student();
        Student.name = "aaa";
        bob.name = "ccc";
//         bob.name= Student.name;
//        bob.age = 10;
        jian = bob;
        jian.name = "apple";
        Student.name = "www";
        bob.name = "zzz";
        System.out.println("bob's name:" + bob.name);
        System.out.println("Student's name:" + Student.name);
        System.out.println("Jian's name:" + jian.name);


    }
}