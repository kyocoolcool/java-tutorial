package kyocoolcool.exam.exam13;

import java.util.Objects;

/**
 * @ClassName Patient
 * 
 * @Author Chris Chen
 * @Date 2020/2/9 5:56 PM
 * @Version 1.0
 **/

public class Patient {
    String name;

    public Patient(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(name, patient.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }


    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                '}';
    }
}
