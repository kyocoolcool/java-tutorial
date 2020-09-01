package kyocoolcool;

/**
 * @ClassName Hamster
 * 
 * @Author Chris Chen
 * @Date 2019/11/29 6:41 PM
 * @Version 1.0
 **/

public class Hamster {
    private String color;
    private int weight;

    public Hamster(int weight) { // first constructor
        final Hamster brown = new Hamster(weight, "brown");
        System.out.println("aaaa" + brown);
    }

    public Hamster(int weight, String color) { // second constructor
        this.weight = weight;
        this.color = color;
    }

    public static void main(String[] args) {
        final Hamster hamster = new Hamster(1);
        System.out.println(hamster);
    }

    @Override
    public String toString() {
        return "Hamster{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}