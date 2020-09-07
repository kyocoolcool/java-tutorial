package kyocoolcool.exam_v1475.exam32;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/7 2:27 PM
 **/

interface Doable {
    public void doSomething (String s);
}

public abstract class Test implements Doable {
    public void doSomethingElse(Integer s) { }
//    public void doSomethingElse(String s) { }
}
