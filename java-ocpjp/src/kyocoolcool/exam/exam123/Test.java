package kyocoolcool.exam.exam123;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/27 下午 11:36
 **/

abstract class Shape {
    public Shape() {
        System.out.println("Shape Constructor");
    }

    protected void area() {
        System.out.println("Shape area");
    }
}

class Square extends Shape {
    int side;
    public Square(int side) {
        this.side = side;
    }

    @Override
    protected void area() {
        System.out.println("Square area");
    }
}

class Rectangle extends Square {
 int len,br;

    public Rectangle(int x,int y) {
        super(x);
        len=x;
        br = y;
    }

    @Override
    public void area() {
        System.out.println("Rectangle");
    }
}


public class Test {
}