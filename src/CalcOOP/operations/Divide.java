package CalcOOP.operations;/* https://github.com/javadevelopcom */

public class Divide extends BinaryOperation {
    public Divide() {
        precedence = MEDIUM;
        symbol = "/";
    }

    @Override
    public Val executeBinary(Val value1, Val value2) {
        return value1.divide(value2);
    }
}
