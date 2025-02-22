package ATB10x_LabExercises.ExceptionHandling;

import java.io.FileInputStream;

public class ExceptionHandling_ComplieTimeException {

    public static void main(String[] args){

        //compile Time Exception also called as checked Exception
        //JVM knows about it, During compilation - JVM is saying that
        //there can be case when this file is not found

        //JVM knows that this may lead to file not found exception, so telling to handle it in code

        //FileInputStream fp = new FileInputStream("C://log.txt");
        //Unhandled exception: java. io. FileNotFoundException

    }
}
