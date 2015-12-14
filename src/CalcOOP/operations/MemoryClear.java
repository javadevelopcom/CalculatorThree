package CalcOOP.operations;/* https://github.com/javadevelopcom */

public class MemoryClear extends MemoryOperation {
    public MemoryClear() {
        precedence = LOWEST;
        symbol = "MC";
    }

    @Override
    public void executeMemory() {
        memory.clear();
    }
}
