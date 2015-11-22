package operations;

import java.util.Observable;

public class Register extends Observable {

    protected Val value;
    protected Val initialValue;

    public Register(Val value, Val initialValue) {
        this.value = value;
        this.initialValue = initialValue;
    }

    public Val getValue() {
        return value;
    }

    public void setValue(Val value) {
        this.value = value;
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
