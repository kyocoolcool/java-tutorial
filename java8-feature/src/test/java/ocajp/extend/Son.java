package ocajp.extend;

import java.io.IOException;

/**
 * @ClassName Son
 *
 * @Author Chris Chen
 * @Date 2019-05-30 17:45
 * @Version 1.0
 **/

class Father {
    String nono = "nnn";
    Apple apple;

    public Apple getApple() throws Exception{
        return new Apple();
    }

    void ha() {
        System.out.println("ha");
    }
}
class Apple{
     String a = "aa";

    @Override
    public String toString() {
        return "Buy{" +
                "a='" + a + '\'' +
                '}';
    }
}

class Apple2 extends Apple{
//    public String a = "bb";

    @Override
    public String toString() {
        return "Apple2{" +
                "a='" + a + '\'' +
                '}';
    }
}




public class Son extends Father{
     String nono = "yyy";

    public void test() {

    }

    public void test(String s) {

    }

    public void test(Integer a) {

    }


    @Override
    public Apple getApple() throws IOException {
        return new Apple2();
    }

    @Override
    void ha() {
        System.out.println("hahahahaha");;
    }

    public static void main(String[] args) throws IOException {
        Father father = new Son();
//        son.ha();
//        System.out.println(son.getApple().toString());
//        String a = son.getApple().a;
//        System.out.println(a);
        System.out.println(father.nono);
        father.ha();
    }
}