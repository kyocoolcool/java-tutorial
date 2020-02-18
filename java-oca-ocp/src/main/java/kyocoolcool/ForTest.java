package kyocoolcool;

/**
 * @ClassName ForTest
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019/11/15 4:05 PM
 * @Version 1.0
 **/

public class ForTest {
    public static void main(String[] args) {
        String start = "AniMaL ";
        String trimmed = start.trim(); // "AniMaL"
        String lowercase = trimmed.toLowerCase(); // "animal"
        String result = lowercase.replace("a", "A"); // "AnimAl"
        System.out.println(result);
    }
}