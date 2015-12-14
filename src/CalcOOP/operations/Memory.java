package CalcOOP.operations;

public class Memory extends Register {

    private static final String MEM_SET = "M";
    private static final String MEM_CLEAR = " ";

    protected String status;

    public Memory(Val value) {
        super(value);
        status = MEM_CLEAR;
    }


    @Override
    public void setValue(Val value) {
        status = MEM_SET;
        super.setValue(value);
    }

    @Override
    public void clear() {
        status = MEM_CLEAR;
        super.clear();
    }

    @Override
    protected void doNotify() {
        setChanged();
        notifyObservers();
    }
}
