package ATB10x_LabExercises.String;

public class ATB10x_LabEx_String {

  public static void main(String[] args) {
    //String Represent :
      //1. Using String Literals (Stored in the String Pool)
      String s1 = "hello";

      //2. Using the new Keyword (Stored in the Heap)
      String s2 = new String("Hello");

      //3. Using a Character Array
      char[] charArrays = {'h', 'e', 'l', 'l', 'o'};
      String s3 = new String(charArrays);

      //4. Using StringBuilder or StringBuffer (Mutable Strings)
      StringBuilder sb = new StringBuilder("hello");
      sb.append(" world"); // Modifies the existing object
      System.out.println(sb);

      //5. Using String.format()
      String name = "John";
      String s5 = String.format("Hello, %s!", name); //Similar to printf, it allows formatted strings.
      System.out.println(s5); // Output: Hello, John!

      //6. Using join() Method (For Joining Strings)
      String s6 = String.join(", ", "Apple", "Banana", "Cherry");
      System.out.println(s6); // Output: Apple, Banana, Cherry

      //7. Using valueOf() Method (Converting Non-String to String)
      int num = 100;
      String s7 = String.valueOf(num); // Converts primitives (int, double, boolean, etc.) or objects to String.
      System.out.println(s7); // Output: "100"

      //8. Using toString() Method
      Integer num1 = 200;
      String s8 = num1.toString(); //Converts an object to a String using its toString() method.
      System.out.println(s8); // Output: "200"


    //String Literal
      String a = "Ankita";
      //String b = a.concat("Shikhare");
      a.concat("Shikhare");
      System.out.println(a);

     // Using the new Keyword
        String c = new String("Rohan");
        c.concat("Shikhare");
      System.out.println(c);


    /*String pool

      Java has a special memory area called the "String Pool" where string literals are stored.
      If you create two strings with the same literal value, Java will point both references to the
      same memory location in the pool rather than creating two separate objects.
      */

      String str1 = "Hello";
      String str2 = "Hello";
      //== Compares memory addresses (references) of two objects.
      //Returns true only if both references point to the same object.
      System.out.println(str1==str2);//true (both refer to the same object in the String Pool)

      String str3 = new String("Hello");
      System.out.println(str1==str3);//false (s3 is a new object in heap)

      //equals() Compares actual content (values) of objects instead of memory addresses.
      System.out.println(s1.equals(s3));// true (same content)


  }

}
