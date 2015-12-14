package CalcOOP.operations;

public class EnteringNumberState extends CalcState {

    public EnteringNumberState(CalcCpu cpu) {
        super(cpu);
    }

    @Override
    public CalcState enterDigit(String digit) {
        display.addDigit(digit);
        return this;
    }

    @Override
    public CalcState enterOperation(Operat op) {
        cpu.pushDisplayRegister();
        cpu.pushOperation(op);

        if (!op.isLookahead())
            return cpu.WaitingForInputState;
        else
            return cpu.WaitingForNumberState;
    }

    @Override
    public CalcState enterValue(Operat op) {
        cpu.executeOperation(op);
        return cpu.WaitingForOperationState;
    }
}
