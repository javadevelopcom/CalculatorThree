package CalcOOP.operations;/* https://github.com/javadevelopcom */

public class Percent extends Operat {
    public Percent() {
        precedence = HIGH;
        lookahead = false;
        symbol = "%";
    }

    @Override
    public void execute(CalcCpu cpu) {
        OperandStack stack = cpu.getOperandStack();

        Val percent = stack.pop();
        percent = percent.percent();

        Val value = stack.peek();
        if (value != null) {
            value = value.multiply(percent);
            stack.push(value);
        } else
            stack.push(percent);
        cpu.setUpdateDisplay();
    }
}
