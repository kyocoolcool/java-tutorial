/**
 * @ClassName Bag
 * @Description Class也能換成interface
 * @Author kyocoolcool
 * @Date 2019-08-13 00:05
 * @Version 1.0
 **/

public class Bag<T> {
    public T data;

    public void getBag(T t) {
        System.out.println(t);
    }

    public T getBag() {
        return data;
    }
}