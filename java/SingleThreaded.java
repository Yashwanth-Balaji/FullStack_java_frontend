import java.util.Scanner;
public class SingleThreaded {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Task 1 Addition Operation Started");
        System.out.println("Enter the value of num1");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2 values");
        int num2 = sc.nextInt();
        int res= num1+num2;
        System.out.println("Result: "+res);
        System.out.println("Task1 Addition operation completed");
        System.out.println("Task 2 Printing Numbers Started");
        for(int i=1;i<=5;i++){
            System.out.println("Gtec - Jainx");
            Thread.sleep(2000);
        }
        System.out.println("Task2 Printing the Numbers Completed");
        System.out.println("Task 3 Banking operation started");
        System.out.println("Enter ur account Number");
        int acc = sc.nextInt();
        System.out.println("Enter ur pin");
        int password = sc.nextInt();
        System.out.println("Your details are being recorded");
 
        sc.close();

        /*
        import java.util.Scanner;

public class SingleThreaded {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        sop("Task1 Addition operation Started");
        sop("Enter The first Number");
        int num1 = sc.nextInt();
        sop("Enter The Second Number");
        int num2 = sc.nextInt();
        int result = num1 + num2;
        sop("result = " + result);
        sop("Task1 Addition operation Completed");
        sop("Task2 printing operation Started");

        for (int i = 0; i <= 5; i++) {
            sop("G-tech Jainx");
            Thread.sleep(2000);
        }
        sop("Task2 printing operation Completed");
        sop("Task3 Banking operation Started");
        sop("Enter Acc No");
        int acc_no = sc.nextInt();
        sop("Enter the PIN");
        int pswd = sc.nextInt();
        sop("Account details recorded");
        sop("Task3 Banking operation Completed");
    }

    public static void sop(String str) {
        System.out.println(str);
    }
}
         */
    }
}
