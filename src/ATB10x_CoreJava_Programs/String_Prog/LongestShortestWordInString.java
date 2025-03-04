package ATB10x_CoreJava_Programs.String_Prog;

class LongestShortestWordInString {

    public static void main(String[] args){

        String str = "Java is a powerful programming language";

        getLongestShortestWord(str);

    }
    public static void getLongestShortestWord(String str){

        String[] strArray = str.split(" ");

        String longestWord ="", shortestWord =strArray[0];

        for(String word : strArray){
            if(word.length() > longestWord.length()){
                longestWord = word;
            }
            if(word.length() < shortestWord.length()){
                shortestWord = word;
            }
        }

        System.out.println("Logest Word in String is : "+ longestWord);
        System.out.println("Shortest Word in String is : "+shortestWord);
    }

}
