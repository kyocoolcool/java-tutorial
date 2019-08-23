package myjava8.model;


import lombok.Data;

import java.util.Date;

/**
 * @ClassName GoodStudent
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-05-01 23:19
 * @Version 1.0
 **/
@Data
public class GoodStudent {
    private String id;
    private String name;
    private Integer age;
    private Date birthDay;
    private Integer score;

}