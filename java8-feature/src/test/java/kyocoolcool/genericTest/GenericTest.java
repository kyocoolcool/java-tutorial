package kyocoolcool.genericTest;

/**
 * @ClassName genericTest.genericTest
 * @Description TODO
 * @Author chris
 * @Date 2019-03-29 09:21
 * @Version 1.0
 **/

public class GenericTest<T> {
    private T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}