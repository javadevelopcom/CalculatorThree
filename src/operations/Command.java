package operations;

public interface Command {

    void execute(CalcCpu cpu);

    void display();
}
