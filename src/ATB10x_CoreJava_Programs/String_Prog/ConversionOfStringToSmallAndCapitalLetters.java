package ATB10x_CoreJava_Programs.String_Prog;

public class ConversionOfStringToSmallAndCapitalLetters {
    public static void main(String[] args){

        String str = "Java is a powerful programming language";

        printStringToSmallAndCapitalLetters(str);

        printStringFirstLetterCapitalAndRestSmall(str);

    }
    public static void printStringToSmallAndCapitalLetters(String str){
        System.out.println(str.toLowerCase());

        System.out.println(str.toUpperCase());
    }

    public static void printStringFirstLetterCapitalAndRestSmall(String str){

        String[] words = str.split(" ");

        StringBuilder capString = new StringBuilder();

        for(String word : words){
            capString.append(word.substring(0, 1).toUpperCase())
                    .append(word.substring(1).toLowerCase())
                    .append(" ");


        }

        System.out.println(capString);
    }
}
