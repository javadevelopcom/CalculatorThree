package CalcOOP.operations;/* https://github.com/javadevelopcom */

public abstract class UnaryOperation extends Operat {
    public UnaryOperation() {
        precedence = HIGH;
        lookahead = false;
    }

    @Override
    public void execute(CalcCpu cpu) {
        OperandStack stack = cpu.getOperandStack();
        stack.push(executeUnary(stack.pop()));
        cpu.setUpdateDisplay();
    }

    public abstract Val executeUnary(Val value);
}
