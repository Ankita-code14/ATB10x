package ATB10x_LabExercises.OOPs_Interface;

import java.sql.SQLOutput;

public class Interface_Ex implements I1, I2{

    public void Test1(){
        System.out.println("Interface I1 - Test1");
    }

    public void Test5(){
        System.out.println("Interface I1 - Test5");
    }

    public void Test6(){
        System.out.println("Interface I2 - Test6");
    }

    public static void main(String [] args){

        Interface_Ex a = new Interface_Ex();
        a.Test1();
        a.Test5();
        a.Test6();
        a.Test4();
        I2.Test7(); // Static method of Interface


        //Can not create object of Interfaces
       // I1 i = new I1(); //'I1' is abstract; cannot be instantiated

    }

}

interface I1{
    public void Test1(); // Modifier 'public' is redundant for interface members

    //private void Test2(); //Private methods in interfaces should have a body
   // protected  void Test3(); //Modifier 'protected' not allowed here

    default void Test4(){
        System.out.println("We can create concrete or complete methods in interface using default ");
    }

    void Test5();
}

interface I2{

    //Constructor Not allowed in interface
    /*    I2(){

    }*/

    static void Test7() {
        System.out.println("We can create concrete or complete methods in interface using static ");
    }

    void Test6();
}
