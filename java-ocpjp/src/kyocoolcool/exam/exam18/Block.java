package kyocoolcool.exam.exam18;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/24 3:54 PM
 **/
public class Block {
    String color;
    int size;

    public Block(int size, String color) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Block{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        final ArrayList<Block> blocks = new ArrayList<>();
        blocks.add(new Block(10, "Green"));
        blocks.add(new Block(7, "Red"));
        blocks.add(new Block(12, "Blue"));
        Collections.sort(blocks,new CollectorSort());
        System.out.println(blocks);
    }
}
