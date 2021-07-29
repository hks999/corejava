/**
import java.io.*;
public class CheckingAccount {
    private double balance;
    private int number;

    public CheckingAccount(int number) {
        this.number = number;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount <= balance) {
            balance -= amount;
        }else {
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        CheckingAccount aobj = new CheckingAccount();
        aobj.withdraw(5000);
        aobj.deposit(2000);
        aobj.
    }
}
**/