package CalcOOP.operations;/* https://github.com/javadevelopcom */

public class Square extends UnaryOperation {
    public Square() {
        symbol = "SQR";
    }

    @Override
    public Val executeUnary(Val value) {
        return value.multiply(value);
    }
}
