import javax.swing.JPanel;

abstract class ShapeDecorator extends JPanel implements Shape {
    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }
}
