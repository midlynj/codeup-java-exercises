package shapes;

public class Square extends Quadrilateral{
//    public Square(int length, int width) {
//        super(length, width);
//    }
//    public Square(int length, int width) {
//        super(length, width);
//    }
//        protected int length;
//        protected int width;

    public Square(int side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public void setLength(int length) {

    }

    @Override
    public void setWidth(int width) {

    }
//
//
//    public Square(int side) {
//        super(side,side);
//    }
//
//    @Override
//    public int getArea() {
//        return length * length;
//    }
//
//    @Override
//    public int getPerimeter() {
//        return 4 * length;
//    }
}
