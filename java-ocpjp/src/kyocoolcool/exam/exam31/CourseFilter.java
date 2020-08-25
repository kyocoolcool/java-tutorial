package kyocoolcool.exam.exam31;

import java.util.function.Predicate;

public interface CourseFilter extends Predicate<String> {
    @Override
    default boolean test(String s) {
        return s.contains("aaa");
    }
}
