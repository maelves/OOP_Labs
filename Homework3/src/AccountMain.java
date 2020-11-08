public class AccountMain {
    public static void main(String[] args) {

        Account a1 = new Account(234);
        CurrentAccount a2 = new CurrentAccount(235, -100);
        SavingsAccount a3 = new SavingsAccount(236, 1.2);

        a1.print();
        a2.print();
        a3.print();

        Bank bt = new Bank();
        bt.openAccount(a1);
        bt.openCurrentAccount(a2);
        bt.openSavingsAccount(a3);

        a2.deposit(100);
        a2.withdraw(12);
        a3.deposit(200);
        a2.print();
        a3.print();
        bt.changeItems(3.5, 25);
        bt.changeItems(2.89, 250);


    }
}
