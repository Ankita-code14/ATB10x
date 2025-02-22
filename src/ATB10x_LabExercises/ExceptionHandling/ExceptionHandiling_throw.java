package ATB10x_LabExercises.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandiling_throw {

    static void validate_age(int age){
        if (age < 18){
            try {
                throw new Exception("Age can't be < 18");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        validate_age(17);
        FileInputStream f = new FileInputStream("C:/a.log");
    }
}
