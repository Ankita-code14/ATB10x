package ATB10x_CoreJava_Programs.String_Prog;

public class StringReverse_Recursion {

    // Recursive method to reverse a string
    static String reverse(String str) {
        // Base case: If string is empty or has only one character
        if (str.isEmpty()) {
            return str;
        }
        // Recursive call: Remove first character and call function on the rest of the string
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String input = "Hello";
        String reversed = reverse(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}
