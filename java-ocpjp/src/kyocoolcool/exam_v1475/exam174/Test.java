package kyocoolcool.exam_v1475.exam174;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/10 1:44 PM
 **/
public class Test<T> {
    private T t;
    public T get () {
        return t;
    }
    public void set (T t) {
        this.t = t;
    }
    public static void main (String args [ ] ) {
        Test<String> type = new Test<>();
        Test type1 = new Test ();//line n1
        type.set("Java");
        type1.set(100);//line n2
        System.out.print(type.get() + " " + type1.get());
        final Object o = type1.get();
        System.out.println(o);
    }}
