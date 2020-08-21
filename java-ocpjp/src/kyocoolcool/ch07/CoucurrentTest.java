package kyocoolcool.ch07;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className CoucurrentTest
 * @description
 * @date 2020/7/27 6:20 PM
 **/

public class CoucurrentTest {
    public static class aa implements Runnable {
        String name;

        public aa(String name) {
            this.name = name;
        }


        @Override
        public void run() {
            System.out.println(name+":aa run");
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }

    public static class bb extends Thread {
        @Override
        public void run() {
            System.out.println("bb run");
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }

    public static void main(String[] args) {

//        new aa("first").run();
        System.out.println("begin");
        new bb().start();
        new Thread(new aa("second")).start();
        new bb().start();
        System.out.println("end");
    }
}
