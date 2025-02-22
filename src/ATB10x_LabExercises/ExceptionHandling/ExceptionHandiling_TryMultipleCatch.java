package ATB10x_LabExercises.ExceptionHandling;

public class ExceptionHandiling_TryMultipleCatch {

    public static void main(String[] args) {

        try {
            System.out.println("Start Program");
            String ip = args[0];  //Pass argument from Edit Configuration
            int a = Integer.parseInt(ip);
            int b = 100/a;
            System.out.println(b);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }


    }
}
