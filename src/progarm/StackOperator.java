package progarm;

import java.util.Stack;

public class StackOperator {

    static int evalRPN(String[] s) {
        int ret = 0;
        String oper = "+*-/";
        Stack<String> stack = new Stack<>();
        for (String t : s
        ) {
            if (!oper.contains(t)) {
                stack.push(t);
            } else {
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                switch (t) {
                    case "+":
                        stack.push(String.valueOf(a + b));
                        break;
                    case "*":
                        stack.push(String.valueOf(a * b));
                        break;
                    case "/":
                        stack.push(String.valueOf(a / b));
                        break;
                    case "-":
                        stack.push(String.valueOf(a - b));
                        break;
                }
            }

        }
        ret=Integer.valueOf(stack.pop());
        return ret;
    }

    public static void main(String[] args) {
        String[] tokens = new String[]{"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(tokens));
    }
}
