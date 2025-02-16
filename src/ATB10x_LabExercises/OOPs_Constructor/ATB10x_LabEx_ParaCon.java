package ATB10x_LabExercises.OOPs_Constructor;

public class ATB10x_LabEx_ParaCon {
    public static void main(String[] args) {

        ATB10x_LabEx_ParaCon_Car tesla = new ATB10x_LabEx_ParaCon_Car();
        System.out.println(tesla.model); //default value called as it is string null will display
        System.out.println(tesla.year); //default value called as it is int 0 will display

        ATB10x_LabEx_ParaCon_Car nano = new ATB10x_LabEx_ParaCon_Car("Nano", 2014);
        System.out.println(nano.model);
        System.out.println(nano.year);

    }
}
