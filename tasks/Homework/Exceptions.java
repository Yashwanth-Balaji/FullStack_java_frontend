import java.util.Scanner;
public class Exceptions {
    void div(String s){
        try{
        System.out.println(s.length());
        System.out.println("Exception not occured");
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Exception not occured 1111");
    }
    void div(String a,String b){
        try{
            String c=a+b;
            System.out.println(c.length());
            System.out.println("Exception not occured");
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Exception not occured 34567");

    }
    //System.out.println("Exception handled");
}
class Res{
    public static void main(String[] args) {
        Exceptions ex = new Exceptions();
        ex.div(null);
        ex.div("hello","world");
    }
}
