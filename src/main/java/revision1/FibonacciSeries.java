package revision1;

public class FibonacciSeries {
    public static void main(String[] args){
        isfibonacci(10);
    }

    private static void isfibonacci(int num) {
        int firstNumber = 0;
        int secondNumber = 1;
        int thirdNumber = 0;

        for(int i =0; i<num; i++){
            System.out.print(firstNumber+ " ");
            thirdNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;


        }
    }
}
