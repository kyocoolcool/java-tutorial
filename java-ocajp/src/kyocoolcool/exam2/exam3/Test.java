package kyocoolcool.exam2.exam3;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/21 2:11 PM
 * @Version 1.0
 **/

public class Test {
    public int amount;

    public Test(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void changeAmount(int x) {
        amount += x;
    }

    public static void main(String[] args) {
        final Test test = new Test((int)Math.random()*1000);
//        test.amount = 0;
//        test.setAmount(0);
//        test.changeAmount(0);
//        test.getAmount() = 0;
        System.out.println(test.getAmount());
    }

}
