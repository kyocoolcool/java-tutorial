package kyocoolcool.ch05;

import java.time.ZoneId;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className ZoneTest
 * @description
 * @date 2020/7/21 11:48 AM
 **/

public class ZoneTest {
    public static void main(String[] args) {
        final Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        final Stream<String> stream = availableZoneIds.stream().filter(s -> s.toLowerCase().contains("asia")||s.toLowerCase().contains("taipei"));
        stream.forEach(System.out::println);
//        final ZoneId zoneId = ZoneId.systemDefault();
//        System.out.println(zoneId);
    }
}
