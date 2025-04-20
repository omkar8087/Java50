package revision1;

import java.util.*;

public class Anagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1 = sc.nextLine();
        System.out.println("Enter the Second String");
        String str2 = sc.nextLine();

        char [] arg1 = str1.toCharArray();
        char [] arg2 = str2.toCharArray();

        Arrays.sort(arg1);
        Arrays.sort(arg2);

        String sort1 = String.valueOf(arg1);
        String sort2 = String.valueOf(arg2);

        if(sort1.equals(sort2)){
            System.out.println("This is anagram");
        }else{
            System.out.println("This is not anagram");
        }
    }
}
