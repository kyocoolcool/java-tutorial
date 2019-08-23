package kyocoolcool.Example;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName CollectTest
 * @Description
 * 若集合沒有定義泛型，可以使用annotation忽略警告訊息
 * @Author chris
 * @Date 2019-04-25 15:22
 * @Version 1.0
 **/
public class CollectTest {
    @SuppressWarnings(value = {"rawtypes","unused"})//忽略泛型警告及未使用警告
    public static void main(String[] args) {
        Collection list = new ArrayList();
    }
}