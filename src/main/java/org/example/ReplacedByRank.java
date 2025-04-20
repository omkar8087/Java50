package org.example;

//15. Write a code to replace each element in an array by its rank in the array\
import java.util.*;
public class ReplacedByRank {
    public static void main(String[] args){
        int [] arr = {50,20,20,30,10};

         // copying array
        int[] temp = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            temp[i] = arr[i];
        }

        //sorting array
        Arrays.sort(temp);

        Map<Integer, Integer> map = new HashMap<>();
        int index = 1;

        for(int i =0; i<temp.length; i++){
            if(!map.containsKey(temp[i]) ){

                map.put(temp[i],index++);
            }
        }

        int [] rank = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            rank[i] = map.get(arr[i]);
        }

        System.out.println(Arrays.toString(rank));

    }
}
