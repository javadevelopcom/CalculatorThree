package CalcOOP.operations;

import java.util.Observable;

public class Register extends Observable {

    protected Val value;
    protected Val initialValue;

    public Register(Val value) {
        this.value = this.initialValue = value;
    }

    public Val getValue() {
        return value;
    }

    public void setValue(Val value) {
        this.value = value;
        doNotify();
    }

    public void setValue(String value) {
        this.value = this.value.create(value);
        doNotify();
    }

    public void clear() {
        reset();
        doNotify();
    }

    public void reset() {
        value = initialValue;
    }


    protected void doNotify() {
        setChanged();
        notifyObservers(value.toString());
    }
}
