package kyocoolcool.exam_v1495.exam13;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/24 10:51 AM
 **/
public class AA {
    int hh=10;
    private static class BB {
        int value=20;
    }

    public static void main(String[] args) {
        final BB bb = new BB();
        System.out.println(bb.value);
    }

}
