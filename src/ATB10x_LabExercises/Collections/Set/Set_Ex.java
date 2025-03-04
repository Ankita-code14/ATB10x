package ATB10x_LabExercises.Collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Ex {
    public static void main(String[] args) {

        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("Pramod");
        hs.add("Pramod");
        hs.add("pramod");
        hs.add("dramod");
        System.out.println(hs);




    }
}
