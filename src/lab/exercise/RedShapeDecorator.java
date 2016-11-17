package lab.exercise;

/**
 *
 * @author Chris Gonzalez
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public final void draw() {
        getShape().draw();
        System.out.println("Border Color: Red");
    }
    
}
