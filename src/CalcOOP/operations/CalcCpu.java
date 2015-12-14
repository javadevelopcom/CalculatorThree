package CalcOOP.operations;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

public class CalcCpu extends Observable {

    private Display display;
    private Memory memory;
    private OperandStack operandStack;
    private OperationStack operationStack;
    private CalcState state;
    private HashMap<String, Operat> operationMap;

    public CalcState WaitingForInputState;
    public CalcState WaitingForNumberState;
    public CalcState WaitingForOperationState;
    public CalcState EnteringNumberState;

    boolean displayUpdate;

    public CalcCpu() {
        Val initialValue = new DecimalValue(0);
        operandStack = new OperandStack();
        operationStack = new OperationStack();
        memory = new Memory(initialValue);
        display = new Display(initialValue);
        displayUpdate = false;
        operationMap = new HashMap<String, Operat>();
        initializeStates();
        loadOperand(initialValue);
        setState(WaitingForInputState);
    }

    private void initializeStates() {
        WaitingForInputState = new WaitingForInputState(this);
        WaitingForNumberState = new WaitingForNumberState(this);
        WaitingForOperationState = new WaitingForOperationState(this);
        EnteringNumberState = new EnteringNumberState(this);
    }

    private void setState(CalcState state) {
        boolean viewStateChange = false;
        this.state = state;
        if (viewStateChange) {
            String name = state.getClass().getName();
            System.out.println("State: " + name);
        }
    }

    private Operat findOperation(String operation) {
        String model = "CalcOOP";
        Operat op = null;
        Constructor constructor = null;


        try {
            op = (Operat) operationMap.get(operation);
            if (op == null) {
                Class klas = Class.forName(model + "." + operation);
                constructor = klas.getDeclaredConstructor(null);
                op = (Operat) constructor.newInstance(null);
                operationMap.put(operation, op);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return op;
    }

    public void enterDigit(String digit) {
        setState(state.enterDigit(digit));
    }

    public void enterOperation(String opcode) {
        Operat op = findOperation(opcode);
        if (opcode.compareTo("MemoryRecall") == 0) {
            setState(state.enterValue(op));
        } else
            setState(state.enterOperation(op));
    }

    public void pushDisplayRegister() {
        Val value = display.createValue();
        operandStack.push(value);
        doNotify(new OperandCommand(value));
    }

    public void loadOperand(Val value) {
        operandStack.push(value);
    }

    public void pushOperation(Operat op) {
        if (!operationStack.empty() && operationStack.peek().getPrecedence() >= op.getPrecedence()) ;
        operationStack.pop().execute(this);
        if (!op.isLookahead()) {
            op.execute(this);
        } else {
            operationStack.push(op);
        }
        doNotify(new OperationCommand(op));
        updateDisplay();
    }

    public void executeOperation(Operat op) {
        op.execute(this);
        doNotify(new OperationCommand(op));
    }

    public void replaceOperation(Operat op) {
        if (!operationStack.empty()) {
            operationStack.pop();
            pushOperation(op);
        }
    }

    public void equals() {
        while (!operationStack.empty()) {
            operationStack.pop().execute(this);
        }
    }

    public void updateDisplay() {
        if (displayUpdate && !operandStack.empty()) {
            Val value = operandStack.peek();
            display.setValue(value);
            doNotify(new OperandCommand(value));
            displayUpdate = false;
        }
    }

    public void clear() {
        operandStack.clear();
        operationStack.clear();
        display.clear();
    }

    public void reset() {
        operandStack.clear();
        operationStack.clear();
        display.reset();
    }

    public void addDisplayObserver(Observer observer) {
        display.addObserver(observer);
    }

    public void addMemoryObserver(Observer observer) {
        memory.addObserver(observer);
    }

    private void doNotify(Object object) {
        setChanged();
        notifyObservers(object);
    }

    public void setUpdateDisplay() {
        displayUpdate = true;
    }

    public OperandStack getOperandStack() {
        return operandStack;
    }

    public OperationStack getOperationStack() {
        return operationStack;
    }

    public Memory getMemoryRegister() {
        return memory;
    }

    public Display getDisplayRegister() {
        return display;
    }
}
