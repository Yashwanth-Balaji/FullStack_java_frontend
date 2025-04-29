import java.util.*;
class SmallestNum{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter the values in the array which is of 5 in size");
		for(int i=0;i<5;i++)
			a[i]=sc.nextInt();
		Arrays.sort(a);
		/*for(int i=0;i<5;i++)
			System.out.println(a[i]);*/
		System.out.println(a[0]);
	}
}
		
		