package ATB10x_CoreJava_Programs.InterviewQues.Exceptions;

public class BankCreditDebitMethodCustomException extends Bank {

    public static void main(String[] args){
        // write a java code scenario : you have 50000 amount in your bank account, implement credit and debit amount methods
        // and if the debit amount is more throw an user defined exception

        Bank b = new Bank();
        b.getAccBalance();

        System.out.println(b.creditAmt(100));

        System.out.println(b.debitAmt(100));

        System.out.println(b.debitAmt(1000));

        b.getAccBalance();

        System.out.println(b.debitAmt(49001));
    }
}
