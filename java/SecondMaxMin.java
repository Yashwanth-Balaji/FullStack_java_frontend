import java.util.*;
class SecondMaxMin{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		System.out.println("Enter the values");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		Arrays.sort(a);
		System.out.println("The Second Smallest Number is "+a[1]+" and the Second Largest Number is "+a[a.length-2]);
	}
}