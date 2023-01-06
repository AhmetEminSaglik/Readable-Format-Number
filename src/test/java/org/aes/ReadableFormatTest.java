package org.aes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReadableFormatTest {


    @Test
    public void testNegativeIntegerNumberReadeableFormat() {
        int[] intArr = {-1, -12, -123, -1234, -12345, -123456, -1234567, -12345678, -123456789, -1234567890};
        String[] readableStringText = {"-1", "-12", "-123", "-1_234", "-12_345", "-123_456", "-1_234_567", "-12_345_678", "-123_456_789", "-1_234_567_890"};
        assertEquals(intArr.length, readableStringText.length, "Given integer array and String array length are not equals");

        for (int i = 0; i < intArr.length; i++) {
            String expected = readableStringText[i];
            String actual = ReadableFormat.getStringValue(intArr[i]);
            String errMsg = "Integer value must return as " + expected + ". But it return like " + actual;
            assertEquals(expected, actual, errMsg);
        }
    }

    @Test
    public void testZeroIntegerNumberReadeableFormat() {
        int[] intArr = {0, 00, 000, +0000, -0000000};
        String[] readableStringText = {"0", "0", "0", "0", "0"};
        assertEquals(intArr.length, readableStringText.length, "Given integer array and String array length are not equals");

        for (int i = 0; i < intArr.length; i++) {
            String expected = readableStringText[i];
            String actual = ReadableFormat.getStringValue(intArr[i]);
            String errMsg = "Integer value must return as " + expected + ". But it return like " + actual;
            assertEquals(expected, actual, errMsg);
        }
    }

    @Test
    public void testPositiveIntegerNumberReadeableFormat() {
        int[] intArr = {1, 12, 123, 1234, 12345, 123456, 1234567, 12345678, 123456789, 1234567890};
        String[] readableStringText = {"1", "12", "123", "1_234", "12_345", "123_456", "1_234_567", "12_345_678", "123_456_789", "1_234_567_890"};
        assertEquals(intArr.length, readableStringText.length, "Given integer array and String array length are not equals");

        for (int i = 0; i < intArr.length; i++) {
            String expected = readableStringText[i];
            String actual = ReadableFormat.getStringValue(intArr[i]);
            String errMsg = "Integer value must return as " + expected + ". But it return like " + actual;
            assertEquals(expected, actual, errMsg);
        }
    }


    @Test
    public void testNegativeLongNumberReadeableFormat() {

        List<Long> longNumbList = new ArrayList<>();
        longNumbList.add(-1L);
        longNumbList.add(-12L);
        longNumbList.add(-123L);
        longNumbList.add(-1234L);
        longNumbList.add(-12345L);
        longNumbList.add(-123456L);
        longNumbList.add(-1234567L);
        longNumbList.add(-12345678L);
        longNumbList.add(-123456789L);
        longNumbList.add(-1234567890L);
        longNumbList.add(-12345678901L);
        longNumbList.add(-123456789012L);
        longNumbList.add(-1234567890123L);
        longNumbList.add(-12345678901234L);
        longNumbList.add(-123456789012345L);
        longNumbList.add(-1234567890123456L);
        longNumbList.add(-12345678901234567L);
        longNumbList.add(-123456789012345678L);
        longNumbList.add(-1234567890123456789L);
        String[] readableStringText = {"-1", "-12", "-123", "-1_234", "-12_345", "-123_456", "-1_234_567", "-12_345_678", "-123_456_789", "-1_234_567_890", "-12_345_678_901", "-123_456_789_012", "-1_234_567_890_123",
                "-12_345_678_901_234", "-123_456_789_012_345", "-1_234_567_890_123_456", "-12_345_678_901_234_567", "-123_456_789_012_345_678", "-1_234_567_890_123_456_789"};
        assertEquals(longNumbList.size(), readableStringText.length, "Given Long arraylist size  and String array length are not equals");

        for (int i = 0; i < longNumbList.size(); i++) {
            String expected = readableStringText[i];
            String actual = ReadableFormat.getStringValue(longNumbList.get(i));
            String errMsg = "Long value must return as " + expected + ". But it return like " + actual + " i : " + i;
            assertEquals(expected, actual, errMsg);
        }

    }

    @Test
    public void testZeroLongNumberReadeableFormat() {
        List<Long> longNumbList = new ArrayList<>();
        longNumbList.add(0L);
        longNumbList.add(00L);
        longNumbList.add(000L);
        longNumbList.add(+0000L);
        longNumbList.add(-0000000L);
        String[] readableStringText = {"0", "0", "0", "0", "0"};
        assertEquals(longNumbList.size(), readableStringText.length, "Given Long arraylist size  and String array length are not equals");

        for (int i = 0; i < longNumbList.size(); i++) {
            String expected = readableStringText[i];
            String actual = ReadableFormat.getStringValue(longNumbList.get(i));

            String errMsg = "Long value must return as " + expected + ". But it return like " + actual;
            assertEquals(expected, actual, errMsg);
        }
    }

    @Test
    public void testPositiveLongNumberReadeableFormat() {
        List<Long> longNumbList = new ArrayList<>();
        longNumbList.add(1L);
        longNumbList.add(12L);
        longNumbList.add(123L);
        longNumbList.add(1234L);
        longNumbList.add(12345L);
        longNumbList.add(123456L);
        longNumbList.add(1234567L);
        longNumbList.add(12345678L);
        longNumbList.add(123456789L);
        longNumbList.add(1234567890L);
        longNumbList.add(12345678901L);
        longNumbList.add(123456789012L);
        longNumbList.add(1234567890123L);
        longNumbList.add(12345678901234L);
        longNumbList.add(123456789012345L);
        longNumbList.add(1234567890123456L);
        longNumbList.add(12345678901234567L);
        longNumbList.add(123456789012345678L);
        longNumbList.add(1234567890123456789L);
        String[] readableStringText = {"1", "12", "123", "1_234", "12_345", "123_456", "1_234_567", "12_345_678", "123_456_789", "1_234_567_890", "12_345_678_901", "123_456_789_012", "1_234_567_890_123",
                "12_345_678_901_234", "123_456_789_012_345", "1_234_567_890_123_456", "12_345_678_901_234_567", "123_456_789_012_345_678", "1_234_567_890_123_456_789"};
        assertEquals(longNumbList.size(), readableStringText.length, "Given Long arraylist size  and String array length are not equals");

        for (int i = 0; i < longNumbList.size(); i++) {
            String expected = readableStringText[i];
            String actual = ReadableFormat.getStringValue(longNumbList.get(i));
            String errMsg = "Long value must return as " + expected + ". But it return like " + actual + " i : " + i;
            assertEquals(expected, actual, errMsg);
        }

    }


}