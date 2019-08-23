package kyocoolcool.interfaceTest;

public interface MyFun {
    default void test(){
        System.out.println("哈哈哈");
    }
    public static void test2(){
        System.out.println("NO~~~~~~~");
    }
}
