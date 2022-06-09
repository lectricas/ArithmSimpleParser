public class Main {
    public static void main(String[] args) {
        var tokens = Parser.postfix("( 5 + 7 ) * 2");
        var ans = Evaluator.eval(tokens);
        System.out.println(ans);
    }
}
