package ATB10x_CoreJava_Programs.String_Prog;

public class Reverse_String_Diff_Interview_Ques {

    public static void main(String[] args) {

        String str = "My Name is aaa Ankita";

        //Reverse Each Word of String - Using String Buffer/String Builder
        reverseEachWordOfString_WithSB(str);

        //Reverse Each Word of String - Using For Loop
        reverseEachWordOfString_WithFor(str);

        //Reverse String Without Reversing of Words - Using String Builder/String Buffer
        reverseStringWithoutReversingOfWords_WithSB(str);

        //Reverse String Without Reversing of Words - Using For Loop
        reverseStringWithoutReversingOfWords_WithFor(str);

        //Reverse Each Alternate Word of String - Using String Builder/String Buffer
        reverseEachAlternateWordOfString_WithSB(str);

        //Reverse Each Alternate Word of String - Using For Loop
        reverseEachAlternateWordOfString_WithFor(str);

        //Reverse words of String without reversing first Letter
        reverseRestOfTheWordWithoutFirstLetter_WithFor(str);

    }
    public static void reverseEachWordOfString_WithSB(String str){
        StringBuilder revString = new StringBuilder();

        String []strarr = str.split(" ");

        for(String word : strarr) {
            StringBuilder sb = new StringBuilder(word);
            revString.append(sb.reverse().append(" "));
        }
        System.out.println(revString);

    }

    public static void reverseEachWordOfString_WithFor(String str){
        String []strarr = str.split(" ");
        String rev = "";
        for(String word : strarr){
            for(int i=word.length()-1; i>=0; i--){
                rev +=word.charAt(i);
            }
            rev += " ";
        }

        System.out.println(rev);
    }

    public static void reverseStringWithoutReversingOfWords_WithSB(String str){

        StringBuilder revString = new StringBuilder();

        String[] strArray = str.split(" ");

        for(int i=strArray.length-1; i>=0; i--){
            revString.append(strArray[i]).append(" ");
        }

        System.out.println(revString);

    }

    public static void reverseStringWithoutReversingOfWords_WithFor(String str){
        String[] strArray = str.split(" ");

        String revString = "";

        for(int i=strArray.length-1; i>=0; i--){
            revString += strArray[i];
            revString += " ";

        }


        System.out.println(revString);
    }

    public static void reverseEachAlternateWordOfString_WithSB(String str){
        String[] strArray = str.split(" ");

        StringBuilder revString = new StringBuilder();

        for(int i=0; i< strArray.length; i++){
            if(i%2==0){
                revString.append(new StringBuffer(strArray[i]).reverse());
            }else{
                revString.append(strArray[i]);
            }if(i<strArray.length-1){
                revString.append(" ");
            }
        }

        System.out.println(revString);
    }

    public static void reverseEachAlternateWordOfString_WithFor(String str){
        String[] strArray = str.split(" ");

        String revString = "";
        String revWord = "";

        for(int i=0; i<=strArray.length-1; i++){
            if(i%2==0){
                String word = strArray[i];
                for(int j=word.length()-1; j>=0; j--){
                    revWord += word.charAt(j);
                }
                revString += revWord;
                revWord = "";
            }else {
                revString += strArray[i];
            }
            if(i < strArray.length-1){
                revString += " ";
            }
        }

        System.out.println(revString);
    }

    public static void reverseRestOfTheWordWithoutFirstLetter_WithFor(String str){
        String[] strArray = str.split(" ");
        String revString = "";
        String revWord = "";

        for(String word : strArray) {
            char firstLetter = word.charAt(0);
            revWord += firstLetter;
            if (word.length() > 2){
                for (int i = word.length() - 1; i >= 1; i--) {
                    revWord += word.charAt(i);
                }
            revString += revWord + " ";
            revWord = "";
            }
            else{
                revString += revWord + word.charAt(1) + " ";
                revWord = "";
            }
        }

        System.out.println(revString);
    }
}
