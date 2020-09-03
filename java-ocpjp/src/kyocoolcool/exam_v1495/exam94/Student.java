package kyocoolcool.exam_v1495.exam94;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 5:51 PM
 **/
public class Student {
    String course, name, city;

    public Student(String name, String course, String city) {
        this.course = course;
        this.name = name;
        this.city = city;
    }

    public String getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course='" + course + '\'' +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public static void main(String[] args) {
        final List<Student> students = Arrays.asList(
                new Student("Jessy", "Java ME", "Chicago"),
                new Student("Helen", "Java EE", "Houston"),
                new Student("Mark", "Java ME", "Chicago")
        );
        students.stream().collect(Collectors.groupingBy(Student::getCourse)).forEach((src,res)-> System.out.println(src));

    }
}
