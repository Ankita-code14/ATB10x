package ATB10x_LabExercises.OOPs_thisKeyword;

public class Son_thisKeyword_Ex extends Father_thisKeyword_Ex{

    Son_thisKeyword_Ex(){
        this("Santram");
        System.out.println("Son class Default Constructor");
        this.testMethod();
    }

    Son_thisKeyword_Ex(String name){
        System.out.println("Son class Parameterized Constructor call using this from default constructor " + name);
    }

    public void testMethod(){
        System.out.println("Child Test method");
    }

    public static void main(String [] args){

        Son_thisKeyword_Ex s = new Son_thisKeyword_Ex();
        s.display("Sandeep", 10, 20);

        Father_thisKeyword_Ex s1 = new Father_thisKeyword_Ex("Rohan");



        //this.testMethod();  //cannot be referenced from a static context

        /*   A static method or, block belongs to the class and these will be loaded into the memory along with the class.
     You can invoke static methods without creating an object. (using the class name as reference).

        Where the "this" keyword in Java is used as a refers to the current class object.
        This implies that to use "this" the method should be invoked by an object, which static methods are not.

                Therefore, you cannot use the "this" keyword from a static method.*/

    }

}
