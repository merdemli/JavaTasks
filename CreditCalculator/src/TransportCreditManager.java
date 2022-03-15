public class TransportCreditManager implements CreditManager{
    @Override
    public void calculate(Credit credit) {
        credit.setTaxRate(18);
        System.out.println("Transport Credit Repayment Amount for "+credit.getYear()+"years: "+credit.getRepaymentAmount());

    }
}
