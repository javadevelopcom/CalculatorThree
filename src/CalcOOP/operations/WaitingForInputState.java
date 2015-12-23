package CalcOOP.operations;

public class WaitingForInputState extends CalcState {

    public WaitingForInputState(CalcCpu cpu) {
        super(cpu);
    }

    @Override
    public CalcState enterDigit(String digit) {
        cpu.reset();
        display.addDigit(digit);
        return cpu.EnteringNumberState;
    }

    @Override
    public CalcState enterOperation(Operat op) {
        if (cpu.getOperandStack().empty())
            cpu.pushDisplayRegister();
        cpu.pushOperation(op);
        if (!op.getLookahead())
            return cpu.WaitingForInputState;
        else
            return cpu.WaitingForNumberState;
    }

    @Override
    public CalcState enterValue(Operat op) {
        cpu.reset();
        cpu.executeOperation(op);
        cpu.pushDisplayRegister();
        return this;
    }
}
