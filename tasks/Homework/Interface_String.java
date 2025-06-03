import java.util.Scanner;
interface Base{
    abstract void getInput();
    abstract void getString();
}

class Derived implements Base{
    @Override
    public void getInput(){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sc.close();
        try{
            if(s == null || s.isEmpty()){
                throw new NullPointerException();
            }
            System.out.println("Input String :"+s);
            System.out.println("Reverse :"+sb.reverse());
        }
        finally{
            System.out.println("Code Executed ");
        }
    }

    @Override
    public void getString(){        
    }
}
public class Interface_String {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.getInput();
        d.getString();
    }
    
}
