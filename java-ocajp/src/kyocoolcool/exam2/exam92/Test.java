package kyocoolcool.exam2.exam92;

/**
 * @ClassName Test
 *
 * @Author Chris Chen
 * @Date 2020/2/23 11:54 PM
 * @Version 1.0
 **/

interface Exportable {
    void export();
}

class Tool implements Exportable {

    public void export() {
        System.out.println("Tool");
    }
}

class Reportool extends Tool {
     public void export() {
        System.out.println("RTool");
    }
}

public class Test {
}
