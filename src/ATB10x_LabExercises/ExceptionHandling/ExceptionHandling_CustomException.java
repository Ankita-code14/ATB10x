package ATB10x_LabExercises.ExceptionHandling;

public class ExceptionHandling_CustomException {

    public static void main(String[] args) {
        Bank sbi = new Bank("INR",100);
        Bank icici = new Bank("INR",123);
        Bank jp_chase = new Bank("USD",101);
//        int result = sbi.add(icici);;
        int result = sbi.add(jp_chase);;
        System.out.println(result);

    }
}
