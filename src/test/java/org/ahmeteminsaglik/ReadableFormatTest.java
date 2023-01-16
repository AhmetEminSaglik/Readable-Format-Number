package org.ahmeteminsaglik;


import org.ahmeteminsaglik.readableformat.ReadableFormat;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ReadableFormatTest {


    @Test
    @DisplayName("Integer Negative Test")
    @Order(1)
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
    @DisplayName("Integer Zero Test")
    @Order(2)
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
    @DisplayName("Integer Postive Test")
    @Order(3)
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
    @DisplayName("Long Negative Test")
    @Order(4)
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
    @DisplayName("Long Zero Test")
    @Order(5)
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
    @DisplayName("Long Positive Test")
    @Order(6)
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


    @Test
    @DisplayName("Double Negative Test")
    @Order(7)
    public void testNegativeDoubleNumberReadeableFormat() {
        List<Double> doubleNumbList = new ArrayList<>();
        doubleNumbList.add(-1d);
        doubleNumbList.add(-1.123456789);
        doubleNumbList.add(-12.101);
        doubleNumbList.add(-123.1012);
        doubleNumbList.add(-1234.10123);
        doubleNumbList.add(-12345.101234);
        doubleNumbList.add(-123456.1012345);
        doubleNumbList.add(-1234567.10123456);
        doubleNumbList.add(-1234567.);
        doubleNumbList.add(-1234567.0);
        doubleNumbList.add(-1234567.d);
        doubleNumbList.add(-1234567d);
        String[] readableStringText = {"-1.0", "-1.123_456_789", "-12.101", "-123.101_2", "-1_234.101_23", "-12_345.101_234", "-123_456.101_234_5", "-1_234_567.101_234_56", "-1_234_567.0", "-1_234_567.0", "-1_234_567.0", "-1_234_567.0"};
        for (int i = 0; i < doubleNumbList.size(); i++) {
            String expected = readableStringText[i];
            String actual = ReadableFormat.getStringValue(doubleNumbList.get(i));
            String errMsg = "Double value must return as " + expected + ". But it return like " + actual + " i : " + i;
            assertEquals(expected, actual, errMsg);
        }

    }

    @Test
    @DisplayName("Double Zero Test")
    @Order(8)
    public void testZeroDoubleNumberReadeableFormat() {
        List<Double> doubleNumbList = new ArrayList<>();
        doubleNumbList.add(0.0);
        doubleNumbList.add(0.);
        doubleNumbList.add(-0.0);
        doubleNumbList.add(00.00);
        doubleNumbList.add(0.d);
        doubleNumbList.add(0d);
        doubleNumbList.add(0.000);
        String[] readableStringText = {"0.0", "0.0", "0.0", "0.0", "0.0", "0.0", "0.0"};
        for (int i = 0; i < doubleNumbList.size(); i++) {
            String expected = readableStringText[i];
            String actual = ReadableFormat.getStringValue(doubleNumbList.get(i));
            String errMsg = "Double value must return as " + expected + ". But it return like " + actual + " i : " + i;
            assertEquals(expected, actual, errMsg);
        }

    }

    @Test
    @DisplayName("Double Positive Test")
    @Order(9)
    public void testPositiveDoubleNumberReadeableFormat() {
        List<Double> doubleNumbList = new ArrayList<>();
        doubleNumbList.add(0.0);
        doubleNumbList.add(1d);
        doubleNumbList.add(1.123456789);
        doubleNumbList.add(12.101);
        doubleNumbList.add(123.1012);
        doubleNumbList.add(1234.10123);
        doubleNumbList.add(12345.101234);
        doubleNumbList.add(123456.1012345);
        doubleNumbList.add(1234567.10123456);
        doubleNumbList.add(1234567.);
        doubleNumbList.add(1234567.0);
        doubleNumbList.add(1234567.d);
        doubleNumbList.add(1234567d);
        String[] readableStringText = {"0.0", "1.0", "1.123_456_789", "12.101", "123.101_2", "1_234.101_23", "12_345.101_234", "123_456.101_234_5", "1_234_567.101_234_56", "1_234_567.0", "1_234_567.0", "1_234_567.0", "1_234_567.0"};
        for (int i = 0; i < doubleNumbList.size(); i++) {
            String expected = readableStringText[i];
            String actual = ReadableFormat.getStringValue(doubleNumbList.get(i));
            String errMsg = "Double value must return as " + expected + ". But it return like " + actual + " i : " + i;
            assertEquals(expected, actual, errMsg);
        }

    }

    @Test
    @DisplayName("Float Negative Test")
    @Order(10)
    public void testNegativeFloatNumberReadeableFormat() {
        List<Float> doubleNumbList = new ArrayList<>();
        doubleNumbList.add(-1f);
        doubleNumbList.add(-1.1234567f);
        doubleNumbList.add(-12.101f);
        doubleNumbList.add(-123.1012f);
        doubleNumbList.add(-1234.1012f);
        doubleNumbList.add(-12345.101f);
        doubleNumbList.add(-12345.f);
        doubleNumbList.add(-12345.0f);
        doubleNumbList.add(-12345.f);
        doubleNumbList.add(-12345f);
        String[] readableStringText = {"-1.0", "-1.123_456_7", "-12.101", "-123.101_2", "-1_234.101_2", "-12_345.101", "-12_345.0", "-12_345.0", "-12_345.0", "-12_345.0"};
        for (int i = 0; i < doubleNumbList.size(); i++) {
            String expected = readableStringText[i];
            String actual = ReadableFormat.getStringValue(doubleNumbList.get(i));
            String errMsg = "Double value must return as " + expected + ". But it return like " + actual + " i : " + i;
            assertEquals(expected, actual, errMsg);
        }

    }

    @Test
    @DisplayName("Float Zero Test")
    @Order(11)
    public void testZeroFloatNumberReadeableFormat() {
        List<Double> doubleNumbList = new ArrayList<>();
        doubleNumbList.add(0.0);
        doubleNumbList.add(0.);
        doubleNumbList.add(-0.0);
        doubleNumbList.add(00.00);
        doubleNumbList.add(0.d);
        doubleNumbList.add(0d);
        doubleNumbList.add(0.000);
        String[] readableStringText = {"0.0", "0.0", "0.0", "0.0", "0.0", "0.0", "0.0"};
        for (int i = 0; i < doubleNumbList.size(); i++) {
            String expected = readableStringText[i];
            String actual = ReadableFormat.getStringValue(doubleNumbList.get(i));
            String errMsg = "Double value must return as " + expected + ". But it return like " + actual + " i : " + i;
            assertEquals(expected, actual, errMsg);
        }

    }

    @Test
    @DisplayName("Float Positive Test")
    @Order(12)
    public void testPositiveFloatNumberReadeableFormat() {
        List<Float> doubleNumbList = new ArrayList<>();
        doubleNumbList.add(1f);
        doubleNumbList.add(1.1234567f);
        doubleNumbList.add(12.101f);
        doubleNumbList.add(123.1012f);
        doubleNumbList.add(1234.1012f);
        doubleNumbList.add(12345.101f);
        doubleNumbList.add(12345.f);
        doubleNumbList.add(12345.0f);
        doubleNumbList.add(12345.f);
        doubleNumbList.add(12345f);
        String[] readableStringText = {"1.0", "1.123_456_7", "12.101", "123.101_2", "1_234.101_2", "12_345.101", "12_345.0", "12_345.0", "12_345.0", "12_345.0"};
        for (int i = 0; i < doubleNumbList.size(); i++) {
            String expected = readableStringText[i];
            String actual = ReadableFormat.getStringValue(doubleNumbList.get(i));
            String errMsg = "Double value must return as " + expected + ". But it return like " + actual + " i : " + i;
            assertEquals(expected, actual, errMsg);
        }

    }
}