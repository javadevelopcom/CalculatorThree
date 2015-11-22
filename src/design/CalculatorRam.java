package design;

import operations.CalcCpu;
import operations.Command;

import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;

public class CalculatorRam implements Observer {

    LinkedList<Command> commands;

    public CalculatorRam(CalcCpu cpu) {
        cpu.addObserver(this);
        commands = new LinkedList<Command>();
    }

    @Override
    public void update(Observable cpu, Object cmd) {
        Command command = (Command) cmd;
        command.display();
        commands.add(command);

    }
}
