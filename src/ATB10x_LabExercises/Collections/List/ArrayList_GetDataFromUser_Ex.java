package ATB10x_LabExercises.Collections.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_GetDataFromUser_Ex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List nameList = new ArrayList();

        String countinueInput = "Y";

        while(countinueInput.equalsIgnoreCase("Y")){

            System.out.println("Enter name : ");
            String name = sc.nextLine();
            nameList.add(name);


            System.out.println("Do you want to enter another record? (Y/N)");
            countinueInput = sc.nextLine();

        }

        System.out.println(nameList);

        sc.close();

    }
}
