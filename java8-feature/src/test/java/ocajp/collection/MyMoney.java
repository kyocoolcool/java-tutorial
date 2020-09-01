package ocajp.collection;

/**
 * @ClassName MyMoney
 * 
 * @Author Chris Chen
 * @Date 2019-06-11 17:33
 * @Version 1.0
 **/

public class MyMoney implements Comparable<MyMoney> {
    private Integer money;

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public MyMoney() {
    }

    public MyMoney(Integer money) {
        this.money = money;
    }

    @Override
    public int compareTo(MyMoney o) {
        return money - o.money;
    }
}