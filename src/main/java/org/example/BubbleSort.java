package org.example;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int [] arg = {2, 53, 26, 8, 1};


        for(int i=0; i<arg.length;i++){
            int temp =0;
            for(int j =i; j<arg.length; j++){
                if(arg[i]>arg[j]){
                    temp = arg[i];
                    arg[i] = arg[j];
                    arg[j] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(arg));

    }
}
