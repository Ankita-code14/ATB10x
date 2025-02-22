package ATB10x_LabExercises.ExceptionHandling;

public class ExceptionHandling_TryCatch {

    public static void main(String [] args){

        int a = 0;
        int b = 100;

        try {
            int c = b/a;
            System.out.println(c);

        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage()); //return exception message
            System.out.println("We can also give our own exception msg");

            e.printStackTrace();   //gives you full log of exception
        }

        System.out.println("If exception occurs it will print ? - yes");


        //Throwable -> Exception -> any Exception Name
        //we can also write catch(Throwable e) instead of catch(Exception e)
        //or we can also write (ArithmeticException e) if we know the exact exception name

        // we can also used multiple catch blocks, but order should follow as given
        // we can not write Throwable - Exception - ExceptionName(ArithmeticException)

/*        try {
            int c = b/a;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }catch (Throwable e) {
            System.out.println(e.getMessage());
        }*/


        //Using try catch block program execution get slow


    }
}
