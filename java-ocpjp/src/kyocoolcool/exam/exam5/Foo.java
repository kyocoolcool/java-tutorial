package kyocoolcool.exam.exam5;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/21 4:49 PM
 **/
public class Foo<K,V> {
    private K key;
    private V value;

    public Foo(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static <T> Foo<T,T> hello(T t) {
        return new Foo<T,T>(t, t);
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        final Foo<String, Integer> steve = new Foo<String, Integer>("Steve", 100);
        final Foo<String, String> hello = Foo.<String>hello("Hello World!");
//        final Foo<Object, Object> steve1 = new Foo<String, Integer>("Steve", 100);
        final Foo<String, String> stringStringFoo = new Foo<>("Jong", "A");
    }
}
