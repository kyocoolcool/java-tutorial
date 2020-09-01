package ocajp.collection;


import java.util.ArrayList;

/**
 * @ClassName ListTest
 * 
 * @Author Chris Chen
 * @Date 2019-06-11 15:37
 * @Version 1.0
 **/

public class ListTest {
    public static void main(String[] args) {
        ArrayList<Coke> list = new ArrayList<>();
        Coke coke = new Coke("coke1",100);
        Coke coke2 = new Coke("coke2",200);
        Coke coke3 = new Coke("coke1",100);
        list.add(coke);
        list.add(coke2);
        int i = list.indexOf(coke3);
        System.out.println(i);
    }

    public <A extends Number> int  a(ArrayList<A> b) {
        return 123;
    }
}