import java.awt.*;
import javax.swing.*;

public class Rectangle extends JPanel implements Shape {

    @Override
    public void paint(Graphics g) {
        g.drawRect(0, 100,400, 300);
    }
    
}
