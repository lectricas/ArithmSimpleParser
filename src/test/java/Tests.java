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
    void testSimpleDouble() {
        var tokens = Parser.postfix("12.3234 + 4.11 * 11.23");
        var actual = Evaluator.eval(tokens);
        assertEquals(58.4787, actual);
    }

    @Test
    void testParan() {
        var tokens = Parser.postfix("( 12.3234 + 4.11 ) * 11.23");
        var actual = Evaluator.eval(tokens);
        assertEquals(184.547082, actual);
    }
}
