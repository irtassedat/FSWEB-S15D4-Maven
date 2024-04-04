package org.example;
import java.util.Stack;


public class Main {

    public static void main(String[] args) {
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));



        System.out.println(convertDecimalToBinary(5));
        System.out.println(convertDecimalToBinary(6));
        System.out.println(convertDecimalToBinary(13));
    }

    public static boolean checkForPalindrome(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Stack<Character> stack = new Stack<>();
        int length = cleanedStr.length();

        // İlk yarısını stack'e ekle
        for (int i = 0; i < length / 2; i++) {
            stack.push(cleanedStr.charAt(i));
        }

        // Eğer uzunluk tek sayıysa, ortadaki karakteri atla
        int start = length % 2 == 0 ? length / 2 : length / 2 + 1;

        // Stack'den çıkararak ikinci yarısı ile karşılaştır
        for (int i = start; i < length; i++) {
            if (stack.pop() != cleanedStr.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static String convertDecimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal = decimal / 2;
        }
        return binary.toString();
    }
}
