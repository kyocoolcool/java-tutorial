package kyocoolcool.Example;

import java.lang.annotation.Annotation;

/**
 * @ClassName MyAnnoTest67
 * @Description
 * 反射操作:通過class對象獲取類的基本訊息、方法訊息、構造方法訊息、屬性訊息、透過class創造對象，透過class調用對象方法
 * @Author chris
 * @Date 2019-04-25 17:01
 * @Version 1.0
 **/

public class MyAnnoTest67 {
    //透過反射操作獲取獲取類中攜帶的訊息
    public static  void getAnnotation() throws ClassNotFoundException {
        SubClass superClass = new SubClass();
        Class clz = superClass.getClass();
//        Class clz = Class.forName("kyocoolcool.Example.SubClass");
//        Class clz = SubClass.class;
        Annotation[] annotations = clz.getAnnotations();
        System.out.println("數量: "+annotations.length);
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException {
        getAnnotation();
    }
}