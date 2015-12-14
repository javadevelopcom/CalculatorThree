package CalcOOP.design;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberPanel extends KeyPanel {

    private DigitHandler digitHandler = new DigitHandler();
    private ActionListener operationHandler = getOperationHandler();


    public NumberPanel(Calculator calculator) {
        super(calculator);

        setLayout(new GridLayout(4, 3, 5, 5));

        addKey("1", "One", digitHandler);
        addKey("2", "Two", digitHandler);
        addKey("3", "Three", digitHandler);
        addKey("4", "Four", digitHandler);
        addKey("5", "Five", digitHandler);
        addKey("6", "Six", digitHandler);
        addKey("7", "Seven", digitHandler);
        addKey("8", "Eight", digitHandler);
        addKey("9", "Nine", digitHandler);
        addKey("0", "Zero", digitHandler);
        addKey(".", "Decimal", digitHandler);

        addKey("+/-", "ReverseSign", operationHandler);

    }

    /**
     * СОЗДАЕМ ВНУТРЕННИЙ КЛАСС, В КОТОРОМ РАЗМЕЩАЕМ ЛИСЕНЕРЫ
     */
    private class DigitHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String action = e.getActionCommand();
            String digit = getKey(action);

            calculator.enterDigit(digit);

        }
    }
}
