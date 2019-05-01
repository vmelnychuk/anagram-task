package io.neko.util;

import io.neko.util.StringUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {
    @Test
    public void sortString() {
        assertEquals("abz", StringUtils.sort("zba"));
        assertEquals("abcdfg", StringUtils.sort("gbcfda"));
    }
}
