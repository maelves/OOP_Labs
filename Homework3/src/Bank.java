import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void openAccount(Account acc) {
        accounts.add(acc);
    }
    public void openSavingsAccount(SavingsAccount save) {
        accounts.add(save);
    }
    public void openCurrentAccount(CurrentAccount current) {
        accounts.add(current);
    }

    public void closeAccount(Account acc) {
        accounts.remove(acc);
    }
    public void closeSavingsAccount(SavingsAccount save) {
        accounts.remove(save);
    }
    public void closeCurrentAccount(CurrentAccount current) {
        accounts.remove(current);
    }

    public void changeItems(double i, double sum) {
        for (Account ac : accounts) {
            if(ac instanceof SavingsAccount) {
                ((SavingsAccount) ac).setInterest(i);
                ac.print();
            }
            else if (ac instanceof CurrentAccount) {
                ac.withdraw(sum);
                ac.print();
            }
        }
    }

}
