import java.util.Scanner;
class Loop{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your name");
System.out.println();

String user=sc.nextLine();
for(int i=0;i<5;i++)
System.out.println(user);
}
}