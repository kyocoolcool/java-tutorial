package kyocoolcool;

/**
 * @ClassName FruitGenerator
 * @Description TODO
 * @Author chris
 * @Date 2019-03-25 00:16
 * @Version 1.0
 **/

public class FruitGenerator<T> implements Generator<T>{
    @Override
    public T next() {
        return null;
    }

    public static void showKeyValue1(Generic<Number> obj){
        System.out.println("泛型測試 key value is " + obj.getKey());
    }




}