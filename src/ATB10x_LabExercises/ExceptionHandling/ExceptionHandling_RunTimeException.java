package ATB10x_LabExercises.ExceptionHandling;

public class ExceptionHandling_RunTimeException {

    public static void main(String []args){

        int a = 0;
        int b = 100;
        int c = b/a;  //java.lang.ArithmeticException: / by zero
        System.out.println(c);

        //Run Time Exception also called as Unchecked Exception

        String s = null;
        s.trim();  //java.lang.NullPointerException: Cannot invoke "String.trim()" because "s" is null

    }
}
