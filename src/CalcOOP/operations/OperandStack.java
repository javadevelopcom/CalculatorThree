/**
 * CHECK Constructor
 */

package CalcOOP.operations;

import java.util.Stack;

public class OperandStack {

    private Stack stack;

    public OperandStack() {
        stack = new Stack();
    }

    public Val pop() {
        return (Val) stack.pop();
    }

    public void push(Val value) {
        stack.push(value);
    }

    public Val peek() {
        return (Val) stack.peek();
    }

    public boolean empty() {
        return stack.empty();
    }

    public void clear() {
        stack = new Stack();
    }
}
