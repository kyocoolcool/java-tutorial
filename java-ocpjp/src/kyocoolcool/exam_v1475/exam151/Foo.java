package kyocoolcool.exam_v1475.exam151;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/10 10:42 AM
 **/
public class Foo<K, V> {
    private K key;
    private V value;

    public Foo(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static <T> Foo<T, T> twice(T value) {
        return new Foo<T, T>(value, value);
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
//        Foo<Object,Object> percentage = new Foo <Integer,Integer> (97, 32);
//        System.out.println(percentage);
//        Foo<String, Integer> mark = new Foo<String, Integer> ("Steve", 100);
//        System.out.println(mark);
//        Foo<String, String> pair = Foo.<String>twice ("Hello World!");
//        System.out.println(pair);
//        Foo<String, String> grade = new Foo <> ("John", "A");
//        System.out.println(grade);
    }
}
