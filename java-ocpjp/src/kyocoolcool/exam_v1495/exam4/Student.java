package kyocoolcool.exam_v1495.exam4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/21 4:30 PM
 **/
public class Student {
    private String name, course, city;

    public Student(String name, String course, String city) {
        this.name = name;
        this.course = course;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public static void main(String[] args) {
        final List<Student> students = Arrays.asList(new Student("Chris", "Java ME", "Taipei"), new Student("Mary", "Java OO", "Taipei"), new Student("Nick", "Java OO", "Taichung"));
        students.stream().collect(Collectors.groupingBy(x->x.course)).forEach((x,y)-> System.out.println(x));
    }
}
