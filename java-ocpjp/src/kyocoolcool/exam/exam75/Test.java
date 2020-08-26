package kyocoolcool.exam.exam75;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 3:31 PM
 **/
public class Test<T> {
    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }

    public static void main(String args[]) {
        Test<String> type = new Test<>();
        Test type2 = new Test();//line n1
        type.set("Java");
        type2.set(100);//line n2
        System.out.print(type.get() + " " + type2.get());
    }
}
