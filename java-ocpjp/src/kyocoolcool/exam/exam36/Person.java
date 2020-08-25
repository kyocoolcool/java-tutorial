package kyocoolcool.exam.exam36;

import java.util.Arrays;
import java.util.List;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/25 2:46 PM
 **/
public class Person {
    private String firstName;
    private int salary;

    public Person(String firstName, int salary) {
        this.firstName = firstName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        final List<Person> prog = Arrays.asList(
                new Person("Smith", 1500),
                new Person("John", 2000),
                new Person("Joe", 1000)
        );
        final double dVal = prog.stream().filter(s -> s.getFirstName().startsWith("J")).
                mapToInt(Person::getSalary)
                .average()
                .getAsDouble();
        System.out.println(dVal);

    }
}
