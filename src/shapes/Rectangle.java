package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(int length, int width) {
        super(length, width);
    }
//    protected int length;
//    protected int width;

    public static void main(String[] args) {
//        Rectangle rectangle1 = new Rectangle(2,3);
//        System.out.println(rectangle1.getArea());
//        System.out.println(rectangle1.getPerimeter());
    }

    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(int length) {

    }

    @Override
    public void setWidth(int width) {

    }

//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public int getArea() {
//       return getLength() * getWidth();
//    }
//
//    public int getPerimeter() {
//        return getLength() * 2 + getWidth() * 2;
//    }







}
