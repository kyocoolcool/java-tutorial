package kyocoolcool.ch04;

import java.util.OptionalLong;
import java.util.stream.LongStream;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test09
 * @description
 * @date 2020/7/20 4:26 PM
 **/

public class Test09 {
    public static void main(String[] args) {
        final LongStream longStream = LongStream.of(1, 2, 3);
        final OptionalLong first = longStream.map(s -> s * 10).filter(s->s<5).findFirst();
        if (first.isPresent()) {
            System.out.println(first.getAsLong());
        }

    }
}
