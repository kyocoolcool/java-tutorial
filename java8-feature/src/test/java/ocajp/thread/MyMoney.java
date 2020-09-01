package ocajp.thread;

/**
 * @ClassName Buy
 *
 * @Author Chris Chen
 * @Date 2019-06-03 13:46
 * @Version 1.0
 **/

public class MyMoney extends Thread {
    private ATM ATM;
    private Integer cost;

    MyMoney(ATM ATM, Integer cost) {
        this.ATM = ATM;
        this.cost = cost;
    }

    public void run() {
//        synchronized (ATM.class){
//        synchronized (ATM){
            ATM.buy2(cost);
//        }
//        }

    }


    public static void main(String[] args) {
        ATM ATM = new ATM(10000);
        MyMoney myMoney = new MyMoney(ATM, 2000);
        myMoney.setName("myMoney1");
        MyMoney myMoney2 = new MyMoney(ATM, 6000);
        myMoney2.setName("myMoney2");
        MyMoney myMoney3 = new MyMoney(ATM, 4000);
        myMoney3.setName("myMoney3");
        myMoney.start();
        myMoney2.start();
        myMoney3.start();
    }
}