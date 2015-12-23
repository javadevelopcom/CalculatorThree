package CalcOOP.operations;/* https://github.com/javadevelopcom */

public abstract class BinaryOperation extends Operat {
    public BinaryOperation() {
        lookahead = true;
    }

    @Override
    public void execute(CalcCpu cpu) {
        this.cpu = cpu;
        this.stack = cpu.getOperandStack();
        Val value1, value2;
        value2 = stack.pop();   //!
        value1 = stack.pop();
        stack.push(executeBinary(value1, value2));
        cpu.setUpdateDisplay();
    }

    public abstract Val executeBinary(Val value1, Val value2);
}
