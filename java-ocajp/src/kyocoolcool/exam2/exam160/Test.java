package kyocoolcool.exam2.exam160;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/24 3:10 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        int iVar = 100;
        float fVar = 100.100f;
        double dVar = 123;
        fVar = iVar;
//        iVar = fVar;
//        fVar = dVar;
        dVar = fVar;
//        iVar = dVar;
        dVar = iVar;
    }
}
