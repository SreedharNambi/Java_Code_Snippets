package collections;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Lion1");
        stack.push("Lion2");
        stack.push("Lion3");
        stack.push("Lion4");
        stack.push("Lion5");
        stack.push("Lion6");
        stack.push("Lion7");

        System.out.println("Stack: " + stack);
        System.out.println(stack.peek());

        stack.pop();
        System.out.println(stack.peek());
    }
}
