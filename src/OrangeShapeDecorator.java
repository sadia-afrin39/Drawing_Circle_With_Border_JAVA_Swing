import java.awt.*;

public class OrangeShapeDecorator extends ShapeDecorator {

    public OrangeShapeDecorator(Shape shape) {
        super(shape);
        
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.ORANGE);
        g.drawRect(0, 100, 400, 300);
        
    }
    
}
