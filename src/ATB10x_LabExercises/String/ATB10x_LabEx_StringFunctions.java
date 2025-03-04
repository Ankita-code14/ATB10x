package ATB10x_LabExercises.String;

public class ATB10x_LabEx_StringFunctions {
    public static void main(String[] args){

        //Common String Functions

        String s = "Hello";
        String s1 = "World";
        String s3 = "Hello";
        String s2 = new String("Hello");

        //charAt() - Returns the character at the specified index (position)

        System.out.println("--------------"+"charAt()"+"---------------");
        System.out.println(s.charAt(2));  // o/p - l


        //concat() - Appends a string to the end of another string

        System.out.println("--------------"+"concat()"+"---------------");
        System.out.println(s.concat(s1));  //o/p - HelloWorld


        //contains() - Checks whether a string contains a sequence of characters

        System.out.println("--------------"+"contains()"+"---------------");
        System.out.println(s.contains("llo")); //o/p - true
        System.out.println(s.contains("le"));  //o/p - false

        //contentEquals() - Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer

        System.out.println("--------------"+"contentEquals()"+"---------------");
        System.out.println(s.contentEquals("llo"));  //o/p - false
        System.out.println(s.contentEquals("Hello")); //o/p - true
        System.out.println(s.contentEquals("hello"));  //o/p - false

        //equals() - Compares two strings. Returns true if the strings are equal, and false if not

        System.out.println("--------------"+"equals()"+"---------------");
        System.out.println(s.equals(s3));  //o/p - true
        System.out.println(s.equals(s1));  //o/p - false

        /*Use equals() to compare the content of strings:

        String s = "hello";
        String s3 = "hello";*/

        System.out.println("--------------"+"=="+"---------------");
        /*checks reference equality, not content:

        String s = hello";
        String s2 = new String("hello");
        System.out.println(s == s2);  // false, different references*/

        System.out.println((s==s3));  //o/p - true
        System.out.println((s==s2));  // o/p - false

        //

    }
}
