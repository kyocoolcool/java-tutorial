package kyocoolcool.exam.exam189;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/1 下午 10:17
 **/
class Vehicle  implements Comparable<Vehicle>{
    Integer vno;
    String name;

    public Vehicle(int vno, String name) {
        this.vno = vno;
        this.name = name;
    }

    public String toString() {
        return vno + ":" + name;
    }

    public int compareTo(Vehicle o) {
//        return this.name.compareTo(o.name);
        return this.vno.compareTo(o.vno);
    }
}

public class Test {
    public static void main(String[] args) {
        Set<Vehicle> vehicles = new TreeSet<>();
        vehicles.add(new Vehicle (10123, "Ford"));
        vehicles.add(new Vehicle (10124, "BMW"));
        System.out.println(vehicles);
    }
}