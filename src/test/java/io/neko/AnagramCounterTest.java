package io.neko;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class AnagramCounterTest {
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void countAnagramsForInvalidInput() {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Please provide not null or empty input list");
        AnagramCounter counter = new AnagramCounter();
        Map<String, Integer> result = counter.countAnagrams(null);
    }

    @Test
    public void countAnagramsFromValidInput() {
        List<String> input = Arrays.asList("abc", "123", "231", "321", "bca", "xyza", "ayzx", "yzxa");
        AnagramCounter counter = new AnagramCounter();
        Map<String, Integer> result = counter.countAnagrams(input);

        assertEquals(Integer.valueOf(1), result.get("abc"));
        assertEquals(Integer.valueOf(2), result.get("123"));
        assertEquals(Integer.valueOf(2), result.get("231"));
        assertEquals(Integer.valueOf(1), result.get("bca"));
        assertEquals(Integer.valueOf(2), result.get("xyza"));
        assertEquals(Integer.valueOf(2), result.get("ayzx"));
        assertEquals(Integer.valueOf(2), result.get("yzxa"));
    }
}
