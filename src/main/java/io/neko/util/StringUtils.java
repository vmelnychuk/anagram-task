package io.neko.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringUtils {
    public static String sort(final String str) {
        char[] array = str.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }
}
