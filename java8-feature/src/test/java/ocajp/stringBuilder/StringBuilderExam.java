package ocajp.stringBuilder;

import org.junit.Test;

/**
 * @ClassName StringBuilderExam
 * @Description 使用StringBuilder API
 * @Author kyocoolcool
 * @Date 2019-08-27 01:02
 * @Version 1.0
 **/
public class StringBuilderExam {
    /*
     * @description: 測試StringBuilder初始容量
     * @param
     * @return: void
     * @author: kyocoolcool
     * @time: 2019-08-27 01:13
     */
    @Test
    public void test1() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("strinhellostrinhello123456");
        String s = sb.toString();
        System.out.println(s);
        System.out.println(sb.capacity());
    }
}