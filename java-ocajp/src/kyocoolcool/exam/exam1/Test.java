package kyocoolcool.exam.exam1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/5 3:36 PM
 * @Version 1.0
 **/

public class Test {
    public static void checkAge(List<Person> list, Predicate<Person> predicate) {
        for (Person person : list) {
            if (predicate.test(person)) {
                System.out.println(person.name+" ");
            }
        }
    }

    public static void main(String[] args) {
        final List<Person> list = Arrays.asList(new Person("Hank", 45), new Person("Charlie", 40), new Person("Smith", 38));
        checkAge(list, person -> person.getAge() > 40);
    }
}
