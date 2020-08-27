package kyocoolcool.exam.exam113;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/27 3:46 PM
 **/
public class Emp {
    String fName;
    String lName;

    public Emp(String fn, String ln) {
        fName = fn;
        lName = ln;
    }

    public String getFName() {
        return fName;
    }

    public String getIName() {
        return lName;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Emp> emp = Arrays.asList(
                new Emp("John", "Smith"),
                new Emp("Peter", "Sam"),
                new Emp("Thomas", "Zale"),
                new Emp("Thomas", "Wale"));
        final List<Emp> collect = emp.stream().
                sorted(Comparator.comparing(Emp::getFName).reversed().thenComparing(Emp::getIName))
                .collect(Collectors.toList());
        System.out.println(collect);
    }

}
