package org.example;

public class LongestPalindromeArray {
    public static void main(String[] args){
        String[] arr = {"abc", "madam", "racecar", "hello", "noon"};
        String longest = "";


        for(String str : arr){
            if(isPalindrom(str)&& str.length() > longest.length()){
                longest = str;
            }
        }

        if(!longest.equals("")){
            System.out.println("longest palindrome in array is" + " "+longest);

        }else{
            System.out.println("no Palindrome is found");
        }
    }

    public static boolean isPalindrom(String str){
        String reverse ="";

        for(int i=str.length()-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }

        if(str.equals(reverse)){
            return true;
        }else{
            return false;
        }

    }
}
