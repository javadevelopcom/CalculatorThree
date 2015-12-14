/**
 * CHECK getLookhead (isLookhead)
 * String (Symbol)
 * not Imlpemented
 */
package CalcOOP.operations;

public abstract class Operat {

    static final int HIGHEST = 5;
    static final int HIGH = 4;
    static final int MEDIUM = 3;
    static final int LOW = 2;
    static final int LOWEST = 1;

    protected int precedence;
    protected boolean lookahead;
    protected String symbol;
    protected CalcCpu cpu;
    protected OperandStack stack;

    public int getPrecedence() {
        return precedence;
    }

    public boolean isLookahead() {
        return lookahead;
    }

    public void setString(String s) {
        this.symbol = s;
    }

    @Override
    public String toString() {
        return symbol;
//        return super.toString();
    }

    public abstract void execute(CalcCpu cpu);
}
