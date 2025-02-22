package ATB10x_LabExercises.Generics;

public class Generics_Method {

    public static void main(String[] args){

        temp(23, 45);
        temp("Ankita", "Rohan");
        temp(true, false);

        //T -> can be any data type
    }

    public static <T> T temp(T a, T b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
