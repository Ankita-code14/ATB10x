package ATB10x_LabExercises.Collections.List;

import java.util.*;

public class ArrayList_Conversion_Ex {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add(null);
        fruits.add("cherry");
        fruits.add(null);
        fruits.add("apple");

        convertArrayListToSet(fruits);
        convertArrayListToMap(fruits);
    }

    public static void convertArrayListToSet(List<String> fruits){

        Set<String> fruitSet = new HashSet<>(fruits);

        System.out.println(fruitSet);
    }

    public static void convertArrayListToMap(List<String> fruits){

        Map<Integer, String> fruitMap = new HashMap<>();

        for(int i=0; i<fruits.size(); i++){
            fruitMap.put(i, fruits.get(i));
        }

        System.out.println(fruitMap);

    }
}
