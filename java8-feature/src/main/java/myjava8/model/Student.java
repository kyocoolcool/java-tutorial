package myjava8.model;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName Student
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-05-02 11:22
 * @Version 1.0
 **/
public class Student {
    private String id;
    private String name;
    private Integer age;
    private Date birthDay;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
}