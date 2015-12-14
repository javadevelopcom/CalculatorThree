package CalcOOP.design;

import CalcOOP.operations.CalcCpu;

import java.util.Observer;

public class Calculator {

    CalcFrame frame;
    CalcCpu cpu;
    CalcActivity active;

    public void Calculator() {
        cpu = new CalcCpu();
        frame = new CalcFrame(this);
        active = new CalcActivity(cpu);
    }
    public void enterOperation(String operation){
        cpu.enterOperation(operation);
    }

    public  void enterDigit(String digit){
        cpu.enterDigit(digit);
    }

    public void addDisplayObserver(Observer observer){
        cpu.addDisplayObserver(observer);
    }

    public void addMemoryObserver(Observer observer){
        cpu.addMemoryObserver(observer);
    }

}
