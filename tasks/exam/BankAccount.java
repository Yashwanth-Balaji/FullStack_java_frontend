import java.util.Scanner;
class InsufficientFundsException extends Exception{
    InsufficientFundsException(String s){
        super(s);
    }
}
class BankAccount{
    public static void account(long accountNumber, String accountHolderName, double balance){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Account Number :");
        accountNumber = sc.nextLong();
        System.out.println("Enter the Holder name :");
        accountHolderName = sc.nextLine();
        System.out.println("Enter ur balance");
        balance = sc.nextDouble();
    }
    public static void main(String args[]){
        //Scanner sc = new Scanner(System.in);
        

    }
}