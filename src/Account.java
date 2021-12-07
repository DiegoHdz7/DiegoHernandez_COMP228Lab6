
public class Account {
    private double balance;

    public Account(){
        balance = 0;
    }
    public synchronized void  withdraw(double amount){
        if(balance>0 && balance>amount)balance-=amount;


    }

    public synchronized void deposit (double amount){
        balance+=amount;

    }

    public double getBalance() {
        return balance;
    }
}
