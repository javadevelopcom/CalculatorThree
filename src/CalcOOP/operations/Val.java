package CalcOOP.operations;

public interface Val {

    Val create(String string);

    Val add(Val other);

    Val subtract(Val other);

    Val multiply(Val other);

    Val divide(Val other);

    Val negate();

    Val squareRoot();

    Val inverse();

    Val percent();

    String addDigit(String number, String digit);
}
