package kyocoolcool.ch04;

import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className LambdaTest6
 * @description
 * @date 2020/7/17 5:21 PM
 **/

public class LambdaTest6 {
    private static List<String> create() throws IOException {
        throw new IOException();
    }

    private static List<String> createSafe() {
        final Supplier<List<String>> create = () -> {
            try {
                return LambdaTest6.create();
            } catch (IOException e) {
                System.out.println("bbbbb");
            }
            return null;
        };
        return null;
    }
        public static void main (String[]args)  {
                final Supplier<List<String>> createSafe = () -> {
                    System.out.println("aaa");
                    return createSafe();
                };
            final List<String> strings = createSafe.get();
            System.out.println(strings);
        }
    }


