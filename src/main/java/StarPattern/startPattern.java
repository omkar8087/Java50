package StarPattern;

public class startPattern {
    public static void main(String[] args){

        patter8(5);

    }

    //*
    //* *
    //* * *
    //* * * *

    static void patter1(int n){
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<= row ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //* * * *
    //* * * *
    //* * * *
    //* * * *

    static void patter2(int n){
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<= n ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //* * * *
    //* * *
    //* *
    //*

    static void patter3(int n){
        for(int row = n ; row >= 1 ; row --){
            for(int col= 1; col<= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    //1234
    //123
    //12
    //1

    static void patter4(int n){
        for(int row = n ; row >= 1 ; row --){
            for(int col= 1; col<= row; col++){
                System.out.print(col);
            }
            System.out.println();
        }

    }


    //1
    //12
    //123
    //1234

    static void patter5(int n){
        for(int row = 1 ; row <= n ; row ++){
            for(int col= 1; col<= row; col++){
                System.out.print(col);
            }
            System.out.println();
        }



    }

    //1
    //12
    //123
    //1234
    //123
    //12
    //1

    static void patter6(int n){
        for(int row = 1 ; row <= n ; row ++){
            for(int col= 1; col<= row; col++){
                System.out.print(col);
            }
            System.out.println();
        }

        for(int row = n-1 ; row >= 1 ; row --){
            for(int col= 1; col<= row; col++){
                System.out.print(col);
            }
            System.out.println();
        }

    }

    //*
    //* *
    //* * *
    //* * * *
    //* * *
    //* *
    //*
    static void patter7(int n){
        for(int row = 1 ; row <= n ; row ++){
            for(int col= 1; col<= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int row = n-1 ; row >= 1 ; row --){
            for(int col= 1; col<= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }


    //*****
    //*   *
    //*   *
    //*   *
    //*****

    static void patter8(int n){
        for(int row =1 ; row<=n; row ++){
            for(int col = 1 ; col<=n; col++){
                if(row ==1 || col == 1 || row == n || col ==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


}


