
public class Transaction implements Runnable{
    private final String name;
    Account account;
    double withdraw;
    double deposit;

    public  Transaction (String name, Account account, double withdraw, double deposit){
        this.name = name;
        this.account = account;
        this.withdraw=withdraw;
        this.deposit=deposit;
    }

    public String getName() {
        return name;
    }

    public void run() {
        try{
            System.out.println("Initial Balance: "+account.getBalance()+" "+name);
            account.deposit(deposit);
            System.out.println("Balance after deposit: "+account.getBalance()+" "+name);
            account.getBalance();
            Thread.sleep(50);
            account.withdraw(withdraw);
            System.out.println("Balance after withdraw: "+account.getBalance()+" "+name);
            account.getBalance();
            Thread.sleep(50);


        }
        catch (InterruptedException exception)
        {
            exception.printStackTrace();
            Thread.currentThread().interrupt(); // re-interrupt the thread
        }

    }
}
