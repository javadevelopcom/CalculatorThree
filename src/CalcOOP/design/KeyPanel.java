package CalcOOP.design;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class KeyPanel extends JPanel {

    protected Calculator calculator;
    protected OperationHandler operationHandler;
    protected HashMap keyMap;

    public KeyPanel(Calculator calculator) {
        this.calculator = calculator;
        operationHandler = new OperationHandler();
        keyMap = new HashMap();
    }

    protected void addKey(String display, String action, ActionListener handler) {
        JButton button = new JButton(display);
        button.setActionCommand(action);
        button.addActionListener(handler);
        add(button);
        keyMap.put(action, display);
    }

    protected String getKey(String action) {
        return (String) keyMap.get(action);
    }

    public OperationHandler getOperationHandler() {
        return operationHandler;
    }

    /**
     * СОЗДАЕМ ВНУТРЕННИЙ КЛАСС, В КОТОРОМ РАЗМЕЩАЕМ ЛИСЕНЕРЫ
     */

    class OperationHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            calculator.enterOperation(e.getActionCommand());
        }
    }
}
