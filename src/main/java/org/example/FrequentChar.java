package org.example;
//Write code to Calculate frequency of characters in a string
public class FrequentChar {
    public static void main(String[] args){
        String str = "omkar naresh jadhav";
        char[] ch = str.toCharArray();

        boolean[] visited = new boolean[ch.length];

        for(int i =0 ; i<ch.length; i++){
            if(visited[i]|| ch[i] == ' '){
                continue;
            }
            int count = 0;
            for(int j = 0; j<ch.length; j++){
                if(ch[i] == ch[j]){
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(ch[i] + " "+count);
        }
    }
}


//OMKAR jadhav:
//class practice7 {
//    public static void main(String[] args) {
//        String str = "omkar naresh jadhav";
//        char[] ch = str.toCharArray();
//        boolean[] visited = new boolean[ch.length];
//
//        for (int i = 0; i < ch.length; i++) {
//            if (visited[i]) {
//                continue;
//            }
//            int count = 0;
//            for (int j = 0; j < ch.length; j++) {
//                if (ch[i] == ch[j]) {
//                    count++;
//                    visited[j] = true;
//
//                }
//            }
//
//            System.out.println(ch[i] + " " + count);
//        }
//    }
//}