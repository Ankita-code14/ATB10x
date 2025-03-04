package ATB10x_LabExercises.Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_Ex {
    public static void main(String[] args){

        ArrayList arrList = new ArrayList();
        arrList.add("Apple");
        arrList.add("orange");
        arrList.add(null);
        arrList.add("Cherry");
        arrList.add(null);

        System.out.println(arrList);
        System.out.println(arrList.size());


        //Iterator - Anchor - go one by one forward - get access them
        //HasNext() - true - if we have a next element
        //next() - element

        Iterator iterator = arrList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
