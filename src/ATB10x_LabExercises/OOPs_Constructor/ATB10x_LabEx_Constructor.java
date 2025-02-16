package ATB10x_LabExercises.OOPs_Constructor;

public class ATB10x_LabEx_Constructor {

    public static void main(String[] args) {

        Baby b1 = new Baby(); //constructor called
        Baby b2;  //constructor will not call as only object reference is created
        Baby b3 = new Baby(); //constructor will call each time when object is created

    }

}

class Baby{

    //Default Constructor
    Baby(){
        System.out.println("I am default Constructor, and called on class object creation");
    }

    //Instance Initialization Block
    {
        System.out.println("I am Instance Initialization Block, and also called on class object creation");
        //it will call before constructor

    }

}