package kyocoolcool.exam.exam18;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/24 4:21 PM
 **/
public class Test  {


    public class Canvas implements Drawable{
        @Override
        public void draw() {

        }
    }

    public abstract class Board extends Canvas{

    }

    public class Paper extends Board {
        protected void draw(int coloer) {

        }
    }

    public interface Drawable {
        public abstract void draw();
    }

    public class Frame extends Canvas implements Drawable {
        public void resie() {

        }
         void open(){}

    }
}
