package CalcOOP.operations;/* https://github.com/javadevelopcom */

public class Minus extends BinaryOperation {
    public Minus() {
        precedence = LOW;
        symbol = "-";
    }

    @Override
    public Val executeBinary(Val value1, Val value2) {
        return value1.subtract(value2);
    }
}
