public class PersonalFinanceCreditManager implements CreditManager{


    @Override
    public void calculate(Credit credit) {

        credit.setTaxRate(21);

        System.out.println("Personal Finance Credit Repayment Amount for "+credit.getYear()+"years: "+credit.getRepaymentAmount());

    }
}
