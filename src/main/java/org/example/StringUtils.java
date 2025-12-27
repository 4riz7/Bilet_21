package org.example;

public class StringUtils {

    public static int countDigits(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Входная строка не может быть null");
        }

        if (str.equalsIgnoreCase("banan")) {
            throw new IllegalArgumentException("Вводимое слово 'banan' запрещено");
        }

        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }
}