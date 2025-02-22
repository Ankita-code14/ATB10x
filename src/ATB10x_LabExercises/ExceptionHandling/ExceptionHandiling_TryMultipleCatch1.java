package ATB10x_LabExercises.ExceptionHandling;

public class ExceptionHandiling_TryMultipleCatch1 {

    public static void main(String[] args) {

        try {
            System.out.println("Start Program");
            String ip = args[0];  //Pass argument from Edit Configuration
            int a = Integer.parseInt(ip);
            int b = 100/a;
            System.out.println(b);
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }


    }
}
