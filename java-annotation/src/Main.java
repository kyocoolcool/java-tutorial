import kyocoolcool.Example.Person;

public class Main {
/**
 * @Author chris
 * @Description JVM自動調用物件的toString方法，從Object繼承下來
 * @Date 14:35 2019-04-25
 * @Param
 * @return void
 **/
    public static void main(String[] args) {
        Person person = new Person("張三", 20);
        String s = String.valueOf(person);
        System.out.println(s);
        System.out.println(person);
        System.out.println(person.toString());
    }
}
