package kyocoolcool.exam_v1475.exam122;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public enum Continent {ASIA, EUROPE}

    String name;
    Continent region;

    public Test(String na, Continent reg) {
        name = na;
        region = reg;
    }

    public String getName() {
        return name;
    }

    public Continent getRegion() {
        return region;
    }

    public static void main(String[] args) {
        List<Test> couList = Arrays.asList(
                new Test("Japan", Test.Continent.ASIA),
                new Test("Italy", Test.Continent.EUROPE),
                new Test("Germany", Test.Continent.EUROPE));
        Map<Test.Continent, List<String>> regionNames = couList.stream()
                .collect(Collectors.groupingBy(Test::getRegion,
                        Collectors.mapping(Test::getName, Collectors.toList())));
        System.out.println(regionNames);
    }
}
