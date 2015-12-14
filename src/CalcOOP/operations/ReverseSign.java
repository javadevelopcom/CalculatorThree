package CalcOOP.operations;/* https://github.com/javadevelopcom */

public class ReverseSign extends UnaryOperation {
    public ReverseSign() {
        symbol = "-/+";
    }

    @Override
    public Val executeUnary(Val value) {
        return value.negate();
    }
}
