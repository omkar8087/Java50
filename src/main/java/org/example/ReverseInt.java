package org.example;

public class ReverseInt {
    public static  void main(String[ ] args){
        int num = 2356;
        int reverse = 0;

        while (num != 0){
            int digit = num%10;
            reverse = reverse *10 +digit;
            num = num/10;
        }

        System.out.println(reverse);

    }





}
