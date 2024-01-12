package Stack;

import java.util.Stack;

public class BalancedParenthesis {
    public static boolean Balanced(String s) {
        char curr;
        char poped;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            curr = s.charAt(i);
            if ((curr == '(') | (curr == '[') | (curr == '{')) {
                stack.push(curr);
            } else if ((curr == ')') | (curr == ']') | (curr == '}')) {
                if (stack.isEmpty())
                    return false;
                poped = stack.pop();
                if (poped == '(' & curr == ')')
                    continue;
                else if (poped == '[' & curr == ']')
                    continue;
                else if (poped == '{' & curr == '}')
                    continue;
                else
                    return false;
            }
        }
if (stack.isEmpty())
    return true;
else
    return false;
    }
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String st = "(a+[b^c])";

        System.out.println(Balanced(st));

    }
}
