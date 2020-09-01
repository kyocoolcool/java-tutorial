package kyocoolcool.bean;

/**
 * @ClassName Goddness
 * 
 * @Author chris
 * @Date 2019-04-21 17:11
 * @Version 1.0
 **/

public class Goddness {
    private String name;

    public Goddness() {
    }

    public Goddness(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Goddness{" +
                "name='" + name + '\'' +
                '}';
    }
}