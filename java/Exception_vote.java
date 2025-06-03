import java.lang.Exception;
import java.util.Scanner;
class NotEligible extends Exception{
    public NotEligible(String s){
        super(s);
    }
}
public class Exception_vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age =sc.nextInt();
        try{
            if(age < 18){
                throw new NotEligible("Stupid u are not eligible and u are a chapri");
            }
            else{
                System.out.println("Eliglibe");
            }
        }
            catch(NotEligible e){
                System.out.println(e.getMessage());
            }
            sc.close();
        }
    }