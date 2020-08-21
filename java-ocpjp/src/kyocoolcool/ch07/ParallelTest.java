package kyocoolcool.ch07;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className ParallelTest
 * @description
 * @date 2020/7/31 11:18 AM
 **/

public class ParallelTest {
    public static void main(String[] args) {
//        final Stream<String> stream = Arrays.asList("jackal", "kangaroo", "lemur")
//                .parallelStream()
//                .map(s -> s.toUpperCase());


//        List<Integer> data = new ArrayList<>();
//        Arrays.asList(1,2,3,4,5,6).parallelStream()
//                .map(i -> {data.add(i); return i;}) // AVOID STATEFUL LAMBDA EXPRESSIONS!
//                .forEachOrdered(i -> System.out.print(i+" "));
//        System.out.println();
//        for(Integer e: data) {
//            System.out.print(e+" ");
//        }
        final List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6,7);
//        final Optional<Integer> any = integers.stream().skip(5).limit(2).findAny();
        final Stream<Integer> limit = integers.stream().skip(5).limit(2);

        System.out.println(limit.count());



        System.out.println(Arrays.asList('w', 'o', 'l', 'f')
                .stream()
                .reduce("",(c,s1) -> c + s1+"A",
                        (s2,s3) -> {
                            System.out.println("s2:"+s2+"   s3:"+s3);
                    return  s2 + s3;}));
    }
}
