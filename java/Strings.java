import java.util.Scanner;
class Strings{
    public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter the String");
        String s=sc.nextLine();
		System.out.println("Enter the Character to find");
		String c=sc.next();
		if(s.contains(c))
		System.out.println("The entered Character found ");
		else
			System.out.println("Not found");
		
		String s1=new String("Good Morning ! ");
		System.out.println(s1+s);*/
		
		String s1=new String("world");
		String s2="world";
		System.out.println(s1.indexOf(s2));
		//System.out.println(s1.subString(2,5));
		String s3="World";
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
		System.out.println(s3==s2);
		System.out.println(s2.compareTo(s3));
		char ch[]=s1.toCharArray();
		for(char c:ch)
			System.out.print(c+" ");
		System.out.println();
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		String a="R V    	yash";
		System.out.println(a.trim());
		System.out.println(s3.replace(W,e));
    }
}