package kyocoolcool.exam.exam121;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/27 下午 11:19
 **/
class TechName {
    String techName;

    TechName(String techName) {
        this.techName = techName;
    }

//    @Override
//    public String toString() {
//        return "TechName{" +
//                "techName='" + techName + '\'' +
//                '}';
//    }

    public static void main(String[] args) {
        final List<TechName> techNames = Arrays.asList(new TechName("Java"),
                new TechName("Oracle DB"),
                new TechName("J2EE")
        );

        final Stream<TechName> stream = techNames.stream();
//        stream.forEach(System.out::println);
//        stream.map(a->a.techName).forEach(System.out::println);
//        stream.map(c->c.techName).forEachOrdered(System.out::println);
//        stream.forEachOrdered(System.out::println);
    }
}