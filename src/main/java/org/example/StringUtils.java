package org.example;

public class StringUtils {
    public static int countDigits(String str) {
        if (str == null) return 0;
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) count++;
        }
        return count;
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

