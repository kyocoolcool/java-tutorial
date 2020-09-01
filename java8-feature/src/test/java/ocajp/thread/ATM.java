package ocajp.thread;

/**
 * @ClassName ATM
 *
 * @Author Chris Chen
 * @Date 2019-06-03 14:20
 * @Version 1.0
 **/

public class ATM {
    Integer balance;
    static Integer balance2;

    public ATM(Integer balance) {
        this.balance2 = balance;
    }

    public synchronized static Integer buy2(Integer cost) {
        for (int i = 0; i < 10000; i++) {
        }
        Integer temp = balance2;
        balance2 -= cost;
        if (balance2 < 0) {
            System.out.println("金額不足 取消交易");
            balance2 = temp;
            System.out.println("剩下多少錢" + balance2);
            return temp;
        }
        System.out.println("剩下多少錢" + balance2);
        return balance2;
    }

    public  Integer buy1(Integer cost) {
        for (int i = 0; i < 10000; i++) {
        }
//        synchronized (ATM.class) {
        Integer temp = balance;
        balance -= cost;
        if (balance < 0) {
            System.out.println("金額不足 取消交易");
            balance = temp;
            System.out.println("剩下多少錢" + balance);
            return temp;
        }
        System.out.println("剩下多少錢" + balance);
        return balance;
//        }
    }
}