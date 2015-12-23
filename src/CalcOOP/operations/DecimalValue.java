package CalcOOP.operations;

import java.math.BigDecimal;

public class DecimalValue implements Val {
    protected BigDecimal value;
    protected static BigDecimal one;
    protected static BigDecimal hundred;

    private static final int SCALE = 10;

    static {
        one = new BigDecimal(1.0);
        hundred = new BigDecimal(100.0);
    }

    public DecimalValue(BigDecimal value) {
        this.value = value;
    }

    public DecimalValue(String string) {
        this.value = new BigDecimal(string);
    }

    public DecimalValue(double value) {
        this.value = new BigDecimal(value);
        this.value = this.value.setScale(SCALE, BigDecimal.ROUND_UP);
    }

//    public DecimalValue(int value) {
//        this.value = new BigDecimal(value);
//        this.value = this.value.setScale(SCALE, BigDecimal.ROUND_UP);
//    }

    @Override
    public Val create(String string) {
        return new DecimalValue(string);
    }

    @Override
    public Val add(Val other) {
        BigDecimal result = value.add(((DecimalValue) other).value);
        return new DecimalValue(result);
    }

    @Override
    public Val subtract(Val other) {
        BigDecimal result = value.subtract(((DecimalValue) other).value);
        return new DecimalValue(result);
    }

    @Override
    public Val multiply(Val other) {
        BigDecimal result = value.multiply(((DecimalValue) other).value);
        result = result.setScale(SCALE, BigDecimal.ROUND_UP);
        return new DecimalValue(result);
    }

    @Override
    public Val divide(Val other) {
        BigDecimal result = null;
        try {
            result = value.divide(((DecimalValue) other).value,
                    SCALE, BigDecimal.ROUND_UP);
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic Error");
            return this;
        }
        return new DecimalValue(result);
    }

    @Override
    public Val negate() {
        return new DecimalValue(value.negate());
    }

    @Override
    public Val squareRoot() {
        double result = value.doubleValue();
        result = Math.sqrt(result);
        return new DecimalValue(result);
    }

    @Override
    public Val inverse() {
        BigDecimal result = null;
        try {
            result = one.divide(value, SCALE, BigDecimal.ROUND_UP);

        } catch (ArithmeticException e) {
            System.err.println("Arithmetic Error");
            return this;
        }
        return new DecimalValue(result);
    }

    @Override
    public Val percent() {
        BigDecimal result = value.divide(hundred, SCALE, BigDecimal.ROUND_UP);
        return new DecimalValue(result);
    }

    @Override
    public String addDigit(String number, String digit) {
        boolean decimalSet = (number.indexOf(".") == -1) ? false : true;
//        boolean decimalSet = (number.contains("."));
        if (digit.equals(".")) {
            if (decimalSet)
                return number;
        }
        if (!decimalSet && number.equals("0")) {
            if (digit.equals("0"))
                return number;
            else number = "";
        }
        return number + digit;
    }

    public String toString() {
        String s = value.toString();
        int i;
        if (s.indexOf('.') != -1) {
            for (i = s.length(); i > 0; i--) {
                if (s.charAt(i - 1) != '0')
                    break;
            }
            s = s.substring(0, i);
        } else s += ".";
        return s;
    }
}
