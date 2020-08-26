package kyocoolcool.exam.exam96;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 6:14 PM
 **/
public class Country {
    public enum Continent {ASIA, EUROPE}

    String name;
    Continent region;

    public Country(String na, Continent reg) {
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
        List<Country> couList = Arrays.asList(
                new Country("Japan", Country.Continent.ASIA),
                new Country("Italy", Country.Continent.EUROPE),
                new Country("Germany", Country.Continent.EUROPE));
        Map<Continent, List<String>> regionNames = couList.stream()
                .collect(Collectors.groupingBy(Country::getRegion,
                        Collectors.mapping(Country::getName, Collectors.toList())));
        System.out.println(regionNames);
    }

}
