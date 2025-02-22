package ATB10x_LabExercises.ExceptionHandling;

public class ExceptionHandiling_TryCatchFinally {
    public static void main(String[] args) {
        final double pi = 3.14;
        int a = 0;
        try{
            int x = 10/a;
        } catch (Exception e){
            System.out.println("divide by zero");
        } finally {
            System.out.println("i will be execute anyhow");
        }
    }
}
