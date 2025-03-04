package ATB10x_CoreJava_Programs.Array_Prog;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

    public static void main(String [] args){

        int arr[] = {1,4,6,7,9,4,6};

        //Remove Duplicate Using Set
        System.out.println(removeDuplicatesUsingSet(arr));

        //Remove Duplicate Using Set - again convert Set to Array
        int uniqueArr[] = removeDuplicatesUsingSet1(arr);
        System.out.println(Arrays.toString(uniqueArr));

        //Remove Duplicate Without Using Set
        int uniqueArr1[] = removeDuplicatesWithoutSet(arr);
        System.out.println(Arrays.toString(uniqueArr1));



    }

    public static Set<Integer> removeDuplicatesUsingSet(int[] arr){

        Set<Integer> arrSet = new HashSet<>();
        for(int num : arr){
            arrSet.add(num);  //add array elements to set
        }

        /*//Convert Set to Array back
        int [] uniqueArray = new int [arrSet.size()];
        int i = 0;
        for(int num1 : arrSet){
            uniqueArray[i++] = num1;
        }*/

        return arrSet;
    }

    public static int[] removeDuplicatesUsingSet1(int[] arr){

        Set<Integer> arrSet = new HashSet<>();
        for(int num : arr){
            arrSet.add(num);  //add array elements to set
        }

        //Convert Set to Array back
        int [] uniqueArray = new int [arrSet.size()];
        int i = 0;
        for(int num1 : arrSet){
            uniqueArray[i++] = num1;
        }

        return uniqueArray;
    }

    public static int[] removeDuplicatesWithoutSet(int[] arr){

        //1. Sort array
        Arrays.sort(arr);

        //{1,4,6,7,9,4,6};
        //1,4,4,6,6,7,9

        //use temp array to store unique elements
        int[] tempArr = new int[arr.length];
        int j = 0;

        for(int i =0; i<arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                tempArr[j++] = arr[i];
            }
        }

        //to add last element
        tempArr[j++] = arr[arr.length-1];  //O/p of this will be [1, 4, 6, 7, 9, 0, 0]

        //Create new array with exact length
        int[] uniqueArr = Arrays.copyOf(tempArr, j);

        return uniqueArr;
    }
}
