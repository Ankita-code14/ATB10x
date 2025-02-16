package ATB10x_LabExercises.OOps_Inheritance.Multilevel_Inheritance;

public class Multilevel_Inheritance {
    public static void main(String[] args) {

        GrandFather gf = new GrandFather();
        Father f = new Father();
        Son s = new Son();

        s.home();

        /*
        Below is example of Preference

        1. s.home() - will call Son class home method
        2. if son class method is not available (s.home())- it will call Father class home method
        3. if son and father class method is not available (s.home()) - it will call GrandFather class home method
        */


        //Dynamic Dispatch

        GrandFather f1 = new Father();
        GrandFather s1 = new Son();

        Father s2 = new Son();

        //Son gf1 = new GrandFather(); //this will not allow
        //Son f2 = new Father();
        //Father gf2 = new GrandFather();

    }
}
