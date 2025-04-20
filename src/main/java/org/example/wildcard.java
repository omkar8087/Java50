package org.example;

public class wildcard {

    public static boolean isMatch(String str, String pattern){
        pattern = pattern.replace("?",".");
        pattern = pattern.replace("*", ".*");

        return str.matches(pattern);
    }

    public static void main(String[] args){
        String str = "hello";
        String pattern = "he?lo";

        if(isMatch(str, pattern)){
            System.out.println("String match");
        }else{
            System.out.println("String not match");
        }
    }
}
