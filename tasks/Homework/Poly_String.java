import java.util.Scanner;
class Base{
    public String s;
    //System.out.println("Enter the string");
    
    void getInput(){
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();
        System.out.println(s);
        sc.close();
    }
    void getString(){
        System.out.println(s);
    }
}

class Derived extends Base{
 public void getString(){
    try{
        if (s == null || s.isEmpty()){
           throw new NullPointerException(); 
        }
        System.out.println("Input String :"+s);
        System.out.println("UpperCase String :"+s.toUpperCase());
    }
    
    catch(Exception e){
        System.out.println(e);
    }
    
    }
}

public class Poly_String{
    public static void main(String[] args) {
        System.out.println("Enter the string:");
        Derived d = new Derived();
        d.getInput();
        d.getString();
    }
}