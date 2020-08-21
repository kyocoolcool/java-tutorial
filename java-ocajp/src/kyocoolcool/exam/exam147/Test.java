package kyocoolcool.exam.exam147;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/20 6:09 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        int[] stack = {10, 20, 30};
        int size = 3;
        int idx = 0;
        do {
            idx++;
        }
        while (idx < size - 1);
        System.out.println("The top element :"+stack[idx]);

    }
}
