package kyocoolcool.bean;

import java.util.Optional;

/**
 * @ClassName NewMan
 * 
 * @Author chris
 * @Date 2019-04-21 17:38
 * @Version 1.0
 **/

public class NewMan {
    Optional<Goddness> goddness=Optional.empty();

    public NewMan() {
    }

    public NewMan(Optional<Goddness> goddness) {
        this.goddness = goddness;
    }

    public Optional<Goddness> getGoddness() {
        return goddness;
    }

    public void setGoddness(Optional<Goddness> goddness) {
        this.goddness = goddness;
    }

    @Override
    public String toString() {
        return "NewMan{" +
                "goddness=" + goddness +
                '}';
    }
}