package kyocoolcool.exam_v1495.exam150;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/28 5:56 PM
 **/
public class Test {
    List<String> list = null;

    public static void printValues(String a) {
        System.out.println(a);
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }


    public static void main(String[] args) {
        final List<String> strings = Arrays.asList("Dog", "Cat", "Mouse");
        final Test test = new Test();

        test.setList(strings.stream().collect(Collectors.toList()));
        test.getList().forEach(Test::printValues);
    }

}
