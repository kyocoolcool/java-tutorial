package Concurrent19;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MyContainer1
 * @Description 實現一個容器提供兩個方法add, size
 * 寫兩個thread，thread1添加10個元素到容器中，thread2實現監控容器的個數，
 * 當個數數到5時，thread2給出提示並結束。
 * 分析下面程序能完成此功能嗎?
 * @Author Chris Chen
 * @Date 2019-08-01 16:58
 * @Version 1.0
 **/

public class MyContainer1 {
    List list = new ArrayList();

    public void add(Object o) {
        list.add(o);
    }

    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        MyContainer1 c = new MyContainer1();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                c.add(new Object());
                System.out.println("add " + i);
            }
        }, "t1"
        ).start();

        new Thread(() -> {
            while (true) {
                if (c.size() > 5)
                    break;
            }
            System.out.println("t2 end");
        }, "t2").start();

    }

}