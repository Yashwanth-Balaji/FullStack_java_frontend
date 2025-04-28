import java.util.Scanner;
class Even{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit to print the even numbers");
		int lim=sc.nextInt();
		for(int i=0;i<=lim;i++){
			if(i%2==0)
				System.out.print(i+" ");
			}
		}
}