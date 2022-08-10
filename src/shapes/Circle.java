package shapes;

public class Circle {
    private int radius;

    public Circle(int userRadius) {
        this.radius = userRadius;
    }

    public static void main(String[] args) {
        Circle circleRadius = new Circle(5);
//        System.out.println(circleRadius.circle(2.2));
        System.out.println("The area is " + circleRadius.getArea());
        System.out.println("The circumference is " + circleRadius.getCircumference());
    }

    public int circle(double radius) {
        this.radius = (int)radius;
        return (int) radius;
    }

    public double getArea() {

       return Math.PI * this.radius * this.radius;
    }

    public double getCircumference() {

        return 2 * Math.PI * this.radius;
    }




}
