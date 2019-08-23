package kyocoolcool.Example;

/**
 * @ClassName MyAnnotationTest
 * @Description TODO
 * @Author chris
 * @Date 2019-04-25 15:47
 * @Version 1.0
 **/
@MyAnnotation
public class MyAnnotationTest {
    @MyAnnotation
    private String name;
    @MyAnnotation
    public static void main(String[] args) {
        @MyAnnotation
        String aa = "Hello";
    }
}