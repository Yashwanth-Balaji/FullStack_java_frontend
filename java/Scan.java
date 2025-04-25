import java.util.Scanner;
class Scan{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Addition " +(num1+num2));
		System.out.println("Difference " +(num1-num2));
		System.out.println("Product " +(num1*num2));
		System.out.println("Division  " +(num1/num2));
		System.out.println("Remanider " +(num1%num2));
	}
}