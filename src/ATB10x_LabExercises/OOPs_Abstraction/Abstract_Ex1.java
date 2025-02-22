package ATB10x_LabExercises.OOPs_Abstraction;

public class Abstract_Ex1 {

    public static void main(String [] args){
        //TestAbstract t = new TestAbstract();
        // we can not create object of abstract class

        TestAbstract_ex t = new TestAbstract_ex();
        t.Test1();
        t.Test2();
        t.Test3();

    }

}

abstract class TestAbstract{

    public void Test1(){
        System.out.println("TestAbstract - Test1");
    }

    public void Test2(){
        System.out.println("TestAbstract - Test2");
    }

    public void Test3(){
        System.out.println("TestAbstract - Test3");
    }

}

class TestAbstract_ex extends  TestAbstract{

}