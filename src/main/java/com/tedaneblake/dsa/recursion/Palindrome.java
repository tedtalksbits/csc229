package com.tedaneblake.dsa.recursion;

public class Palindrome {

    public boolean isPalindrome(String s) {
        // abba
        if(s.charAt(0) != s.charAt(s.length() - 1)){
            return false;
        }
        s = s.replace(s.charAt(0), '\0').trim();
        System.out.println("s after replacing "+ s);
        if(s.length() == 0 || s.length() == 1) {
            return true;
        }
        return isPalindrome(s);


    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome("abcgbg"));
    }
}
