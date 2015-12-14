package CalcOOP.operations;/* https://github.com/javadevelopcom */

public class Equals extends Operat {
    public Equals() {
        precedence = LOWEST;
        lookahead = false;
        symbol = "=";
    }

    @Override
    public void execute(CalcCpu cpu) {
        cpu.equals();
    }
}
