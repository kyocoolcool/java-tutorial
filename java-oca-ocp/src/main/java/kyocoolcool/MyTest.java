package kyocoolcool;

import java.util.Arrays;

/**
 * @ClassName MyTest
 *
 * @Author Chris Chen
 * @Date 2019/11/15 6:53 PM
 * @Version 1.0
 **/

public class MyTest {
    public int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyTest myTest = (MyTest) o;
        return age == myTest.age;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(age);
//    }

    public static void main(String[] args) {
            int[] numbers = new int[] {3,2,1};
         System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 3));
    }
}