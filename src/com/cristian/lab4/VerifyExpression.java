package com.cristian.lab4;
import java.util.Stack;

public class VerifyExpression {
    public String text;

    public String checkBalancedParenthesis() {
        if (this.text.isEmpty())
            return "Balanced";

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < this.text.length(); i++)
        {
            char current = this.text.charAt(i);
            if (current == '(')
            {
                stack.push(current);
            }
            if (current == ')')
            {
                if (stack.isEmpty())
                    return "Not Correct";
                char last = stack.peek();
                if (current == ')' && last == '(')
                    stack.pop();
                else
                    return "Not Correct";
            }
        }
        return stack.isEmpty() ? "Correct" : "Not Correct";
    }
}