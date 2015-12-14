package CalcOOP.operations;

public abstract class CalcState {
    protected CalcCpu cpu;
    protected Display display;

    public CalcState(CalcCpu cpu) {
        this.cpu = cpu;
        display = this.cpu.getDisplayRegister();
    }

    public abstract CalcState enterDigit(String digit);

    public abstract CalcState enterOperation(Operat op);

    public abstract CalcState enterValue(Operat op);

}
