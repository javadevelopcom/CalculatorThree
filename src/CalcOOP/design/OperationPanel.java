package CalcOOP.design;

import java.awt.*;
import java.awt.event.ActionListener;

public class OperationPanel extends KeyPanel {

    public OperationPanel(Calculator calculator) {
        super(calculator);
        ActionListener handler = getOperationHandler();

        setLayout(new GridLayout(6,1,5,7));

        addKey("+", "Plus", handler);
        addKey("-", "Minus", handler);
        addKey("*", "Multiply", handler);
        addKey("/", "Divide", handler);
        addKey("%", "Percent", handler);
        addKey("=", "Equals", handler);

    }
}
