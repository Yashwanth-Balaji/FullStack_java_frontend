import java.util.*;
class Small{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a[] =new int[5];
		for(int i=0;i<5;i++)
			a[i]=sc.nextInt();
		int min=a[0];
		/*for(int i=0;i<a.length;i++){
			if(min>a[i])
				min=a[i];
		}
		System.out.println(min);*/
		int max;
		for(int i=0;i<5;i++){
			max=a[0];
			if(max<a[i])
				max=a[i];
		}
		System.out.println(max);
		int b[]={10,20,30,40,50};
		for(int i=0;i<5;i++)
			System.out.print(b[i]+" ");
		
	}
}
		