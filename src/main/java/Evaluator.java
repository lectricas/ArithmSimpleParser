import java.util.Stack;

public class Evaluator {
    public static Integer eval(String expr) {
        String cleanExpr = expr;
        Stack<Integer> stack = new Stack<>();
        for (String token : cleanExpr.split("\\s")) {
            Integer tokenNum = null;
            try {
                tokenNum = Integer.parseInt(token);
            } catch (NumberFormatException e) {
                //pass
            }
            if (tokenNum != null) {
                stack.push(Integer.parseInt(token + ""));
            } else if (token.equals("*")) {
                int secondOperand = stack.pop();
                int firstOperand = stack.pop();
                stack.push(firstOperand * secondOperand);
            } else if (token.equals("/")) {
                int secondOperand = stack.pop();
                int firstOperand = stack.pop();
                stack.push(firstOperand / secondOperand);
            } else if (token.equals("-")) {
                int secondOperand = stack.pop();
                int firstOperand = stack.pop();
                stack.push(firstOperand - secondOperand);
            } else if (token.equals("+")) {
                int secondOperand = stack.pop();
                int firstOperand = stack.pop();
                stack.push(firstOperand + secondOperand);
            } else {
                System.out.println("Error");
                return null;
            }
        }
        return stack.pop();
    }
}
