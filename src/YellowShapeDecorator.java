import java.awt.*;

public class YellowShapeDecorator extends ShapeDecorator {

    public YellowShapeDecorator(Shape shape) {
        super(shape);
        
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.drawRect(0, 100, 400, 300);
        
    }
    
}
