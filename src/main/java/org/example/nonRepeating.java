package org.example;

public class nonRepeating {
    public static void main(String[] args){
        String str = "omkar naresh jadhav";

        char[] chr = str.toCharArray();

        boolean[] visited = new boolean[str.length()];

        for(int i=0; i<chr.length; i++){
            if(visited[i] || chr[i] == ' '){
                continue;
            }

            int count =0;
            for(int j=0; j<chr.length; j++){
                if(chr[i] == chr[j]){
                    count ++;
                    visited[j] = true;
                }
            }

            if(count == 1){
                System.out.println(chr[i] +" "+ count);
            }
        }

    }
}
