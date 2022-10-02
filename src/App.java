import java.awt.*;
import javax.swing.*;

public class App extends JFrame {
    public static void main(String[] args) {
        JFrame mainFrame = new ComboBox();
        mainFrame.setTitle("Draw Rectangle");
        mainFrame.setSize(500, 500);
        mainFrame.setMinimumSize(new Dimension(300, 300));
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
        
    }
}
