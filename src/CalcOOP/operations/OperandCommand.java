package CalcOOP.operations;

public class OperandCommand implements Command {

    Val value;

    public OperandCommand(Val value) {
        this.value = value;
    }

    @Override
    public void execute(CalcCpu cpu) {
        cpu.loadOperand(value);
    }

    @Override
    public void display() {
        System.out.println(value.toString());
    }
}
