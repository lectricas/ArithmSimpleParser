import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
    @Test
    void testSimple() {
        var tokens = Parser.postfix("12 + 4 * 11");
        var actual = Evaluator.eval(tokens);
        assertEquals(56, actual);
    }

    @Test
    void testPrec() {
        var tokens = Parser.postfix("4 * 3 / 4 + 1 * 8 / 4");
        var ans = Evaluator.eval(tokens);
        assertEquals(5, ans);
    }
}
