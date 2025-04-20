package revision1;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] num ={12, 10, 34, 56, 21};

        int n = num.length;

        for(int i =0; i<n;i++){
            for(int j = i; j<n; j++){
               if(num[i]>num[j]){
                   int temp = num[i];
                   num[i] = num[j];
                   num[j] = temp;
               }
            }
        }

        System.out.println(Arrays.toString(num));
    }
}
