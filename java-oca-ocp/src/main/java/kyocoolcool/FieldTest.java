package kyocoolcool;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName FieldTest
 * 
 * @Author Chris Chen
 * @Date 2019/10/29 4:08 PM
 * @Version 1.0
 **/

public class FieldTest {
    private String name;
    protected Map<String,String> key;

    public Map<String, String> getKey() {
        return key;
    }

    public void setKey(Map<String, String> key) {
        this.key = key;
    }

    public void test() {
        HashMap<String, String> map = new HashMap<>();
        map.put("c", "c");
        key = map;
    }

    public void test2() {
        System.out.println(key);
    }

    public static void main(String[] args) {
         FieldTest fieldTest = new FieldTest();
         fieldTest.test();
         fieldTest.test2();
    }
}