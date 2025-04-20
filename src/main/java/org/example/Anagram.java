package org.example;

import java.util.*;


public class Anagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str1 = sc.nextLine();

        System.out.println("enter the another string");
        String str2 = sc.nextLine();

        char [] arg1 = str1.toCharArray();
        char [ ] arg2 = str2.toCharArray();

        Arrays.sort(arg1);
        Arrays.sort(arg2);

        String str3 = String.valueOf(arg1);
        String str4 = String.valueOf(arg2);

        if(str3.equals(str4)){
            System.out.println("Enter string is anagram");
        }else{
            System.out.println("it is not anagram");
        }


    }
}
