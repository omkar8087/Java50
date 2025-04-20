package org.example;

public class palindrome {
    public static void main(String[] args){
        String str = "abc";
        String rev = "";

        for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);

        }

        if(str.equals(rev)){
            System.out.println("This is palindrome");
        }else{
            System.out.println("is not palindrome");
        }
    }
}
