package ATB10x_CoreJava_Programs.InterviewQues;

public class Bank {

    private Integer amt = 50000;

    public void getAccBalance(){
        System.out.println(amt);
    }

    public Integer creditAmt(Integer amount){
        amt = amt + amount;
        return amt;
    }

    public Integer debitAmt(Integer amount){
        if(amount<=amt){
            amt = amt-amount;
            return amt;
        }else {
            try {
                throw new CustomException("Enter amount is greater than Account Balance, Can't Proceed");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        return 0;
    }
}

class CustomException extends Exception{
    CustomException(String msg){
        super(msg);
    }
}
