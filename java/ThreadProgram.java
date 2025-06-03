/*import java.util.Scanner;
class Operations extends Thread{
    public void run(){
        if(Thread.currentThread().getName().equals("add")){
            add();
        }
        else if(Thread.currentThread().getName().equals("print")){
            print();
        }
        else{
            Bank();
        }
    }
    public void add(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Task1 Addition Operation started");
        System.out.println("Enter 2 Numbers to add ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int res = n1 + n2;
        System.out.println("Sum : "+res);
        System.out.println("Task1 Completed");
    }

    public void print() {
        System.out.println("Task2 print Operation starts");
        for(int i =0;i<=5;i++){
            System.out.println(":Pooji is second sem topper");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.println("Task2 Completed");
    }
    public void Bank(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Task3 Bank Operations Started");
        System.out.println("Enter the account number and pin");
        int acc = sc.nextInt();
        int pin = sc.nextInt();
        System.out.println("Your Details are Collected successfully");
        System.out.println("Task3 Completed");
    }
}
public class ThreadProgram {
    public static void main(String[] args) {
        Operations t1 = new Operations();
        Operations t2 = new Operations();
        Operations t3 = new Operations();

        // Thread t1 = new Thread(o1);
        // Thread t2 = new Thread(o2);
        // Thread t3 = new Thread(o3);


        t1.setName("add");
        t2.setName("print");
        t3.setName("Bank");

        t1.start();
        t2.start();
        t3.start();
    }
    
}*/

import java.util.Scanner;

class Operations implements Runnable {
    public void run() {
        String taskName = Thread.currentThread().getName();
        if (taskName.equals("add")) {
            add();
        } else if (taskName.equals("print")) {
            print();
        } else {
            bank();
        }
    }

    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Task1: Addition Operation started");
        System.out.println("Enter 2 Numbers to add: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int res = n1 + n2;
        System.out.println("Sum: " + res);
        System.out.println("Task1 Completed");
    }

    public void print() {
        System.out.println("Task2: Print Operation started");
        for (int i = 0; i <= 5; i++) {
            System.out.println("Pooji is second sem topper");
            try {
                Thread.sleep(1000);  // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e);
            }
        }
        System.out.println("Task2 Completed");
    }

    public void bank() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Task3: Bank Operation started");
        System.out.println("Enter the account number and pin:");
        int acc = sc.nextInt();
        int pin = sc.nextInt();
        System.out.println("Your details are collected successfully");
        System.out.println("Task3 Completed");
    }
}

public class ThreadProgram {
    public static void main(String[] args) {
        Operations op1 = new Operations();
        Operations op2 = new Operations();
        Operations op3 = new Operations();

        Thread t1 = new Thread(op1);
        Thread t2 = new Thread(op2);
        Thread t3 = new Thread(op3);

        t1.setName("add");
        t2.setName("print");
        t3.setName("Bank");

        t1.start();
        t2.start();
        t3.start();
    }
}

