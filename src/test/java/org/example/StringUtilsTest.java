package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @Test void testCountDigitsOnly() { assertEquals(5, StringUtils.countDigits("12345")); }
    @Test void testCountDigitsMixed() { assertEquals(3, StringUtils.countDigits("a1b2c3")); }
    @Test void testCountDigitsNone() { assertEquals(0, StringUtils.countDigits("abc")); }
    @Test void testCountDigitsEmpty() { assertEquals(0, StringUtils.countDigits("")); }
    @Test void testCountDigitsSpecial() { assertEquals(2, StringUtils.countDigits("!@#12#$%")); }
    @Test void testCountDigitsNull() { assertEquals(0, StringUtils.countDigits(null)); }
}


