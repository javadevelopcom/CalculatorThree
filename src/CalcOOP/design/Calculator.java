package CalcOOP.design;

import CalcOOP.operations.CalcCpu;

import java.util.Observer;

public class Calculator {

    CalcCpu cpu;
    CalcActivity active;
    CalcFrame frame;

    public void Calculator() {
        cpu = new CalcCpu();
        active = new CalcActivity(cpu);
        frame = new CalcFrame(this);
    }

    public void enterOperation(String operation) {
        cpu.enterOperation(operation);
    }

    public void enterDigit(String digit) {
        cpu.enterDigit(digit);
    }

    public void addDisplayObserver(Observer observer) {
        cpu.addDisplayObserver(observer);
    }

    public void addMemoryObserver(Observer observer) {
        cpu.addMemoryObserver(observer);
    }

}
