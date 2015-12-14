package CalcOOP.operations;/* https://github.com/javadevelopcom */

public class Clear extends Operat {

    public Clear() {
        precedence = HIGHEST;
        symbol = "Clear";
    }

    @Override
    public void execute(CalcCpu cpu) {
        cpu.clear();
    }
}
