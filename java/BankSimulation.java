class Account {
    private int balance = 0;

    // Synchronized deposit method
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | Balance: " + balance);
    }

    // Synchronized withdraw method
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Balance: " + balance);
        } else {
            System.out.println("Withdrawal of " + amount + " failed | Insufficient balance: " + balance);
        }
    }
}

class DepositThread extends Thread {
    Account account;

    public DepositThread(Account account) {
        this.account = account;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            account.deposit(1000);
            try {
                Thread.sleep(2000); // 2 seconds delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class WithdrawThread extends Thread {
    Account account;

    public WithdrawThread(Account account) {
        this.account = account;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            account.withdraw(500);
            try {
                Thread.sleep(3000); // 3 seconds delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class BankSimulation {
    public static void main(String[] args) {
        Account sharedAccount = new Account();

        DepositThread t1 = new DepositThread(sharedAccount);
        WithdrawThread t2 = new WithdrawThread(sharedAccount);

        t1.start();
        t2.start();
    }
}
