package kyocoolcool.exam_v1475.exam134;

import java.util.function.ToIntFunction;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/10 9:54 AM
 **/
public class Test {
    public static void main(String[] args) {
        String str = "Java is a programming language";
        ToIntFunction<String> indexVal = str::indexOf; //line n1
        int x = indexVal.applyAsInt("Java");//line n2
        System.out.println(x);
    }
}
