package org.example;

public class ReverseString {
    public static void main(String[] args){

        String str = "123";
        char[] ch = str.toCharArray();
        StringBuilder str1 = new StringBuilder();

        for(int i=ch.length -1; i>=0; i--){
            str1.append(ch[i]);


        }
        System.out.println(str1);
    }
}
