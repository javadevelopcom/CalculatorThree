package CalcOOP.operations;

public class OperationCommand implements Command {
    Operat op;

    public OperationCommand(Operat op) {
        this.op = op;
    }

    @Override
    public void execute(CalcCpu cpu) {
        cpu.pushOperation(op);
    }

    @Override
    public void display() {
        System.out.println(op.toString());
    }
}
