package AppReleveWS;

import AppReleve.Operation;
import AppReleve.Operations;
import AppReleve.Releve;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class ReleveWS {

    public List<Operation> ListOperations(){
        return List.of(
             new Operation("Credit","2021-01-01",9000,"Vers Espèce"),
             new Operation("Debit","2021-01-11",3400,"Chèque Guichet"),
             new Operation("Debit","2021-01-15",120, "Prélèvement Assurance"),
             new Operation("Credit", "2021-01-25", 70000, "Virement")
        );
    }

    public Releve getReleve(){
        Operations opers = new Operations("2021-01-01","2021-01-30",ListOperations());
        return new Releve(53637,"2021-11-10",14500,opers);
    }

}
