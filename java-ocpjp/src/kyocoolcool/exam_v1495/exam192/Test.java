package kyocoolcool.exam_v1495.exam192;

import java.util.Optional;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/1 下午 10:55
 **/
public class Test {
    public static Optional<String> getCountry(String loc) {
         Optional<String> optional = Optional.empty();
        if ("Paris".equals(loc)) {
            optional=Optional.of("France");
        } else if ("Mumbai".equals(loc)) {
            optional=Optional.of("India");
        }
        return optional;
    }
    public static void main(String[] args) {
        final Optional<String> paris = getCountry("Paris");
        final Optional<String> paris2 = getCountry("Las Veges");
        System.out.println(paris.orElse("not found"));
        if (paris2.isPresent()) {
            paris2.ifPresent(s-> System.out.println(s));
        } else
            System.out.println(paris2.orElse("not found2"));
    }
}