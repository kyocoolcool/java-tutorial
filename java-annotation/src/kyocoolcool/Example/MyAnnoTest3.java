package kyocoolcool.Example;

/**
 * @ClassName MyAnnoTest3
 * @Description 在屬性提供缺省值，可以不指定該屬性
 * @Author chris
 * @Date 2019-04-25 16:25
 * @Version 1.0
 **/
@MyAnno3(name = "Nick",age = 20)
public class MyAnnoTest3 {
    @MyAnno3(name = "Chris",value = "大學",age=30)
    public static void main(String[] args) {

    }
}