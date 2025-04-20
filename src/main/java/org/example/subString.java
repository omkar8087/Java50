package org.example;

import java.util.*;


public class subString{
    public static void main(String[] args){
        String original = "Hello world";
        String toString = "world";
        String Replaced = "java";

        String modifiedString = replacedString(original,toString,Replaced);

        System.out.println("original string" + " "+original);
        System.out.println("modified String"+ " "+ modifiedString);
    }

    public static String replacedString(String original, String toString, String Replaced){

        if(!original.contains(toString)){
            return original;
        }

        String modified = original.replaceAll(toString,Replaced);
        return modified;
    }
}