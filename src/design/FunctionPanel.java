package design;

import java.awt.*;
import java.awt.event.ActionListener;

public class FunctionPanel extends KeyPanel {
    public FunctionPanel(Calculator calculator) {
        super(calculator);

        ActionListener handler = getOperationHandler();

        setLayout(new GridLayout(2,3,5,10));

        addKey("C", "Clear", handler);
        addKey("MC", "MemoryClear", handler);
        addKey("M+", "MemoryMinus", handler);
        addKey("M-", "MemoryPlus", handler);

        addKey("MR", "MemoryRecall", handler);
        addKey("SQR", "Square", handler);
        addKey("SQRT", "SquareRoot", handler);
        addKey("1/X", "Inverse", handler);

    }
}
