import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

            CreditApplyManager manager = new CreditApplyManager(new TransportCreditManager());
            manager.apply(new Credit(2,100000));

            List<CreditManager>managers = new ArrayList<CreditManager>();
            managers.add(new PersonalFinanceCreditManager());
            managers.add(new TransportCreditManager());
            managers.add(new OfficerCreditManager());

           CreditApplyManager manager2 = new CreditApplyManager(managers) ;
           manager2.preInfoForCredit(new Credit(2,100000));




    }
}
