public class SavingsAccount extends Account{

    private double interest;

    public SavingsAccount(int number, double newInterest) {
        super(number);
        this.interest = newInterest;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }


    @Override
    public String toString() {
        return super.toString() + " interest: " + interest;
    }

}
