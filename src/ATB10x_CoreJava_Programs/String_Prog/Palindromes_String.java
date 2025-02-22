package ATB10x_CoreJava_Programs.String_Prog;

import java.util.Scanner;

public class Palindromes_String {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String to check palindrome : ");
        String str = sc.nextLine();

        Palindromes_String p = new Palindromes_String();
        p.checkStringPalindrome(str);



    }
    public void checkStringPalindrome(String str){

        String revStr = "";
        for(int i=str.length()-1; i>=0; i--){
            revStr = revStr + str.charAt(i);
        }

        System.out.println("Reverse String : "+ revStr);

        if(str.equalsIgnoreCase(revStr))
            System.out.println("given string is Palindrome");
        else
            System.out.println("given string is not Palindrome");


    }

}
