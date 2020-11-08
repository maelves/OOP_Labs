public class CurrentAccount extends Account{

    final double overdraft;

    public CurrentAccount(int number, double newOverdraft) {

        super(number);
        this.overdraft = newOverdraft;

    }

    public double getOverdraft() {
        return overdraft;
    }

    @Override
    public String toString() {
        return super.toString() + " overdraft: " + overdraft;
    }

    @Override
    public void withdraw(double sum) {
        if(super.getBalance() - sum < overdraft)
        {
            System.out.println("Exceeded funds! Check your email!");
        } else {
            super.withdraw(sum);
        }
    }
}
