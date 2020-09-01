package ocajp.overWrite_OverLoading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Dog
 * 
 * @Author Chris Chen
 * @Date 2019-06-13 10:29
 * @Version 1.0
 **/

public class Dog extends Animal implements Cloneable {
    private int i;
    private ArrayList arrayList;

    @Override
    public String toString() {
        return "Dog{" +
                "i=" + i +
                ", arrayList=" + arrayList +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Dog clone = (Dog) super.clone();
        clone.arrayList = (ArrayList) this.arrayList.clone();
        return clone;
    }

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }

    public void eat(int a) {
        System.out.println("Dog eat " + a + " meats");
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Dog dog = new Dog();
//        dog.eat(2);
        dog.i = 5;
        dog.arrayList = new ArrayList<>();
        dog.arrayList.add("aa");
        Dog o = (Dog) dog.clone();
    /*    System.out.println(dog);
        System.out.println(o);*/
        o.eat();
        int i[] = {1, 2, 3, 4, 5};
        int[] a = i.clone();
        System.out.println(a[2]);
        System.out.println(a.equals(i));
        dog.arrayList.add("bb");
        dog.i = 7;
        System.out.println(dog);
        System.out.println(o);
    }
}