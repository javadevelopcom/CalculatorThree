package CalcOOP.operations;/* https://github.com/javadevelopcom */

public class Plus extends BinaryOperation {
    public Plus() {
        precedence = LOW;
        symbol = "+";
    }

    @Override
    public Val executeBinary(Val value1, Val value2) {
        return value1.add(value2);
    }
}
