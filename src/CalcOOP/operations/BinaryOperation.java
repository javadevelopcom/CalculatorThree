package CalcOOP.operations;/* https://github.com/javadevelopcom */

public abstract class BinaryOperation extends Operat {
    public BinaryOperation() {
//        precedence = MEDIUM;    // DELETE ?
        lookahead = true;
    }

    @Override
    public void execute(CalcCpu cpu) {
        this.cpu = cpu;
        this.stack = cpu.getOperandStack();
        Val value1, value2;
        value1 = stack.pop();
        value2 = stack.pop();
        stack.push(executeBinary(value1, value2));
        cpu.setUpdateDisplay();
    }

    public abstract Val executeBinary(Val value1, Val value2);
}
