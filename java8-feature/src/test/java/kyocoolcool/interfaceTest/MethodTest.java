package kyocoolcool.interfaceTest;

import org.junit.Test;

/**
 * @ClassName MethodTest
 * @Description
 * 1.當同時Interface與Class有相同方法時，以Class為主
 * 2.當Interface有相同方法則必須改寫
 * 3.Interface支援static方法
 * @Author chris
 * @Date 2019-04-21 18:35
 * @Version 1.0
 **/

public class MethodTest extends MyClass implements MyFun,MyFun2{

//    @Override
//    public void ExceptionTest() {
//        MyFun2.super.ExceptionTest();
//    }

    @Test
    public void test1(){
        MethodTest methodTest = new MethodTest();
        methodTest.test();

    }
    @Test
    public void test2(){
        MyFun.test2();
    }


}