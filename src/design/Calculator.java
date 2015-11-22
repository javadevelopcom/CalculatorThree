package design;

import operations.CalcCpu;

public class Calculator {

    CalcFrame frame;
    CalcCpu cpu;

    public void Calculator() {
        cpu = new CalcCpu();
//        ram = new CalcRam();
        frame = new CalcFrame(this);
    }
//    public void enterOperation(String operation){
//        cpu.enterOperation(operation);
//    }

//    public  void enterDigit(String digit){
//        cpu.enterDigit(digit);
//    }

//    public void addDisplayObserver(Observer observer){
//        cpu.addDisplayObserver(observer);
//    }
//
//    public void addMemoryObserver(Observer observer){
//        cpu.addMemoryObserver(observer);
//    }

}
