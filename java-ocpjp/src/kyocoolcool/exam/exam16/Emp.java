package kyocoolcool.exam.exam16;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/24 3:02 PM
 **/
public class Emp {
    private String name;
    private Integer age;

    public Emp(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<Emp> li = Arrays.asList(new Emp("Sam", 70), new Emp("John", 60), new Emp("Jim", 70));
        Predicate<Emp> agVal = s -> s.getAge() > 50;
        li = li.stream().filter(agVal).collect(Collectors.toList());
//        final Stream<String> names = li.stream().map(x -> x.getA);
//        final List<String> strings = Arrays.asList("mine", "helloo", "chris");
//        final Stream<String> stream = strings.stream();
        final Stream<Emp> stream = li.stream();
//        final Stream<Integer> integerStream = strings.stream().map(x->x.toUpperCase(), k -> k, (s, s1) -> s + "," + s1);
//        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
//        Map<Integer, String> map = ohMy.collect(Collectors.toMap(
//                String::length, k -> k, (s1, s2) -> s1 + "," + s2));
//        map.forEach((x,y)-> System.out.println(y.toLowerCase()));
        final TreeMap<Integer, Emp> collect = stream.collect(Collectors.toMap(y -> y.getAge().intValue(), k -> k,(s,s1)->new Emp(s.getName()+","+s1.getName(), s.getAge()), TreeMap::new));
        System.out.println(collect);



    }
}
