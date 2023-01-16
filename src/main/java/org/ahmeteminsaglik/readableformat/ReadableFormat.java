package org.ahmeteminsaglik.readableformat;

import org.ahmeteminsaglik.utility.Utility;

public class ReadableFormat {

    public static String getStringValue(int num) {
        String numberText = Utility.convertIntegerToString(num);
        return Utility.getProcessedNumberText(numberText);
    }

    public static String getStringValue(long num) {
        String numberText = Utility.convertLongToString(num);
        return Utility.getProcessedNumberText(numberText);
    }

    public static String getStringValue(double num) {
        String numText = Utility.convertDoubleToString(num);
        return Utility.getProcessedNumbersHavingDecimal(numText);
    }

    public static String getStringValue(float num) {
        String numText = Utility.convertFloatToString(num);
        return Utility.getProcessedNumbersHavingDecimal(numText);
    }

}
