package design;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class MemoryStatus extends JTextField implements Observer {

    private JTextField memoryField;

    public MemoryStatus() {
        super("", 1);

        Font font = new Font("Impact", Font.BOLD | Font.ITALIC, 14);
        Border emptyBorder = BorderFactory.createEmptyBorder();

        setFont(font);
        setEditable(false);
        setBackground(Color.yellow);
        setBorder(emptyBorder);

    }

    @Override
    public void update(Observable observable, Object object) {
        setText((String) object);
    }
}