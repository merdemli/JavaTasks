public class OfficerCreditManager implements CreditManager{


    @Override
    public void calculate(Credit credit) {

        credit.setTaxRate(20);

        System.out.println("Officer Credit Repayment Amount for "+credit.getYear()+"years: "+credit.getRepaymentAmount());
    }
}
