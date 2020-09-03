package kyocoolcool.exam_v1495.exam95;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 6:02 PM
 **/
public class Employee {
    String dept, name;

    public Employee(String dept, String name) {
        this.dept = dept;
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dept='" + dept + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        final List<Employee> emps = Arrays.asList(new Employee("sales", "Ada"),
                new Employee("sales", "Bob"),
                new Employee("hr", "Bob"),
                new Employee("hr", "Eva"));
        final Stream<Employee> s = emps.stream().sorted(Comparator.comparing((Employee e) -> e.getDept()).thenComparing((Employee e) -> e.getName()));
        final List<Employee> collect = s.collect(Collectors.toList());
        System.out.println(collect);
    }
}
