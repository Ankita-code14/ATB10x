package ATB10x_LabExercises.Collections.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Map_Ex3 {
    public static void main(String[] args) {
        Map<String, Object> student1 = new HashMap();
        student1.put("name", "Diwakar");
        student1.put("phone", "9876543210");
        student1.put("address", "Bangalore");
        student1.put("address", 123);


        Set book_read_items = new HashSet();
        book_read_items.add("Rich dad Poor Dad");
        book_read_items.add("Sapaiens");
        book_read_items.add("Secret");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Eat the Frog");
    }
}
