package ocajp.collection;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @ClassName CopyOnWriteArrayListTest
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-06-12 13:43
 * @Version 1.0
 **/

public class CopyOnWriteArrayListTest extends Thread {
    static CopyOnWriteArrayList<Integer> myList = new CopyOnWriteArrayList();

    public static void main(String[] args) throws InterruptedException {
        myList.add(11);
        myList.add(22);
        myList.add(44);
        myList.add(33);
        new CopyOnWriteArrayListTest().start();
        /**會重新撈取*/
//        for (int i = 0; i < myList.size(); i++) {
//            Thread.sleep(1000);
//            System.out.println(myList.get(i));
//        }
        for (Integer integer : myList) {
            Thread.sleep(3000);
            System.out.println(integer);
        }
    }

    @Override
    public void run() {
//        try {
////            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        myList.add(66);
        System.out.println("size:" + myList.size() + " elements");
    }
}