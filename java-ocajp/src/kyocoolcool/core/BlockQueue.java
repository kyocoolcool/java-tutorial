package kyocoolcool.core;

/**
 * @author Chris Chen
 * @version 1.0
 * @className BlockQueu
 * @description
 * @date 2020/3/16 9:58 AM
 **/

public class BlockQueue {
    String data;
    BlockQueue next;

    public BlockQueue(String data) {
        this.data = data;
    }

    public void add(BlockQueue blockQueue) {
        next = blockQueue;
    }

    public static void main(String[] args) throws InterruptedException {
        int a = 100;
        final int i = a >>3;
        System.out.println(i);
    }
}
