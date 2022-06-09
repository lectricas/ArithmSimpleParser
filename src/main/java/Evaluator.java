import java.util.Stack;

public class Evaluator {
    public static Double eval(String expr) {
        String cleanExpr = expr;
        Stack<Double> stack = new Stack<>();
        for (String token : cleanExpr.split("\\s")) {
            Double tokenNum = null;
            try {
                tokenNum = Double.parseDouble(token);
            } catch (NumberFormatException e) {
                //pass
            }
            if (tokenNum != null) {
                stack.push(Double.parseDouble(token + ""));
            } else if (token.equals("*")) {
                double secondOperand = stack.pop();
                double firstOperand = stack.pop();
                stack.push(firstOperand * secondOperand);
            } else if (token.equals("/")) {
                double secondOperand = stack.pop();
                double firstOperand = stack.pop();
                stack.push(firstOperand / secondOperand);
            } else if (token.equals("-")) {
                double secondOperand = stack.pop();
                double firstOperand = stack.pop();
                stack.push(firstOperand - secondOperand);
            } else if (token.equals("+")) {
                double secondOperand = stack.pop();
                double firstOperand = stack.pop();
                stack.push(firstOperand + secondOperand);
            } else if (token.equals("^")) {
                double secondOperand = stack.pop();
                double firstOperand = stack.pop();
                stack.push(Math.pow(firstOperand, secondOperand));
            } else {
                System.out.println("Error");
                return null;
            }
        }
        return stack.pop();
    }
}
