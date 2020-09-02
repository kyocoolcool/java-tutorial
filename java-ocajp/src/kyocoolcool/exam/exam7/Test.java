package kyocoolcool.exam.exam7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/9 5:04 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        String[] strings = {"hi", "how", "are", "you"};
//        final ArrayList<String> a = new ArrayList<>();
//        a.add("hi");
//        a.add("how");
//        a.add("are");
//        a.add("you");
        final List<String> a = new ArrayList<>(Arrays.asList(strings));
//        final boolean b = a.removeIf(x -> {
//            System.out.println(x);
//            return x.length() <= 2;
//        });
//
//        System.out.println(b);
//        System.out.println(a);
        if(a.removeIf(x->{
            System.out.println(x);
            return x.length()<=2;
        })){
            System.out.println(" removed");
        }
        System.out.println(a);
    }
}
