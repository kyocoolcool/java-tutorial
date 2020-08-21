package kyocoolcool.exam.exam110;

/**
 * @ClassName TestA
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/19 10:56 AM
 * @Version 1.0
 **/

class Alpha {
    int ns;
    static int s;

    public Alpha(int ns) {
        if (s < ns) {
            s = ns;
            this.ns = ns;
        }
    }

    public void doPrint() {
        System.out.println("ns = "+ns+" , s= "+s);
    }
}

public class TestA {
    public static void main(String[] args) {
        final Alpha alpha = new Alpha(50);
        final Alpha alpha2 = new Alpha(125);
        final Alpha alpha3 = new Alpha(100);
        alpha.doPrint();
        alpha2.doPrint();
        alpha3.doPrint();

    }
}
