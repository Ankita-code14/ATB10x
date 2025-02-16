package ATB10x_LabExercises.OOPs_Polymorphism.MethodOverloading;

public class MethodOverloading_Ex {
    public static void main(String [] args){

        MathOperations m = new MathOperations();
        System.out.println(m.add(4,5));

        System.out.println(m.add(4,6,8));

        System.out.println(m.add(4.5,6.7));
    }

}
