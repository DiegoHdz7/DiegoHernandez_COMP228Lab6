
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
public class AccountTest {


    public static void main(String [] args){
        Account account1 = new Account();
        Transaction transaction1 = new Transaction("Tr1",account1,100,200);
        Transaction transaction2 = new Transaction("Tr2",account1,50,500);
        Transaction transaction3 = new Transaction("Tr3",account1,0,350);
        Transaction transaction4 = new Transaction("Tr4",account1,600,700);
        Transaction transaction5 = new Transaction("Tr5",account1,200,150);

        ArrayList<Transaction> transactions = new ArrayList<>();
        transactions.add(transaction1);
        transactions.add(transaction2);
        transactions.add(transaction3);
        transactions.add(transaction4);
        transactions.add(transaction5);

        ExecutorService executorService = Executors.newCachedThreadPool();
        for(Transaction transaction : transactions){
            System.out.println("Transaction: " + transaction.getName());
            executorService.execute(transaction);
        }
    }



}
