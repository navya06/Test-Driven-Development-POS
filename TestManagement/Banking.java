import org.junit.Assert;
import org.junit.Test;

/**
 * Created by NavyaKaree on 2/5/17.
 */
public class Banking {

    AccountManagement accountManagement;

    @Test
    public void shouldReturnAccountNumber(){
        String accountNumber= "12345";
        accountManagement = new AccountManagement(accountNumber, 0);
        String accountNumberActual = accountManagement.getAccountNumber();
        Assert.assertEquals(accountNumber, accountNumberActual);
    }

    @Test
    public void shouldCheckBalance(){
        int balance = 548;
        String accountNumber = "12348";
        accountManagement = new AccountManagement(accountNumber, balance);
        int balanceActual = accountManagement.getBalance();
        Assert.assertEquals(balance, balanceActual);
    }

    @Test
    public void shouldCheckTransactionAmount(){
        int transfer = 50;
        int balance = 508;
        String accountNumber = "12348";
        accountManagement = new AccountManagement(accountNumber, balance);
        accountManagement.transferAmount(transfer);
        int currentBalance = accountManagement.getBalance();
        int transferActual = balance - currentBalance;
        Assert.assertEquals(transfer, transferActual);
    }


}
