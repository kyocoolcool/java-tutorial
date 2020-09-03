package kyocoolcool.exam_v1495.exam95;

/**
 * @ClassName ReportTool
 * 
 * @Author Chris Chen
 * @Date 2020/2/17 6:05 PM
 * @Version 1.0
 **/

interface Exportable {
     void export();
}

class Tool implements Exportable {
    public void export() {
        System.out.println("tool export");
    }
}

public class ReportTool extends Tool implements Exportable{
    public void export() {
        System.out.println("ReportTool export");
    }

    public static void main(String[] args) {
        final Tool reportTool = new ReportTool();
        final Tool tool = new Tool();
        a(reportTool);
        a(tool);
    }

    public static void a(Exportable ex) {
        ex.export();
    }
}
