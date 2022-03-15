public class Credit {


    private int year;
    private double amount;
    private int taxRate;
    private double repaymentAmount;

    public Credit() {
    }

    public Credit( int year, double amount) {
        this.year = year;
        this.amount = amount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(int taxRate) {
        this.taxRate = taxRate;
    }

    public double getRepaymentAmount() {
        return (amount+(amount*taxRate/100)*year);
    }
}
