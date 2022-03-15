import java.util.List;

public class CreditApplyManager {

    private CreditManager creditManager;
    private List<CreditManager>creditManagers;

    public CreditApplyManager(CreditManager creditManager) {
        this.creditManager = creditManager;
    }

    public CreditApplyManager(List<CreditManager> creditManagers) {
        this.creditManagers = creditManagers;
    }

    public void apply(Credit credit){

        this.creditManager.calculate(credit);
    }

    public void preInfoForCredit(Credit credit){

        if(this.creditManagers.size()==0) System.out.println("Please select a Credit Manager");

        else {
        for (CreditManager i : creditManagers){

            i.calculate(credit);
        }}

    }
}
