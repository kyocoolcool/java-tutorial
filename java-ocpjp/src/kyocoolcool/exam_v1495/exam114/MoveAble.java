package kyocoolcool.exam_v1495.exam114;

public interface MoveAble<Integer> {
    public default void walk(Integer distance) {
        System.out.println("walking");
    }

    public void run(Integer distance);


    public static void main(String[] args) {
         MoveAble move = n -> System.out.println(n);
        move.run(100);
        move.walk(200);

    }
}
