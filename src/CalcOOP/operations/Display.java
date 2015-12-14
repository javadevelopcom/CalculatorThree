/**
 * CHECK CHANGES
 */
package CalcOOP.operations;

public class Display extends Register {

    String number = "0";
    boolean decimalSet = false;
    static final int MAXLENGTH = 14;

    public Display(Val value) {
        super(value);
    }

    public void addDigit(String digit) {

        if (number.length() >= MAXLENGTH)
            return;

        number = value.addDigit(number, digit);

        setChanged();
        notifyObservers(number);
    }

    @Override
    public void setValue(Val value) {
        super.setValue(value);
        number = value.toString();
    }

//    @Override
//    public void setValue(String value) {
//        super.setValue(value);
//    }

    public Val createValue() {
        setValue(number);
        return getValue();
    }

    @Override
    public void clear() {
        number = "0";
        decimalSet = false;
        super.clear();
    }

    @Override
    public void reset() {
        number = "0";
        decimalSet = false;
        super.reset();
    }
}
