package ATB10x_LabExercises.OOPs_Abstraction;

public class Abstract_Ex {

    public static void main(String [] args){
        Son s = new Son();
        s.loan25();
        s.lon50();
        Father.loan40();

       // Father f = new Father() ; // 'Father' is abstract; cannot be instantiated
        //Can not create abstract class object

    }

}

abstract class Father{

    Father(){
        //you can have constructor in abstract class but as we can not create object of abstract class it is useless
        //but we can call this constructor through the another class which extends abstract class
        System.out.println("Abstract class constructor ");
    }
    abstract void lon50();

    public void loan25(){
        System.out.println("Father 25 loan");
    }

    public static void loan40(){
        System.out.println("Static method of abstract class");
    }

}

class Son extends Father{

    @Override
    void lon50() {
        System.out.println("Father 50 loan - Son");
    }
}
