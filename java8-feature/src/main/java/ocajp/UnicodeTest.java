package ocajp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName UnicodeTest
 * 
 * @Author Chris Chen
 * @Date 2019-07-12 11:36
 * @Version 1.0
 **/

public class UnicodeTest {
    public static void main(String[] args) {
//        char z = '翁';
//        System.out.println(z);
        String a = "翁千\uD85A\uDF73";
        char[] chars = a.toCharArray();
        String z = "1";
        for (char aChar : chars) {
            String s = String.valueOf(aChar);
            Integer result = isChinneseOrEnglish(s);
            if (result == 1) {
                System.out.println("有問題的字");
            }
        }
//        System.out.println(a.length());
//        isChinneseOrEnglish(a);
    }

    private static Integer isChinneseOrEnglish(String str) {
        String reg = "[\\u4E00-\\u9FFF]+";

        Matcher m = Pattern.compile(reg).matcher(str);
        if (m.find()) {
            System.out.println(str + "---是中文");
            return 0;
        }
        System.out.println(str + "---不是中文");
        return 1;

    }
}