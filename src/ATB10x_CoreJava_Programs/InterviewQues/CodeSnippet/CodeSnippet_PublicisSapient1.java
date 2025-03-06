package ATB10x_CoreJava_Programs.InterviewQues.CodeSnippet;

public class CodeSnippet_PublicisSapient1 extends ComplexMath {

    public final double secret = 8;

    public static void main(String[] numbers) {
        Math math = new CodeSnippet_PublicisSapient1();
        System.out.print(math.secret);
    }
}
class Math {
    public final double secret = 2;
}
class ComplexMath extends Math {
    public final double secret = 4;
}
