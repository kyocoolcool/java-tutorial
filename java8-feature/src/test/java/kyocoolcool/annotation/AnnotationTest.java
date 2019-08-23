package kyocoolcool.annotation;


import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @ClassName AnnotationTest
 * @Description
 * 重複註解與類型註解
 * @Author chris
 * @Date 2019-04-22 22:04
 * @Version 1.0
 **/

public class AnnotationTest {
    //Check framework
    private /*@NonNull*/ Object obj= null;

    @Test
    public void test() throws Exception {
        Class<MyAnnotationTest> testClass = MyAnnotationTest.class;
        Method m1 = testClass.getMethod("show");
        Myannotation[] mas = m1.getAnnotationsByType((Myannotation.class));
        for (Myannotation ma : mas) {
            System.out.println(ma.value());
        }
    }
}