package ocajp.collection;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName ConcurrentHashMapTest
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-06-12 14:25
 * @Version 1.0
 **/

public class ConcurrentHashMapTest extends Thread{
    static ConcurrentHashMap<Object, Object> map = new ConcurrentHashMap<>();
    static ConcurrentHashMap<Object, Object> map2 = new ConcurrentHashMap<>();
    @Override
    public void run() {
        map.put("a", "yellow");
    }

    public synchronized void test2() {

    }

    public static void main(String[] args) throws InterruptedException {
        map.put("a", "red");
        map.put("a", "blue");
        new ConcurrentHashMapTest().start();
        new ConcurrentHashMapTest().start();
//        sleep(3000);
//        map2.putIfAbsent("b", "red");
//        map2.putIfAbsent("b", "blue");
        System.out.println(map.get("a"));
//        System.out.println(map2.get("b"));

    }
}