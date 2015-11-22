package operations;

import java.util.Observable;

public class CalcCpu extends Observable {

    private Display display;
    private Memory memory;
    private OperandStack operandStack;
    private OperationStack operationStack;

//
//public void enterOperation(String opcode){
//    Operations op = findOperations(opcode);
//    if(opcode.compareTo("MemoryRecall")==0){
//        setState(state.enterValue(op));
//    }else
//        setState(state.enterOperation(op));
//}
//
//    public void addDisplayObserver(Observer observer){
//        display.addObserver(observer);
//    }
//    public  void addMemoryObserver(Observer observer){
//        memory.addObserver(observer);
//    }
//    public void enterDigit(String digit){
//        setState(state.enterDigit());
//    }
}
