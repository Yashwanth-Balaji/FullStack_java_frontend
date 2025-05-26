import java.util.*;
public class Divison {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int res=0;
        int div1 = sc.nextInt();
        int div2 = sc.nextInt();
        try{
            res = div1/div2;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(res);

        sc.close();
    }
}