package ATB10x_CoreJava_Programs.Maths;


import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms for Fibonacci series: ");
        int num = sc.nextInt();

        printFibonacciSeries(num);


    }
    public static void printFibonacciSeries(int num){

        int firstNum = 0, secondNum = 1;

        System.out.print("Fibonacci Series :" + firstNum +" "+ secondNum);

        for(int i =2; i<num; i++){
            int next = firstNum + secondNum;
            System.out.print(" "+next);
            firstNum = secondNum;
            secondNum = next;
        }

    }

}
