/**
 * ГЛАВНАЯ ПАНЕЛЬ (ФРЕЙМ) КАЛЬКУЛЯТОРА, на которой размещаются другие панели:
 * DisplayPanel display - текстовое поле для дисплея;
 * FunctionPanel function - содержит кнопки функций;
 * OperationPanel operation - содержит кнопки операций;
 * NumberPanel key - содержит кнопки цифр;
 */

package design;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CalcFrame extends JFrame {

    int width = 380;
    int height = 480;

    DisplayPanel display;
    FunctionPanel function;
    OperationPanel operation;
    NumberPanel key;
    Calculator calculator;

    public CalcFrame(Calculator calculator) {
        super("Java Calculator");
        this.calculator = calculator;

        setSize(width, height);
//        setBackground(Color.blue);
//        setForeground(Color.CYAN);

        GridBagLayout layout = new GridBagLayout();
        getContentPane().setLayout(layout);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = constraints.BOTH;
        constraints.anchor = constraints.WEST;
        constraints.insets = new Insets(5, 5, 10, 10);

        display = new DisplayPanel();
        buildConstraints(constraints, 0, 1, 4, 1);
        layout.setConstraints(display, constraints);
        getContentPane().add(display);
//        calculator.addDisplayObserver(display);
//        calculator.addMemoryObserver(display.getMemoryStatus());

        function = new FunctionPanel(calculator);
        buildConstraints(constraints, 0, 2, 3, 2);
        layout.setConstraints(function, constraints);
        getContentPane().add(function);

        operation = new OperationPanel(calculator);
        buildConstraints(constraints, 3, 2, 1, 6);
        layout.setConstraints(operation, constraints);
        getContentPane().add(operation);

        key = new NumberPanel(calculator);
        buildConstraints(constraints, 0, 4, 3, 4);
        layout.setConstraints(key, constraints);
        getContentPane().add(key);


        setLocationRelativeTo(null);
        setVisible(true);
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        addKeyListener(new MyKeyHandler());
        requestFocus();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void buildConstraints(GridBagConstraints gbc, int gx, int gy, int gw, int gh) {
        gbc.gridx = gx;
        gbc.gridy = gy;
        gbc.gridwidth = gw;
        gbc.gridheight = gh;
    }

    /**
     * СОЗДАЕМ ВНУТРЕННИЙ КЛАСС, В КОТОРОМ РАЗМЕЩАЕМ ЛИСЕНЕРЫ, чтобы сделать кнопки активными
     */

    class MyKeyHandler extends KeyAdapter {

        @Override
        public void keyTyped(KeyEvent e) {
            char key = e.getKeyChar();
            switch (key) {
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '0':
                case '.':
                    String digit = (new Character(key)).toString();
//                    calculator.enterDigit(digit);
//                    break;
//
//                case 'c':
//                    calculator.enterOperation("Clear");
//                    break;
//
//                case '/':
//                    calculator.enterOperation("Clear");
//                    break;
//
//                case '*':
//                    calculator.enterOperation("Clear");
//                    break;
//
//                case '-':
//                    calculator.enterOperation("Clear");
//                    break;
//
//                case '+':
//                    calculator.enterOperation("Clear");
//                    break;
//
//                case '=':
//                    calculator.enterOperation("Clear");
//                    break;
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {
//            if(e.getKeyCode()== KeyEvent.VK_ENTER)
//                calculator.enterOperation("Equals");
        }
    }
}
