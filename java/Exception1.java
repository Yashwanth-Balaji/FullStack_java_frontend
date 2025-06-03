import java.lang.*;
class MyException extends Exception{
    public MyException(String s){
        super(s);
    }
}
public class  Exception1 {
    public static void main(String[] args) {
        try{
            throw new MyException("New Exception");
        }
        catch(MyException e){
            System.out.println("Caught");
            System.out.println(e.getMessage());
        }
    }
}
