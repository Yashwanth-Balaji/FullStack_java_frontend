class Arithmetic{
	public final static void main(String[] args){
		System.out.println(add(5,10));
		System.out.println(sub(15,10));
		mul(5,10);
		divide_mod(50,10);
		System.out.println(args[0]);
		System.out.println(args[1]);
}
public static int add(int num1,int num2){
		return num1+num2;
}
public static int sub(int num1,int num2){
		return num1-num2;
}
public static void mul(int num1,int num2){
		System.out.println(num1*num2);
}

public static void divide_mod(int num1,int num2){
		System.out.println(num1/num2);
		System.out.println(num1%num2);
}
}