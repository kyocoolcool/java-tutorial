package kyocoolcool.exam_v1495.exam8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/21 5:32 PM
 **/
public class Vehical {
    int vId;
    String vName;

    public Vehical(int vId, String vName) {
        this.vId = vId;
        this.vName = vName;
    }

    public int getvId() {
        return vId;
    }

    public String getvName() {
        return vName;
    }

    @Override
    public String toString() {
        return "Vehical{" +
                "vName='" + vName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        final List<Vehical> vehicals = Arrays.asList(new Vehical(2, "Car"), new Vehical(3, "Bike"), new Vehical(1, "Tuek"));
        vehicals.stream()
//                .sorted((x,y)->x.getvId()-y.getvId())
//                .map(v->v.getvId()).sorted()
//                .sorted((x,y)->Integer.compare(x.getvId(),y.vId))
                .sorted(Comparator.comparing(x->x.getvId()))
                .forEach(System.out::println);
    }
}
