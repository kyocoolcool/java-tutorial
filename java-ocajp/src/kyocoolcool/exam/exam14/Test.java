package kyocoolcool.exam.exam14;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/11 11:15 AM
 * @Version 1.0
 **/

public class Test{
    public static void main(String[] args) {
        final aa aaa = new aaa();
        final aa aa = new aa();
        call(aaa);
        call(aa);
    }

    public static void call(a a) {
        a.export();
    }
}


interface a {
    void export();
}

class aa implements a {
    public void export() {
        System.out.println("aa::export");
    }
}

class aaa extends aa {
   public  void export() {
        System.out.println("aaa:export");
    }
}
