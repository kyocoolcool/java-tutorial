package kyocoolcool.genericTest;

import java.util.Arrays;
import java.util.List;

public interface GenericInterface<T> {

    public T ooooo(T o);

    public static <T> String show(T value) {
        return value == "Hello" ?  "HI": "HIHI";
    }

    public static <K> String hello(K k){
        return "Jimmie";
    }

    public default <Q> String hi(Q q){
        return "Queen";
    }
}
