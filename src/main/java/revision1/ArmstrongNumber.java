package revision1;

import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        int original = num;

        int temp = num;
        int sum =0;
        int count = 0;

        while(num!=0){
            num /= 10;
            count++;
        }

        num = temp;

        while(temp!=0){
            int digit = temp %10;
            sum += Math.pow(digit, count);
            temp /= 10;

        }

        if(sum == original){
            System.out.println("This is Armstrong number");
        }else{
            System.out.println("This is not Armstrong number");

        }
    }
}
