package ATB10x_LabExercises.OOps_Inheritance.Hierarchical_Inheritance;

public class Hierarchical_Inheritance {
    public static void main(String [] args){

        Child1 ch1 = new Child1();
        ch1.ch1_method();
        ch1.home();

        System.out.println("----------------");

        Child2 ch2 = new Child2();
        ch2.ch2_method();
        ch2.home();

        System.out.println("----------------");

        Child3 ch3 = new Child3();
        ch3.ch3_method();
        ch3.home();

    }
}
