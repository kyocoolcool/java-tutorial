package kyocoolcool.exam_v1495.exam73;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 3:19 PM
 **/
public class Canvas implements Drawable {
    public void draw() {
    }
}

 abstract class Board extends Canvas {
}

 class Paper extends Canvas {
    protected void draw(int color) {
    }
}

 class Frame extends Canvas implements Drawable {
    public void resize() {
    }
}

 interface Drawable {
    public abstract void draw();
}
