package CalcOOP.operations;/* https://github.com/javadevelopcom */

public class MemoryRecall extends MemoryOperation {
    public MemoryRecall() {
        precedence = HIGHEST;
        symbol = "MR";
    }

    @Override
    public void executeMemory() {
        display.reset();
        display.setValue(memory.getValue());
    }
}
