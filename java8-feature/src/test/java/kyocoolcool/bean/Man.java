package kyocoolcool.bean;

/**
 * @ClassName Man
 *
 * @Author chris
 * @Date 2019-04-21 17:11
 * @Version 1.0
 **/

public class Man {

    public Man() {
    }

    public Man(Goddness goddness) {
        this.goddness = goddness;
    }

    public Goddness goddness;

    public Goddness getGoddness() {
        return goddness;
    }

    public void setGoddness(Goddness goddness) {
        this.goddness = goddness;
    }

    @Override
    public String toString() {
        return "Man{" +
                "goddness=" + goddness +
                '}';
    }
}