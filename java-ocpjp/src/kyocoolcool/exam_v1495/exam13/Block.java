package kyocoolcool.exam_v1495.exam13;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/24 11:47 AM
 **/
public class Block {
    static int bno = 20;

    protected static class Counter {
        int locate;

        public Counter() {
            this.locate = bno;
        }

//        public static void main(String[] args) {
//            final Counter counter = new Counter();
//            System.out.println(counter.locate);
//        }
    }

    public static void main(String[] args) {
        final Counter counter = new Counter();
        System.out.println(counter.locate);
    }
//    public static void main(String[] args) {
//    }
}
