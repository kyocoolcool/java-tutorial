package kyocoolcool.exam_v1475.exam140;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/10 10:15 AM
 **/
public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter GDP: ");
        int GDP = Integer.parseInt (br.readLine());
        System.out.println(GDP);
    }
}
