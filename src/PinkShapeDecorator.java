import java.awt.*;

public class PinkShapeDecorator extends ShapeDecorator {

    public PinkShapeDecorator(Shape shape) {
        super(shape);
        
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.PINK);
        g.drawRect(0, 100,400, 300);
        
    }
    
}
