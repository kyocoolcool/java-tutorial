import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName GenericDemo
 * @Description GenericDemo use Wildcard，用在寫框架或是API較靈活通用，理解用法後對於讀源碼會有所幫助
 * @Author kyocoolcool
 * @Date 2019-08-13 00:06
 * @Version 1.0
 **/
public class GenericDemo {
    public static void main(String[] args) {
        Bag<Integer> bag = new Bag<>();
        bag.data=20;
        bag.getBag(1);
        Bag<String> bag2 = new Bag<>();
        bag2.getBag("hello");
        bag2.data="apple";
        Bag<Number> bag3 = new Bag<>();
        bag3.data = 100;
        bag3.getBag(10);
        Bag<? extends Number> bag4 = new Bag<>();
        /* 通用符 ? extends */
        getUp(bag);
//        getUp(bag2);//僅支援Number及其子類
        getUp(bag3);
        System.out.println("-------------");
        /* 通用符 ? super */
        getUp2(bag);
        getUp2(bag3);

        /* 泛型方法調用*/
        String[] arrays={"AAA","BBBB","CCC","DDD"};
        String[] fun = GenericDemo.fun(arrays, 1, 3);
        System.out.println("--------------");
        System.out.println(Arrays.toString(fun));
        System.out.println("--------------");

        /* Set裡的范型E，裡面放著Map，Map裡面放著Integer,String */
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "apple");
        map.put(2, "lemon");
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for (Map.Entry entry : set) {
            System.out.println(entry.getKey()+"----"+entry.getValue());
        }
    }

    /* ? extends 用法 */
    public static void getUp(Bag<? extends Number> bag) {
        System.out.println("data:"+bag.getBag());
    }

    /* ? super 用法 */
    public static void getUp2(Bag<? super Integer> bag) {
        System.out.println("data:"+bag.getBag());
    }

    /* 范型方法 */
    public static <T> T[] fun(T[] array,int x,int y) {
        T temp = array[x];
        array[x] = array[y];
        array[y] = temp;
        return array;
    }
}