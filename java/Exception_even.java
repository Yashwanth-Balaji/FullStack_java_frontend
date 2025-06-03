import java.util.Scanner;
class EvenOdd extends Exception{
    EvenOdd(String s){
        super(s);
    }
}
public class Exception_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        try{
            if(num % 2 == 0){
                throw new EvenOdd("This is Even Number Exception");
            }
            else
                throw new EvenOdd("This is Odd Number Exception");
        }
        catch(EvenOdd e){
            System.out.println(e.getMessage());
        }
    }
}
