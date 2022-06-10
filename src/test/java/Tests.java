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


    @Test
    void testPrecAddSub() {
        var tokens = Parser.postfix("( 4 - 3 ) * 2 + 11");
        var ans = Evaluator.eval(tokens);
        assertEquals(13, ans);
    }

    @Test
    void testShouldZero() {
        var tokens = Parser.postfix("3 / 4 * 4");
        var ans = Evaluator.eval(tokens);
        assertEquals(0, ans);
    }

    @Test
    void testPrecAnother() {
        var tokens = Parser.postfix("4 / 3 * 4");
        var ans = Evaluator.eval(tokens);
        assertEquals(4, ans);
    }

    @Test
    void testPrecAddSubstract1() {
        var tokens = Parser.postfix("2 - 3 + 4");
        var ans = Evaluator.eval(tokens);
        assertEquals(3, ans);
    }

    @Test
    void testPrecAddSubstract2() {
        var tokens = Parser.postfix("2 + 3 - 4");
        var ans = Evaluator.eval(tokens);
        assertEquals(1, ans);
    }
}
