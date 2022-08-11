package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2,3);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getArea() {
       return getLength() * getWidth();
    }

    public int getPerimeter() {
        return getLength() * 2 + getWidth() * 2;
    }







}
