package ATB10x_LabExercises.OOPs_thisKeyword;

public class Father_thisKeyword_Ex {

    public String name;
    private int salary;
    protected int saving;

    Father_thisKeyword_Ex(){
        System.out.println("Father Class Default Constructor");
    }

    Father_thisKeyword_Ex(String name){
        this();  // Call to 'this()' must be first statement in constructor body
        System.out.println(name);

    }

    void display(String name_f, int salary_f, int saving_f){
        this.name = name_f;
        this.salary = salary_f;
        this.saving = saving_f;

        System.out.println(this.name +" " + this.salary+" "  + this.saving);
    }

}
