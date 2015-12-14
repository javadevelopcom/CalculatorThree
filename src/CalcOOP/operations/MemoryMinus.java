package CalcOOP.operations;/* https://github.com/javadevelopcom */

public class MemoryMinus extends MemoryOperation {
    public MemoryMinus() {
        precedence = LOWEST;
        symbol = "M-";
    }

    @Override
    public void executeMemory() {
        Val value = stack.peek();
        memory.setValue(memory.getValue().subtract(value));
    }
}
