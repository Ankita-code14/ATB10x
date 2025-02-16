package ATB10x_LabExercises.OOPs_Polymorphism.MethodOverriding;

public class MethodOverriding_Ex {
    public static void main(String[] args) {
        Son s = new Son();
        s.home();

        System.out.println("---------------");

        Father f = new Father();
        f.home();

        System.out.println("---------------");

        Father s1 = new Son();  // Dynamic Dispatch
        s1.home();


    }


}
