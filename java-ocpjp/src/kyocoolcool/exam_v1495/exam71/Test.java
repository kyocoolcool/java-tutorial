package kyocoolcool.exam_v1495.exam71;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 2:40 PM
 **/
public  class Test {
    String name;

    private Test(String name) {
        this.name = name;
    }

    public static Test getTestObject() {
        return new Test("Game");
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                '}';
    }
}
