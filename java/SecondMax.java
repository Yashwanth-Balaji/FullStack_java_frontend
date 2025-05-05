class SecondMax{
	public static void main(String args[]){
		int a[]={1,34,5,3,12,51,45};
		int max=a[0];
		int Smax=0;
		for(int i=0;i<a.length;i++){
			if(max<a[i])
				max=a[i];
		}
		System.out.println(max);
		
		for(int i=0;i<a.length;i++){
			if(max>a[i] && Smax<a[i])
				Smax=a[i];
		}
		System.out.println(Smax);
		
	}
}