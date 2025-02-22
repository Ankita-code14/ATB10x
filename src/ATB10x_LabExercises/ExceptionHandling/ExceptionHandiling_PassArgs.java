package ATB10x_LabExercises.ExceptionHandling;

import ATB10x_LabExercises.OOPs_Interface.Interface_Ex;

public class ExceptionHandiling_PassArgs {

    public static void main(String[] args) {

        System.out.println("Start Program");
        String ip = args[0];  //Pass argument from Edit Configuration
        int a = Integer.parseInt(ip);
        int b = 100/a;
        System.out.println(b);
        System.out.println("End Program");

        //java.lang.ArithmeticException: / by zero  -> Argument pass as 0
        //java.lang.NumberFormatException: For input string: "TestAnkita"  -> Argument pass as String
        //java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0   -> Argument not pass


    }
}
