import java.util.Scanner;
public class SingleThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers, 5 in count");
    //     int num1 = sc.nextInt();
    //     int num2 = sc.nextInt();
    //     int num3 = sc.nextInt();
    //     int num4 = sc.nextInt();
    //     int num5 = sc.nextInt();
    //     System.out.println("Inputs are Received");
    //     System.out.println("Calculation of sum of these numbers");
    //     int res = num1+num2+num3+num4+num5;
    //     System.out.println("Result : "+res);

    //     System.out.println("Sum of the Numbers Completed");
    //     if( res % 2 == 0){
    //         Thread.sleep(3000);
    //         System.out.println("Even");
    //     }
    //     else{
    //         System.out.println("Odd");
    //         Thread.sleep(4000);
    //     }
    //    // (res % 2 == 0 )? System.out.println("Even"):System.out.println("Odd");
    //     sc.close();
    int a[] =new int[5];
    for(int i=0;i<a.length;i++){
        a[i] = sc.nextInt();
    }
    int sum = 0;
    for(int i =0;i<a.length;i++)
        sum +=a[i];
    System.out.println(sum);

    System.out.println(sum % 2 == 0? "Even":"Odd");
    sc.close();
    }
}
