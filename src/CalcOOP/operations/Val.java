package CalcOOP.operations;

public interface Val {

    Val create(String string);

    Val add(Val other);

    Val subtract(Val string);

    Val multiply(Val string);

    Val divide(Val string);

    Val negate();

    Val squareRoot();

    Val inverse();

    Val percent();

    String addDigit(String number, String digit);
}
