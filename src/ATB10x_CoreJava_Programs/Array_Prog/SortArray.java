package ATB10x_CoreJava_Programs.Array_Prog;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortArray {

    public static void main(String []args){

        //int [] arr = getArrayElementsFromUser();

        Integer[] arr = {1,3,8,9,6,4,2};

        //sort Array using Arrays class
        sortArrayUsingArraysClass(arr);

        //sort Array without using sort function
        sortArrayWithoutUsingSortFunction(arr);

        //sort Array with ArrayList
        sortArrayWithArrayList(arr);

        //Find nth element of array
        getNthLargestElementOfArray(arr);
    }

    public static int[] getArrayElementsFromUser(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array length");
        int length = sc.nextInt();
        int [] arr = new int[length];

        System.out.println("Enter " + length+ " elements of array : ");
        for(int i=0; i<length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Entered Array : ");
        for(int i =0; i<length; i++){
            System.out.println(arr[i]);
        }

        return arr;
    }

    public static void sortArrayUsingArraysClass(Integer[] arr){

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void sortArrayWithoutUsingSortFunction(Integer[] arr){

        int temp ;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        /*for(int i=0; i<arr.length;i++) {
            System.out.print(" "+ arr[i]);
        }*/

        System.out.println(Arrays.toString(arr));

    }

    public static void sortArrayWithArrayList(Integer[] arr){
        List<Integer> arrList = Arrays.asList(arr);
        Collections.sort(arrList);
        System.out.println(arrList);

        Collections.sort(arrList, Collections.reverseOrder());
        System.out.println(arrList);

    }

    public static void getNthLargestElementOfArray(Integer[] arr){

        System.out.println("Enter nth num you want from array : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(arr.length < num) {
            System.out.println("Array size is less than give num "+ num);
        }else{
            int nthElement = arr[arr.length-num];
            System.out.println("Arrys "+ num+ " largest element is :"+ nthElement);
        }
    }


}
