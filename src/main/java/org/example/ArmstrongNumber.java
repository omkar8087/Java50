package org.example;
import java.util.Scanner;
public class ArmstrongNumber {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int num = sc.nextInt();
            int sum =0;

            int original = num;
            int temp = num;
            int count =0;

            while(temp !=0){
                temp /= 10;
                count ++;

            }

            temp = num; // need to initialize again 
            while(temp !=0){
                int digit = temp % 10;
                sum += Math.pow(digit,count);
                temp /= 10;
            }

            if(sum == original){
                System.out.println("This is armstrong number");
            }else{
                System.out.println("This is not armstrong number");
            }

        }


}
