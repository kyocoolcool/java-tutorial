package kyocoolcool.exam_v1475.exam44;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/7 4:16 PM
 **/
class Student {
    public String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("Jack");
        Student student2 = new Student("Nick");
        Student student3 = new Student("Mary");
        student1 = student3;
        student3 = student2;
        student2 = null;
        System.out.println(student2);
        System.out.println(student1.toString());
        System.out.println(student3.toString());
    }
}
