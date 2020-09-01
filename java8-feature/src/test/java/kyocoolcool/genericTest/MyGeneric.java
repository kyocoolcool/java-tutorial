package kyocoolcool.genericTest;

import org.junit.Test;

import java.util.List;

/**
 * @ClassName GenericEntend
 *
 * @Author chris
 * @Date 2019-03-29 09:22
 * @Version 1.0
 **/

public class MyGeneric<T> extends GenericTest<String> implements GenericInterface<String>{
    private T age;
    private String height="very high";

    public T hello(T age){
        return this.age=age;
    }

    public String oooooo(){
        return height ;
    }

    @Test
    public void quickTest() {
        MyGeneric ge=new MyGeneric();
        ge.setName(123);
        System.out.println(ge.getName());
        System.out.println(ge.hello(20));
        System.out.println("----------");
        System.out.println(Integer.parseInt(ge.ooooo("2"))+3);
        System.out.println("----------");
        System.out.println(ge.oooooo());
    }


    @Override
    public String ooooo(String o) {
        return o;
    }

    @Test
    public void test1() {
        String s = GenericInterface.show("Hello");
        System.out.println(s);
    }

    @Test
    public void test2(){
        String hello = GenericInterface.hello(1);
        System.out.println(hello);
        MyGeneric myGeneric = new MyGeneric();

        String hi = myGeneric.hi(1.0);
        System.out.println(hi);

    }

}