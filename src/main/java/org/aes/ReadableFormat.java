package org.aes;


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

  /*  private static boolean isNumberEqualsZero(Number number) {
        System.out.println("gelen number : "+number+" ama fonksiyonda number.equals(0) : "+number.equals(0));
        if (number.e0) {
            System.out.println("true donecek yani 0 :<" + number+">");

            return true;
        }
        System.out.println("false donecek yani 0 degil :<" + number+">");

        return false;
    }*/
}
