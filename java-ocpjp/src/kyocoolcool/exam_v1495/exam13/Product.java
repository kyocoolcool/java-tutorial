package kyocoolcool.exam_v1495.exam13;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/24 1:57 PM
 **/
public class Product {
    interface MoveAble {
        public void move();
    }

    MoveAble move = new MoveAble(){
        public  void move() {}
    };
}
