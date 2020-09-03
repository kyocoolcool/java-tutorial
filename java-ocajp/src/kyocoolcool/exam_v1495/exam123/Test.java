package kyocoolcool.exam_v1495.exam123;

/**
 * @ClassName Test
 *
 * @Author Chris Chen
 * @Date 2020/2/20 3:36 PM
 * @Version 1.0
 **/
interface DownLoadable {
    public void downLoad();
}

interface Readable extends DownLoadable{
    public void readBook();
}

abstract class Book implements Readable {
    public void readBook() {
        System.out.println("Read book");
    }
}

class EBook extends Book {
    @Override
    public void readBook() {
        System.out.println("Read E book");
    }

    @Override
    public void downLoad() {
        System.out.println("hello");
    }
}
public class Test {

}
