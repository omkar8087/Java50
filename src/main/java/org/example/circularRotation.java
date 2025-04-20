package org.example;

import java.util.Arrays;

public class circularRotation{
    public static void main(String[] args){
        int [] arr = {10,20, 30, 40, 50};
        int n = arr.length;
        int k = 4;

        // rotation
        k = k%n;

        // reverse full arr
        reverse(arr,0,n-1);
        // reverse back arr upto k
        reverse(arr,0,k-1);
        //reverese remaing
        reverse(arr,k,n-1);

        System.out.println(Arrays.toString(arr));



    }

    public static void reverse(int[] arr, int first, int end){
        while(first<end){
            int temp = arr[first];
            arr[first] = arr[end];
            arr[end] = temp;
            first ++;
            end --;
        }
    }
}