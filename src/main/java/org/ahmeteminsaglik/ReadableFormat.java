package org.ahmeteminsaglik;


public class ReadableFormat {

    public static String getStringValue(int num) {
        if (num==0) {
            return "0";
        }

        boolean isNumNegative = false;
        if (num < 0) {
            isNumNegative = true;
            num *= -1;
        }


        String text = "";
        int j = 0;
        while (num > 0) {
            text = num % 10 + text;
            num /= 10;
            j++;
            if (j % 3 == 0 && num > 0) {
                text = "_" + text;
            }

        }
        if (isNumNegative) {
            text = "-" + text;
        }
        return text;
    }

    public static String getStringValue(long num) {

        if (num==0) {
            return "0";
        }
        boolean isNumNegative = false;
        if (num < 0) {
            isNumNegative = true;
            num *= -1;
        }


        String text = "";
        int j = 0;
        while (num > 0) {
            text = num % 10 + text;
            num /= 10;
            j++;
            if (j % 3 == 0 && num > 0) {
                text = "_" + text;
            }
        }

        if (isNumNegative) {
            text = "-" + text;
        }
        return text;
    }
}
