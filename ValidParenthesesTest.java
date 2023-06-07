import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {
    ValidParentheses validParentheses = new ValidParentheses();

    @Test
    void isValidParentheses() throws Throwable{
        String data = "()";
        boolean response = validParentheses.isValid(data);
        assertTrue(response);
    }

    @Test
    void isValidBrackets() throws Throwable{
        String data = "[]";
        boolean response = validParentheses.isValid(data);
        assertTrue(response);
    }

    @Test
    void isValidCurlyBrackets() throws Throwable{
        String data = "{}";
        boolean response = validParentheses.isValid(data);
        assertTrue(response);
    }

    @Test
    void isValidCombination() throws Throwable{
        //String data = "{[()]}";
        String data = "([";
        boolean response = validParentheses.isValid(data);
        assertFalse(response);
    }

    @Test
    void isValidCombinationError() throws Throwable{
        String data = "()(][]{}";
        boolean response = validParentheses.isValid(data);
        assertFalse(response);
    }

    @Test
    void isValidBadCombination() throws Throwable{
        String data = "([)]";
        boolean response = validParentheses.isValid(data);
        assertFalse(response);
    }
}