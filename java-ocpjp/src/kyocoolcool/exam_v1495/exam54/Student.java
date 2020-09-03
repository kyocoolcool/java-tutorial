package kyocoolcool.exam_v1495.exam54;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/25 下午 11:05
 **/
public class Student {

    String course, name, city;

    public Student(String name, String course, String city) {
        this.course = course;
        this.name = name;
        this.city = city;
    }

    public String toString() {
        return course + ":" + name + ":" + city;
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

    public static void main(String[] args) {
        List<Student> stds = Arrays.asList(
                new Student("Jessy", "Java ME", "Chicago"),
                new Student("Helen", "Java EE", "Houston"),
                new Student("Mark", "Java ME", "Chicago"));
        Map<String,List<Student>> map =stds.stream().collect(Collectors.groupingBy(Student::getCourse));
        map.forEach((src,req)-> System.out.println(src));

    }

}