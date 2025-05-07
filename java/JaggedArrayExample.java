import java.util.Scanner;
class JaggedArrayExample
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[][]=new int[3][];
int col = 0;
for(int i=0;i<arr.length;i++)
{
System.out.println("enter the column size");
col=sc.nextInt();
arr[i] = new int[col];
System.out.println("enter the values : ");
for(int j=0;j<col;j++)
{
arr[i][j]=sc.nextInt();
}
}
System.out.println("column size  : "+col);
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr[i].length;j++)
{
System.out.print(arr[i][j]);
}
System.out.println();

}
}
}