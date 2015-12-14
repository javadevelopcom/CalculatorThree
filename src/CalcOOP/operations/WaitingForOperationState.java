package CalcOOP.operations;

public class WaitingForOperationState extends CalcState{

    public WaitingForOperationState(CalcCpu cpu) {
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

        return cpu.EnteringNumberState.enterOperation(op);
    }

    @Override
    public CalcState enterValue(Operat op) {
        cpu.executeOperation(op);
        return this;
    }
}
