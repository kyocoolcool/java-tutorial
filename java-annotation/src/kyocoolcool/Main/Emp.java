package kyocoolcool.Main;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * @ClassName Emp
 * @Description TODO
 * @Author chris
 * @Date 2019-04-25 19:02
 * @Version 1.0
 **/
@Table(tableName = "EMP")
public class Emp implements Serializable {
    private static final long serialVersionUID=-123456789L;
    @Column(columnName = "ID",columnType = "INT",columnLength = "4",conlumnConstraint = "PRIMARY KEY")
    private Integer id;
    @Column(columnName = "NAME",columnType = "VARCHAR",columnLength = "10")
    private String name;
    @Column(columnName = "AGE",columnType = "INT",columnLength = "2")
    private Integer age;
    @Column(columnName = "BIRTH",columnType = "DATE")
    private Date birth;
    @Column(columnName = "SAL",columnType = "DOUBLE",columnLength = "7,2")
    private Double sal;

    public Emp() {
    }

    public Emp(Integer id, String name, Integer age, Date birth, Double sal) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birth = birth;
        this.sal = sal;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                ", sal=" + sal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return Objects.equals(id, emp.id) &&
                Objects.equals(name, emp.name) &&
                Objects.equals(age, emp.age) &&
                Objects.equals(birth, emp.birth) &&
                Objects.equals(sal, emp.sal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, birth, sal);
    }
}