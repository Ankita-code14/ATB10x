package ATB10x_CoreJava_Programs.Maths;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){

        //Program Explanation link
        //https://www.youtube.com/watch?v=TWxVJ5RAacA&t=2995s

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();

        int revNum = 0;
        int lastDigit;

        while(num!=0){
            lastDigit = num % 10;
            revNum = revNum*10 + lastDigit;
            num = num/10;
        }

        System.out.println("Reverse Number is : "+ revNum);

    }
}
