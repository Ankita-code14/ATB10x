package ATB10x_LabExercises.OOPs_Constructor;

public class ATB10x_LabEx_ParaCon_Car {

    String model;
    int year;

    ATB10x_LabEx_ParaCon_Car(){
        System.out.println("Default Constructor");
    }

    ATB10x_LabEx_ParaCon_Car(String model, int year){
        this.model = model; //it will assign the value to class variables
        this.year = year;
        System.out.println("Parameter Constructor");
    }
}
