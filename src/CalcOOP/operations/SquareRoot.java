package CalcOOP.operations;/* https://github.com/javadevelopcom */

public class SquareRoot extends UnaryOperation {
    public SquareRoot() {
        symbol = "SQRT";
    }

    @Override
    public Val executeUnary(Val value) {
        return value.squareRoot();
    }
}
