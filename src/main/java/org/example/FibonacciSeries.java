package org.example;

public class FibonacciSeries {
    public static void main(String[] args){
        printFibonacciSerires(10);
    }

    private static void printFibonacciSerires(int n) {
        int firstNumber =0;
        int secondNumber = 1;
        int nextNumber = 0;

        for(int i=0;i<n; i++){

            System.out.print(firstNumber+ " ");
            nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }

}
