package kyocoolcool.exam_v1495.exam100;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 6:47 PM
 **/
public class Foo<K, V> {
    private K key;
    private V value;

    public Foo(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static <T> Foo<T, T> twice(T value) {
        return new Foo<T,T>(value,value);
    }

    @Override
    public String toString() {
        return "Foo{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public static void main(String[] args) {
//        final Foo<String, String> hello_world = Foo.<String>twice("Hello World");
//        final Foo<Object, Object> steve = new Foo<>("Steve", 100);
//        System.out.println(steve);
//        System.out.println(hello_world);
//        final Foo<String, String> stringStringFoo = new Foo<>("John", "A");
        final Foo<Object, Integer> objectObjectFoo = new Foo<Object, Integer>("Steve",100);
        System.out.println(objectObjectFoo);
    }
}
