package org.example;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int firstNumber = sc.nextInt();

        System.out.println("Enter the second number");
        int secondNumber = sc.nextInt();

        int ans = 1;

        for(int i=1; i<=firstNumber && i<=secondNumber; i++){
            if(firstNumber % i == 0 && secondNumber %i ==0){
                ans = i;
            }
        }

        System.out.println(ans);
    }
}
