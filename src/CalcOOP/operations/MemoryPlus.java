package CalcOOP.operations;/* https://github.com/javadevelopcom */

public class MemoryPlus extends MemoryOperation {
    public MemoryPlus() {
        precedence = LOWEST;
        symbol = "M+";
    }

    @Override
    public void executeMemory() {
        Val value = stack.peek();
        memory.setValue(memory.getValue().add(value));
    }
}
