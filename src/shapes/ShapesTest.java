package shapes;

import shapes.Rectangle;

public class ShapesTest {
    public static void main(String[] args) {
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
        System.out.println(getMyShape.getArea());
        System.out.println(getMyShape.getPerimeter());
        ((Quadrilateral) myShape).getWidth();

    }

//    static Rectangle box1 = new Rectangle(5,4);
//    static Rectangle box2 = new Square(5);
    static Measurable myShape = new Square(5);
    static Measurable getMyShape = new Rectangle(3,4);


}
