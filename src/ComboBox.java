import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBox extends App {
    
    private Object color;
    private String[] colors = {"Select Border Color", "Black", "Pink", "Orange", "Yellow"};
    private JComboBox<String> comboBox = new JComboBox<>(colors);
    
    public ComboBox() {

        comboBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {
                color = ((JComboBox)event.getSource()).getSelectedItem();
                if (color == "Black") {
                    Shape rectangle = new Rectangle();
                    remove((Component) rectangle);
                    add((Component) rectangle);
                    revalidate();
                    repaint();
                }
                else if (color == "Pink") {
                    Shape rectangle = new PinkShapeDecorator(new Rectangle());
                    remove((Component) rectangle);
                    add((Component) rectangle);
                    revalidate();
                    repaint();
                }
                else if (color == "Orange") {
                    Shape rectangle = new OrangeShapeDecorator(new Rectangle());
                    remove((Component) rectangle);
                    add((Component) rectangle);
                    revalidate();
                    repaint();
                }
                else if (color == "Yellow") {
                    Shape rectangle = new YellowShapeDecorator(new Rectangle());
                    remove((Component) rectangle);
                    add((Component) rectangle);
                    revalidate();
                    repaint();
                }
            }
            
        });
        

        this.add(comboBox);
        this.setLayout(new GridLayout(1, 2));
        
    }

}
