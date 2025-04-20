package revision1;

import java.util.Arrays;

public class circularRotation {
    public static void main(String[] args){
        int [] arg = {1,2,3,4,5};
        int n = arg.length;
        int k = 4;
        // for rotation
        k = k%n;

        isReversed(arg,0,n-1);
        isReversed(arg,0,k-1);
        isReversed(arg,k,n-1);

        System.out.println(Arrays.toString(arg));


    }

    public static void isReversed(int[] arg, int first, int last){
        while(first<last){
            int temp = arg[first];
            arg[first] = arg[last];
            arg[last] = temp;
            first++;
            last--;
        }
    }
}
