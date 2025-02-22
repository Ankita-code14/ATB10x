package ATB10x_LabExercises.Static_Keyword;

public class staticKeyword_EX {
    public static void main(String[] args) {
        ATB1 a; // just reference is created for class. full class is not loaded
        ATB1 b = new ATB1(); //full class loaded

        ATB1.doAssignment();  // static method
        b.readDocuments();  // non static method
    }

}

class ATB1{
    {
        System.out.println("IIB - this is called when Object is created!");
        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation
        //
    }
    static {
        System.out.println("Load the class?, I will execute");
    }

    private String name; // non static
    private String phone;
    static String courseName = "ATB10x";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    void readDocuments(){
        System.out.println("Non Static Method");
        System.out.println(courseName);
    }

    static void doAssignment(){
        //System.out.println(phone); // Staic method can't access the non static variables
        System.out.println("Do Assignment");
    }



}
