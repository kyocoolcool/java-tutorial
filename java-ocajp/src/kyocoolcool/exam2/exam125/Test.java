package kyocoolcool.exam2.exam125;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/24 11:30 AM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        Planet[] planets = {new Planet("A", 0), new Planet("B", 0), new Planet("C", 1), new Planet("D", 2)};
        System.out.println(planets);
        System.out.println(planets[2].name);
        System.out.println(planets[2].moons);
    }

}
