package net.htwater.leetcode;

public class LeetcodeTest {
    public static void main(String[] args) {
        isPalindrome("s");
    }

    private static boolean isPalindrome(String s) {
        String filterStr=filterNonCharNumber(s);
        String reverseStr=reverseString(filterStr);

        return filterStr.equalsIgnoreCase(reverseStr);
    }

    private static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    private static String filterNonCharNumber(String s) {
        return s.replaceAll("[^A-Za-z0-9]","");
    }
}
