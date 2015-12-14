package CalcOOP.operations;

public class WaitingForNumberState extends CalcState{

    public WaitingForNumberState(CalcCpu cpu) {
        super(cpu);
    }

    @Override
    public CalcState enterDigit(String digit) {
        display.reset();
        display.addDigit(digit);
        return cpu.EnteringNumberState;
    }

    @Override
    public CalcState enterOperation(Operat op) {
        cpu.replaceOperation(op);
        return this;
    }

    @Override
    public CalcState enterValue(Operat op) {
        cpu.executeOperation(op);
        return cpu.WaitingForOperationState;
    }
}
