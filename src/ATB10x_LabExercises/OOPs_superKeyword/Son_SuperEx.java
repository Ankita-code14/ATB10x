package ATB10x_LabExercises.OOPs_superKeyword;

public class Son_SuperEx extends Father_SuperEx {

    public static void main(String [] args){

        //cannot be referenced from a static context

       // super.gold;
       // super.money;
       // super.home();


     /*   A static method or, block belongs to the class and these will be loaded into the memory along with the class.
     You can invoke static methods without creating an object. (using the class name as reference).

        Where the "super" keyword in Java is used as a reference to the object of the superclass.
        This implies that to use "super" the method should be invoked by an object, which static methods are not.

                Therefore, you cannot use the "super" keyword from a static method.*/


        Son_SuperEx s = new Son_SuperEx();
        s.main();
        //If you haven't created constructor but JVM by default create class constructor
        // And call parent class constructor on child class object creation

    }

    public void main(){

       System.out.println(super.gold);
       System.out.println(super.money);
       super.home();
    }

}
