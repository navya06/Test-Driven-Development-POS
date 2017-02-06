/**
 * Created by NavyaKaree on 2/5/17.
 */
public class AccountManagement {
    private String accountNumber;
    private int balance;

    public AccountManagement(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void transferAmount(int transfer) {
        balance = balance - transfer;
    }
}
