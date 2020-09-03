package kyocoolcool.exam_v1495.exam35;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/25 2:29 PM
 **/
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        final List<Person> sts = Arrays.asList(
                new Person("Jack", 30),
                new Person("Mike Hill", 21),
                new Person("Thomas Hill", 24)
        );
        final Stream<Person> reList = sts.stream().filter(s -> s.getAge() >= 25);
        final long count = reList.filter(s -> s.getName().contains("Hill")).count();
        System.out.println(count);
    }
}
