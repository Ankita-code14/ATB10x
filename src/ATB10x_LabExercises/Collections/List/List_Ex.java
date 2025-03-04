package ATB10x_LabExercises.Collections.List;

import java.util.ArrayList;
import java.util.List;

public class List_Ex {
    public static void main(String[] args){

        List fruits = List.of("orange", "apple", "banana", "mango");
        //of is static function in List interface
        //Functions which are static and default are fully implemented in interface

       fruits.add("cheery"); //UnsupportedOperationException becz add and remove is not fully implemented function
       fruits.remove("apple");



    }
}
