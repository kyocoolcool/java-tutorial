package myjava8;

@FunctionalInterface
public interface InterfaceTest {
    void test();
    String toString();
}

 class Test1{
    public void myTest(InterfaceTest interfaceTest){
        System.out.println(1);
        interfaceTest.test();
        System.out.println(2);
    }

     public static void main(String[] args) {
         Test1 test1 = new Test1();
         test1.myTest(new InterfaceTest() {
             @Override
             public void test() {
                 System.out.println("Test1");
             }
         });
         System.out.println("--------------");
         test1.myTest(()->{
             System.out.println("test2");
         });
         System.out.println("--------------");
         InterfaceTest interfaceTest=()->{
             System.out.println("test3");
         };
         System.out.println(interfaceTest.getClass());
         System.out.println(interfaceTest.getClass().getSuperclass());
         System.out.println(interfaceTest.getClass().getInterfaces()[0]);
         interfaceTest.test();
     }
}