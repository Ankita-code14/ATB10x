package ATB10x_LabExercises.OOPs_ClassAndObject;

public class ATB10x_LabEx_ClassAndObject {

    public static void main(String[] args) {

        ATB10x_Student student = new ATB10x_Student();

        // ATB10x_Student - will load the class the memory
        // student - is reference for the object created
        // new ATB10x_Student() - it will create the object of that class

        student.SudentName = "Ankita";
        student.Salary = 10;
        student.Company = "Morgan Stanely";

        student.display("Ankita", "Morgan Stanely", 10);


        ATB10x_Student student1 = null; // only object reference is created of that class
        //student 1 object pointing to null area in jvm

        new ATB10x_Student(); // class object is created but don't have reference

        student1.display("Rohan", "PWC", 10); // Method invocation 'display' will produce 'NullPointerException'





    }
}

