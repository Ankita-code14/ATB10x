package ATB10x_CoreJava_Programs.String_Prog;

import java.util.HashMap;

public class NoOfOccurenceOfCharInString {

    public static void main(String[] args){

        String str = "ankita is an automation developer";

        getOccurenceOfEachCharInString(str);

        replaceEachCharByNoOfTimeItOccurces(str);

        getCharOuccrenceNthTimeInString(str);

        printCharactersOccurOnlyOnce(str);

    }

    public static void getOccurenceOfEachCharInString(String str){

        char[] strArray = str.toCharArray();

        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();

        for(char c : strArray){
            if(charMap.containsKey(c)){
                charMap.put(c, charMap.get(c)+1);
            }else
                charMap.put(c,1);
        }

        System.out.println(charMap);

    }

    public static void getCharOuccrenceNthTimeInString(String str){

        char[] strArray = str.toCharArray();

        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();

        for(char c: strArray){
            if(charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c)+1);
            }else
                charMap.put(c, 1);
        }

        System.out.println(charMap);

        //print characters which count is  1
        for(char c: charMap.keySet()){
            if(charMap.get(c) <= 1){
                System.out.println("Character: " + c + ", Count: " + charMap.get(c));
            }
        }
    }

    public static void replaceEachCharByNoOfTimeItOccurces(String str){

        char[] strArray = str.toCharArray();
        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();

        StringBuilder result = new StringBuilder();

        for(char c : strArray){
           // charMap.put(c, charMap.getOrDefault(c,0)+1);
            if(charMap.containsKey(c)){
                charMap.put(c, charMap.get(c)+1);
            }else
                charMap.put(c,1);
        }

        System.out.println(charMap);

        for(char c : strArray){
            result.append(charMap.get(c));
        }

        System.out.println(result.toString());


    }

    public static void printCharactersOccurOnlyOnce(String str){

        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();

        for(char c : str.toCharArray()){
            if(charMap.containsKey(c)){
                charMap.put(c, charMap.get(c)+1);
            }else
                charMap.put(c, 1);
        }

        System.out.println("Characters occurs only once : ");
        for(char c : str.toCharArray()){
            if(charMap.get(c) == 1){
                System.out.print(c + " ");
            }
        }
    }


}
