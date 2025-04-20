package org.example;

public class FactorialOfNumber {
    public static void main(String[] args){
        int factorial = 5;
        int isfactorial = 1;

        for(int i=1 ;i<factorial ;i++){
            isfactorial = isfactorial*i;
        }
        System.out.println(isfactorial);
    }
}
