package shapes;

import shapes.Rectangle;

public class ShapesTest {
    public static void main(String[] args) {
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());
        System.out.println(box2.getArea());
        System.out.println(box2.getPerimeter());

    }

    static Rectangle box1 = new Rectangle(5,4);
    static Rectangle box2 = new Square(5);


}
