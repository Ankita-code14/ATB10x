package ATB10x_CoreJava_Programs.InterviewQues.CodeSnippet;

public class CodeSnippet_PublicisSapient {

    public static void main(String[] gears) {

        //Print output(13245)

        BlueCar car = new BlueCar();



    }
}

abstract class Car {
    static {
        System.out.print("1");
    }
    public Car(String name) {
        //super();
        System.out.print("2");
    }
    {
        System.out.print("3");
    }
}
class BlueCar extends Car {
    {
        System.out.print("4");
    }
    public BlueCar() {
        super("blue");
        System.out.print("5");
    }

}