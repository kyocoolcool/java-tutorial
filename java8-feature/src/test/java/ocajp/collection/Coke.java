package ocajp.collection;

import java.util.Objects;

/**
 * @ClassName Coke
 *
 * @Author Chris Chen
 * @Date 2019-06-11 15:30
 * @Version 1.0
 **/

public class Coke {
    private String name;
    private Integer price;

    public Coke(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public Coke() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Coke{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coke coke = (Coke) o;
        return Objects.equals(name, coke.name) &&
                Objects.equals(price, coke.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}