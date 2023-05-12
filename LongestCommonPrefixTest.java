package longest.common.prefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {
    LongestCommonPrefix longestCommonPrefixObject = new LongestCommonPrefix();

    @Test
    void testLongestCommonPrefixVoid() throws Throwable {
        String[] data = {"",""};
        String value = longestCommonPrefixObject.longestCommonPrefix(data);
        assertEquals("", value);
    }

    @Test
    void testLongestCommonPrefix() throws Throwable {
        String[] data = {"agua","aguaa","aguaaa","aguaaaa"};
        String value = longestCommonPrefixObject.longestCommonPrefix(data);
        assertEquals("agua", value);
    }

    @Test
    void testLongestCommonOther() throws Throwable {
        String[] data = {"agua","auxilio","ave","alcatraz"};
        String value = longestCommonPrefixObject.longestCommonPrefix(data);
        assertEquals("a", value);
    }
}