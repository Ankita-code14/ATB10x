package ATB10x_LabExercises.OOPs_Polymorphism.MethodOverriding;

public class Son extends Father{

    @Override
    public void home(){
        System.out.println("Son Home");
    }

    private void salary(){
        System.out.println("Son Salary");

        //we can not override private method
    }

}
