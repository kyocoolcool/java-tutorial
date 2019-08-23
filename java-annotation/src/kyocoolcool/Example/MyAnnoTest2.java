package kyocoolcool.Example;

/**
 * @ClassName MyAnnoTest2
 * @Description 若annotation中只有一個屬性並且是value，可以忽略屬性名稱
 * @Author chris
 * @Date 2019-04-25 16:19
 * @Version 1.0
 **/
@MyAnno2(value = {"hello","good"})
public class MyAnnoTest2 {
    @MyAnno2({"hello","good"})
    public static void main(String[] args) {

    }
}