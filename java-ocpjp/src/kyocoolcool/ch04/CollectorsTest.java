package kyocoolcool.ch04;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className CollectorsTest
 * @description
 * @date 2020/7/20 9:53 AM
 **/

public class CollectorsTest {
    public static void main(String[] args) {
//        final Stream<String> stream = Stream.of("aaa", "bbbb", "ccccc");
//        final TreeMap<Integer, List<String>> collect = stream.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
//        System.out.println(collect);
        final Stream<String> stream2 = Stream.of("aaa", "bbbb", "bbbb");
        final Map<Integer, List<Character>> collect = stream2.collect(
                Collectors.groupingBy(String::length,
                Collectors.mapping(s -> s.charAt(0),
                        Collectors.toList())));;
//        Map<Integer, Optional<Character>> map = stream2.collect(
//                Collectors.groupingBy(
//                        String::length,
//                        Collectors.mapping(s -> s.charAt(0),
//                                Collectors.minBy(Comparator.naturalOrder()))));
//        System.out.println(map);
//        System.out.println(collect);

        final Stream<String> iterate = Stream.iterate("", s -> s + 1);
//        iterate.limit(2).map(x -> x + "2").forEach(System.out::println);
//        final Stream<String> limit = iterate.limit(2);
//        limit.forEach(System.out::println);
        System.out.println(iterate.getClass());
    }
}
