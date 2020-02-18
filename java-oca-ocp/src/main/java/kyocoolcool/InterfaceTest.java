package kyocoolcool;

public interface InterfaceTest {
    default void eat() {
        System.out.println("eat");
    }

    void hello();

    void hello2();
}
