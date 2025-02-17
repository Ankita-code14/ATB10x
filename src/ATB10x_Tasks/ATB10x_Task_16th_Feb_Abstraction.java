package ATB10x_Tasks;

public class ATB10x_Task_16th_Feb_Abstraction {

    public static void main(String [] args){
        PrintMyBook p = new PrintMyBook();
        p.getDetails("Harry Potter", "J.k. Rowling", "120");
    }

}

abstract class Book{

    abstract void getDetails(String name, String author, String price);

}

class PrintMyBook extends Book{

    @Override
    void getDetails(String name, String author, String price) {
        System.out.println(name + ", "+ author +", "+ price);
    }
}