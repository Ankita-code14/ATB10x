package ATB10x_CoreJava_Programs.String_Prog;

public class PrintSumOfDigitsInGivenString {
    public static void main(String[] args){

        String str = "asgf4kjh678kh5f";

        printSumOfDigitsInGivenString(str);
    }

    public static void printSumOfDigitsInGivenString(String str){
        char[] strArray = str.toCharArray();

        int sum = 0;
        int num =0;

        for(char c : strArray){
            if(Character.isDigit(c)){
                num = num * 10 + (c - '0');
                System.out.println(num);
            }else{
                sum += num;
                num = 0;
            }
        }
        sum += num;

        System.out.println("Sum of numbers: " + sum);
    }
}
