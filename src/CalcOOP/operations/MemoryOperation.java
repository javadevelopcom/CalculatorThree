package CalcOOP.operations;/* https://github.com/javadevelopcom */

public abstract class MemoryOperation extends Operat {

    protected Memory memory;
    protected Display display;

    public MemoryOperation() {
        lookahead = false;
    }

    @Override
    public void execute(CalcCpu cpu) {
        memory = cpu.getMemoryRegister();
        display = cpu.getDisplayRegister();
        stack = cpu.getOperandStack();

        executeMemory();
    }

    public abstract void executeMemory();
}
