package kyocoolcool.ch01;

import java.util.ArrayList;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test14
 * @description
 * @date 2020/6/21 10:43 AM
 **/

public class Test14 {
    static class Hello {

    }

    public static void main(String[] args) {
        Hello h = new Hello();
        ArrayList<Hello> arrayList = new ArrayList<>();
        Runnable runnable = new Thread();
        int x = 0;
        if(h instanceof Hello )
            x++;
//        if(arrayList instanceof Hello)
//            x++;
        if(runnable instanceof  Hello)
            x++;
    }
}
