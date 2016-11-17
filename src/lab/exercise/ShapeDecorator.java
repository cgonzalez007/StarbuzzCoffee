package lab.exercise;

/**
 *
 * @author Chris Gonzalez
 */
public abstract class ShapeDecorator implements Shape {

    private Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }
    
    @Override
    public abstract void draw();
    
    public final Shape getShape() {
        return shape;
    }

    public final void setShape(Shape shape) {
        //needs validation
        this.shape = shape;
    }

}
