package kyocoolcool.exam_v1495.exam33;

import org.jetbrains.annotations.NotNull;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/25 1:56 PM
 **/
public class Vehicle implements Comparable<Vehicle>{
    int vno;
    String name;

    public Vehicle(int vno, String name) {
        this.vno = vno;
        this.name = name;
    }

    public String toString() {
        return vno + ":" + name;
    }

    @Override
    public int compareTo(@NotNull Vehicle o) {
        return this.vno-o.vno;
    }

    public static void main(String[] args) {
        Set<Vehicle> vehicles = new TreeSet<>();
        vehicles.add(new Vehicle(10123, "Ford"));
        vehicles.add(new Vehicle(10124, "BMW"));
        System.out.println(vehicles);
    }
}

