public class Main {
    public static void main(String[] args) {
        var tokens = Parser.postfix("4 * 3 / 4");
        var ans = Evaluator.eval(tokens);
        System.out.println(ans);
    }
}
