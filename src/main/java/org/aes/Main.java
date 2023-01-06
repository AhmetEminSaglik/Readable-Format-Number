package org.aes;

public class Main {
    public static void main(String[] args) {
        int num=1234;
        String text=ReadableFormat.getStringValue(num);
        System.out.println(text);


        long num2=123456789123L;
        String text2=ReadableFormat.getStringValue(num2);
        System.out.println(text2);
    }
}
