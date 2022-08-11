package shapes;

public class Square extends Rectangle{
    public Square(int length, int width) {
        super(length, width);
    }


    public Square(int side) {
        super(side,side);
    }

    @Override
    public int getArea() {
        return length * length;
    }

    @Override
    public int getPerimeter() {
        return 4 * length;
    }
}
