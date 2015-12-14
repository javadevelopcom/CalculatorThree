package CalcOOP.operations;/* https://github.com/javadevelopcom */

public class Multiply extends BinaryOperation {
    public Multiply() {
        precedence = MEDIUM;
        symbol = "*";
    }

    @Override
    public Val executeBinary(Val value1, Val value2) {
        return value1.multiply(value2);
    }
}
