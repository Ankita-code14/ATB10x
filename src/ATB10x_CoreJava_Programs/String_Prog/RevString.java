package ATB10x_CoreJava_Programs.String_Prog;

public class RevString {

    public static void main(String[] args) {

        String str = "My Name is Ankita";

        String []strarr = str.split(" ");

        for(String word : strarr) {
            StringBuffer sb = new StringBuffer(word);
            System.out.print(sb.reverse().append(" "));
        }

        System.out.println("----------------");

        String rev = "";
        for(String word : strarr){
            for(int i=word.length()-1; i>=0; i--){
                rev +=word.charAt(i);
            }
            rev += " ";
        }

        System.out.println(rev);
    }


}
