package org.ahmeteminsaglik.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {

    public static String convertDoubleToString(double number) {
        return Double.toString(number);
    }

    public static String convertIntegerToString(int number) {
        return Integer.toString(number);
    }

    public static String convertLongToString(long number) {
        return Long.toString(number);
    }

    public static String convertFloatToString(float number) {
        return Float.toString(number);
    }

    private static String removeGivenCharactersInStringFormat(char[] chars, String numText) {
        for (int i = 0; i < chars.length; i++) {
            numText.replace(Character.toString(chars[i]), "");
        }
        return numText;
    }

    private static boolean isEqualsToZero(String numText) {
        if (numText.contains("-")) {
            numText = numText.replace("-", "");
        }
        if (numText.equals("0") || numText.equals("0.0")) {
            return true;
        }
        return false;
    }

    private static String[] splitNumberText(String numText) {
        return numText.split("[.]");
    }

    private static String reverseString(String numText) {
        StringBuilder stringBuilder = new StringBuilder(numText);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    private static boolean isNegative(String numText) {
        if (numText.contains("-")) {
            return true;
        }
        return false;
    }

    private static String getNumberTextWithUnderScore(String numberText) {
        List<String> numList = splitText(numberText);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numList.size(); i++) {
            stringBuilder.append(numList.get(i));
            if (i < numList.size() - 1) {
                stringBuilder.append("_");
            }
        }
        return stringBuilder.toString();
    }

    private static List<String> splitText(String numText) {
        List<String> splitNumList = new ArrayList<>();
        int number = 3;
        Pattern pattern = Pattern.compile(".{1," + number + "}");
        Matcher matcher = pattern.matcher(numText);
        while (matcher.find()) {
            String part = numText.substring(matcher.start(), matcher.end());
            splitNumList.add(part);
        }
        return splitNumList;
    }

    public static String getProcessedNumberText(String numberText) {

        boolean isEqualsToZero = Utility.isEqualsToZero(numberText);
        if (isEqualsToZero) {
            return "0";
        }
        boolean isNumNegative = isNegative(numberText);
        if (isNumNegative) {
            numberText = numberText.replace("-", "");
        }


        numberText = reverseString(numberText);
        numberText = getNumberTextWithUnderScore(numberText);
        numberText = reverseString(numberText);
        if (isNumNegative) {
            numberText = "-" + numberText;
        }

        return numberText;
    }

    private static String getProcessedNumberTextForDecimalNumbers(String decimalNumber) {
        decimalNumber = reverseString(decimalNumber);
        decimalNumber = getProcessedNumberText(decimalNumber);
        decimalNumber = reverseString(decimalNumber);
        return decimalNumber;
    }

    private static String prepareNumbersHavingDecimal(String numText) {
        char[] doubleChar = {'d', 'f'};
        numText = removeGivenCharactersInStringFormat(doubleChar, numText);
        return numText;
    }

    public static String getProcessedNumbersHavingDecimal(String numText) {
        if (isEqualsToZero(numText)) {
            return "0.0";
        }

        boolean isNumNegative = isNegative(numText);
        if (isNumNegative) {
            numText = numText.replace("-", "");
        }

        String[] numTextArr = splitNumberText(numText);
        String firstPart = getProcessedNumberText(numTextArr[0]);
        String secondPart = getProcessedNumberTextForDecimalNumbers(numTextArr[1]);
        StringBuilder finalNumberText = new StringBuilder();

        finalNumberText.append(firstPart)
                .append(".")
                .append(secondPart);

        if (isNumNegative) {
            finalNumberText.insert(0, "-");
        }
        return finalNumberText.toString();
    }
}
