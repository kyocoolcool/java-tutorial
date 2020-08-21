package kyocoolcool.exam2.exam82;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/23 11:13 PM
 * @Version 1.0
 **/
 interface Planet {
     default void revolve() {

    }

    public abstract void rotate();

}

public class Test implements Planet{
    public static void main(String[] args) {

    }

     public void revolve() {

    }

    public void rotate() {

    }
}
