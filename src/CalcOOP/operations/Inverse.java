package CalcOOP.operations;/* https://github.com/javadevelopcom */

public class Inverse extends UnaryOperation {
    public Inverse() {
        symbol = "1/x";
    }

    @Override
    public Val executeUnary(Val value) {
        return value.inverse();
    }
}
