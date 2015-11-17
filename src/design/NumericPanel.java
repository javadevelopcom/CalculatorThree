package design;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class NumericPanel extends JPanel {

    protected Calculator calculator;
    protected OperationHandler operationHandler;
    protected HashMap keyMap;

    public NumericPanel(Calculator calculator) {
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

    protected String getKey(String action){
        return (String)keyMap.get(action);
    }

    public OperationHandler getOperationHandler(){
        return operationHandler;
    }

    /**
     * —Œ«ƒ¿≈Ã ¬Õ”“–≈ÕÕ»…  À¿——, ¬  Œ“Œ–ŒÃ –¿«Ã≈Ÿ¿≈Ã À»—≈Õ≈–€
     */

    private class OperationHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
//            calculator.enterOperation(e.getActionCommand());
        }
    }
}
