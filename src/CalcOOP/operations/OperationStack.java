package CalcOOP.operations;

import java.util.Stack;

public class OperationStack {

    Stack stack;

    public OperationStack() {
        stack = new Stack();
    }

    public void push(Operat operation) {
        stack.push(operation);
    }

    public Operat pop() {
        return (Operat) stack.pop();
    }

    public boolean empty() {
        return stack.empty();
    }

    public void clear() {
        stack = new Stack();
    }

    public Operat peek() {
        return (Operat) stack.peek();
    }
}
