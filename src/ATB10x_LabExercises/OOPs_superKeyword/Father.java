package ATB10x_LabExercises.OOPs_superKeyword;

public class Father {

    protected int gold = 10;
    public int money = 100;
    // private int gold = 20;
    // private is access within the class itself so through superKeyword it will not call

    Father(){
        System.out.println("Father Default Constructor");
    }

    public  void  home(){
        System.out.println("Father Home");
    }
}
