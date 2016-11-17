package lab.exercise;

/**
 *
 * @author Chris Gonzalez
 */
public class Startup {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Circle with normal border");
        circle.draw();

        Shape rectangle = new Rectangle();
        System.out.println("\nRectangle with normal border");
        rectangle.draw();

        // do output for decorated shapes here...
        System.out.println("\nCircle with red border");
        circle = new RedShapeDecorator(circle);
        circle.draw();
        System.out.println("\nRectangle with red border");
        rectangle = new RedShapeDecorator(rectangle);
        rectangle.draw();
    }
}
