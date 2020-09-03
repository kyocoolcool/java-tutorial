package kyocoolcool.exam_v1495.exam13;



/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/24 10:40 AM
 **/
public class Computer {

    private SecondCard card = new SecondCard();

    public SecondCard getCard() {
        return card;
    }

    public void setCard(SecondCard card) {
        this.card = card;
    }

    private abstract class Card {

    }

    private class SecondCard extends Card {
        private int a = 10;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Computer().getCard().a);
    }

}
