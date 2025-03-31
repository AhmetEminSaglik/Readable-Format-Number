package org.ahmeteminsaglik;

public class ReadableFormat {

    public static String getStringValue(Integer num) {
        if (num == null) return null;
        String numberText = Utility.convertIntegerToString(num);
        return Utility.getProcessedNumberText(numberText);
    }

    public static String getStringValue(Long num) {
        if (num == null) return null;
        String numberText = Utility.convertLongToString(num);
        return Utility.getProcessedNumberText(numberText);
    }

    public static String getStringValue(Double num) {
        if (num == null) return null;
        String numText = Utility.convertDoubleToString(num);
        return Utility.getProcessedNumbersHavingDecimal(numText);
    }

    public static String getStringValue(Float num) {
        if (num == null) return null;
        String numText = Utility.convertFloatToString(num);
        return Utility.getProcessedNumbersHavingDecimal(numText);
    }

}
