package kyocoolcool.exam_v1475.exam136;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/10 10:01 AM
 **/
public class Emp {
    private String eName;
    private Integer eAge;

    Emp(String eN, Integer eA) {
        this.eName = eN;
        this.eAge = eA;
    }

    public Integer getEAge() {
        return eAge;
    }

    public String getEName() {
        return eName;
    }

    public static void main(String[] args) {
        List<Emp> li = Arrays.asList(new Emp("Sam", 20), new Emp("John", 60),
                new Emp("Jim", 51));
        Predicate<Emp> agVal = s -> s.getEAge() > 50;//line n1
        li = li.stream().filter(agVal).collect(Collectors.toList());
        Stream<String> names = li.stream().map(Emp::getEName);//line n2
        names.forEach(n -> System.out.print(n + " "));

    }
}

