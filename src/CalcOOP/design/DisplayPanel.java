package CalcOOP.design;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class DisplayPanel extends JPanel implements Observer {

    private JTextField displayField;
    private MemoryStatus memoryStatus;

    private static final int MAX_INPUT = 16;

    public DisplayPanel(){
        this.setBackground(Color.DARK_GRAY);

        memoryStatus = new MemoryStatus();
        add(memoryStatus);

        Font font = new Font("Impact", Font.PLAIN, 18);
        Border bevelBorder = BorderFactory.createLoweredBevelBorder();

        displayField = new JTextField("0", MAX_INPUT);
        displayField.setFont(font);
        displayField.setEditable(false);
        displayField.setBackground(Color.WHITE);
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setBorder(bevelBorder);

        add(displayField);
    }
    public MemoryStatus getMemoryStatus(){
        return memoryStatus;
    }

    private void setDisplay(String text) {
        displayField.setText(text);
    }

    @Override
    public void update(Observable o, Object object) {
        setDisplay((String) object);
    }


}
