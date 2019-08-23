package Concurrent19;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MyContainer2
 * @Description 添加volatile使容器可見，但仍然會有兩個問題，
 * 1.容器有可能添加到6，thread2才會給出提示，準確度較低
 * 2.thread2 死循環監聽，太消耗cpu
 * @Author Chris Chen
 * @Date 2019-08-01 16:58
 * @Version 1.0
 **/

public class MyContainer2 {
    volatile List list = new ArrayList();

    public void add(Object o) {
        list.add(o);
    }

    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        MyContainer2 c = new MyContainer2();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                c.add(new Object());
                System.out.println("add " + i);
            }
        }, "t1"
        ).start();

        new Thread(() -> {
            while (true) {
                if (c.size() == 5)
                    break;
            }
            System.out.println("t2 end");
        }, "t2").start();

    }

}