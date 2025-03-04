package ATB10x_CoreJava_Programs.String_Prog;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string to reverse");
        String str = sc.nextLine();

        Reverse_String s = new Reverse_String();

        System.out.println("-----------------"+ "Reverse String Using For Loop");

        s.reverseStringUsingFor(str);

        System.out.println("-----------------"+ "Reverse String Using String Buffer");

        s.reverseStringUsingStringBuffer(str);

        System.out.println("-----------------"+ "Reverse String Using String Builder");

        s.reverseStringUsingStringBuilder(str);

    }
    public void reverseStringUsingFor(String str){
       String revStr = "";

       if(str.isEmpty()){
           System.out.println("Entered String is empty");

       }
       else {
           for (int i = str.length() - 1; i >= 0; i--) {
               revStr = revStr + str.charAt(i);
           }
       }
       System.out.println(revStr);

    }

    public void reverseStringUsingStringBuffer(String str) {
        //StringBuffer is thread-safe.(slow)

        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

    }

    public void reverseStringUsingStringBuilder(String str){
        //StringBuilder is not thread-safe(Fast)

        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}
