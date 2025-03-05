package ATB10x_CoreJava_Programs.Maths;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args){

        int a,b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        a = sc.nextInt();

        System.out.println("Enter Second number : ");
        b = sc.nextInt();

        //Swap Two Numbers Using Temp Variable
        swapNumbersUsingTemp(a,b);

        //Swap Tow Numbers Without Using Temp Variable
        swapNumbersWithoutUsingTemp(a,b);

    }
    public static void swapNumbersUsingTemp(int a, int b){
        int temp;

        System.out.println("Orignal values are first : "+ a + " Second : "+ b);
        temp = a;
        a = b;
        b = temp;

        System.out.println("Swap values are first : "+ a + " Second : "+ b);


    }

    public static void swapNumbersWithoutUsingTemp(int a, int b){

        System.out.println("Orignal values are first : "+ a + " Second : "+ b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Swap values are first : "+ a + " Second : "+ b);

    /*   a = 5 + 4; 9
       b = 9 - 4; 5
       a = 9 - 5; 4*/


    }
}
