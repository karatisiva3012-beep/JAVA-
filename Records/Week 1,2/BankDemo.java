package inheritance;
class Account {
    int accountNumber;
    float balance;
    String accountType;
    void deposit(float amount) {
        balance += amount;
    }
    void withdraw(float amount) {
        if(balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }
}
class SavingsAccount extends Account {
    float interestRate;
    void CalculateInterest() {
        float interest = balance * interestRate / 100;
        balance += interest;
    }
}
class CurrentAccount extends Account {
    float overdraftLimit;

    void withdraw(float amount) {
        if(balance + overdraftLimit >= amount)
            balance -= amount;
        else
            System.out.println("Overdraft Limit Exceeded");
    }
}
public class BankDemo {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount();
        s1.accountNumber = 567786549;
        s1.balance = 20000;
        s1.interestRate = 5;
        s1.deposit(5000);
        s1.withdraw(3000);
        s1.CalculateInterest();
        System.out.println("Savings Account Balance: " + s1.balance);
        CurrentAccount c1 = new CurrentAccount();
        c1.accountNumber = 763629178;
        c1.balance = 15000;
        c1.overdraftLimit = 10000;
        c1.withdraw(20000);
        System.out.println("Current Account Balance: " + c1.balance);
    }
}
