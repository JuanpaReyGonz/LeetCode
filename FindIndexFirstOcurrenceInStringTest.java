package find.index.first.occurrence.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindIndexFirstOcurrenceInStringTest {
    FindIndexFirstOccurrenceInString findIndexFirstOccurrenceInString = new FindIndexFirstOccurrenceInString();
    @Test
    void testFindIndexOcurrenceFalse() throws Throwable {
        String haystac = "leetcode";
        String needle = "leeto";
        int value = findIndexFirstOccurrenceInString.strStr(haystac, needle);
        assertEquals(-1, value);
    }

    @Test
    void testFindIndexOcurrenceTrue() throws Throwable {
        String haystac = "sadbutsad";
        String needle = "sad";
        int value = findIndexFirstOccurrenceInString.strStr(haystac, needle);
        assertEquals(0, value);
    }
}
