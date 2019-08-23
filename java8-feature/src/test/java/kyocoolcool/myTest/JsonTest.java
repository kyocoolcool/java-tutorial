package kyocoolcool.myTest;

import myjava8.model.GoodStudent;
import myjava8.model.Student;
import org.json.JSONObject;
import org.junit.Test;
import java.io.StringWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName JsonTest
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-05-02 08:15
 * @Version 1.0
 **/

public class JsonTest {
    /**
     * @description: map轉json
     * @param
     * @return: void
     * @author: Chris Chen
     * @time: 2019-05-02 11:49
     */
    @Test
    public void mapToJson(){
        Map<Object, Object> map = new HashMap<>();
        Student student = new Student();
        student.setId("1");
        student.setBirthDay(new Date());
        student.setAge(1);
        student.setName("Chris");
        map.put("student", student);
        map.put("Status", "success");

        JSONObject obj = new JSONObject(map);
        StringWriter out = new StringWriter();
        obj.write(out);
        String jsonText = out.toString();
        System.out.print(jsonText);
    }

    @Test
    public void beanToJson(){
        Student student = new Student();
        student.setId("1");
        student.setBirthDay(new Date());
        student.setAge(1);
        student.setName("Chris");
        JSONObject obj = new JSONObject(student);
        StringWriter out = new StringWriter();
        obj.write(out);
        String jsonText = out.toString();
        System.out.print(jsonText);
    }



}