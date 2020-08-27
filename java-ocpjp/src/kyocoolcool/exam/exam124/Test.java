package kyocoolcool.exam.exam124;

import java.util.Arrays;
import java.util.List;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/28 上午 12:29
 **/
public class Test {
    public static void main(String[] args) {
        List<String> codes = Arrays.asList("DOC", "MPEG", "JPEG");
        codes.forEach(c -> System.out.print(c + " "));
        String fmt = codes.stream()
                .filter(s -> s.contains("PEG"))
                .reduce((s, t) -> s + t).get();
        System.out.println("\n" + fmt);
    }
}