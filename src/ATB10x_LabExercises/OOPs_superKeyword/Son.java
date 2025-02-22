package ATB10x_LabExercises.OOPs_superKeyword;

public class Son extends Father{

    Son(){
        super(); //Call to 'super()' must be first statement in constructor body
        //You can only call constructor of a parent in child class constructor

        System.out.println("Son Default Constructor");

    }

    public void son_home(){
        System.out.println("Son Home");
        super.home();
        System.out.println(super.gold);
        System.out.println(super.money);
    }
}