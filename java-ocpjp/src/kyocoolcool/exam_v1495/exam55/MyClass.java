package kyocoolcool.exam_v1495.exam55;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/25 下午 11:27
 **/
public class MyClass implements AutoCloseable{
    int test;

    public MyClass copyObject() {
        return this;
    }

    @Override
    public void close() throws Exception {
        System.out.println("closing");
    }

    public static void main(String[] args) throws Exception {
        MyClass myClass;
        try (MyClass myClass1 = new MyClass()){
            myClass1.test=100;
            myClass = myClass1.copyObject();
        }
        System.out.println(myClass.test);

    }
}