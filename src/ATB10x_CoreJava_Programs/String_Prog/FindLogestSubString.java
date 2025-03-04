package ATB10x_CoreJava_Programs.String_Prog;

import java.util.HashMap;

public class FindLogestSubString {
    public static void main(String[] args){

        //Longest Substring Without Repeating Characters Using Sliding Window and HashMap in Java

        String str = "ankitashikhare";

        getLongestSubString(str);

    }
    public static void getLongestSubString(String str){

        int start = 0;
        int maxLength = 0;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(int end=0; end<str.length(); end++){
            char currentChar = str.charAt(end);

            if(map.containsKey(currentChar))  //check if currentCharacter is present
            {
                start = Math.max(start, map.get(currentChar)+1);
            }
            map.put(currentChar,end);
            maxLength = Math.max(maxLength, end-start+1);
        }

        System.out.println("MaxLength : "+ maxLength);
        System.out.println("Start : "+ start);
        System.out.println(str.substring(start, start+maxLength));
    }
}
