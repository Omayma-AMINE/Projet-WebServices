
import AppReleve.Operation;
import AppReleve.Operations;
import proxy.ListOperations;
import proxy.Releve;
import proxy.ReleveWS;
import proxy.ReleveWSService;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        ReleveWS stub = new ReleveWSService().getReleveWSPort();
        Releve r = stub.getReleve();
        System.out.println(r.getRib());
        System.out.println(r.getSolde());
        System.out.println(r.getDateReleve());

        List<proxy.Operation> ops = stub.listOperations();
        for ( proxy.Operation op :ops) {
            System.out.println("Operation : [ "+op.getType()+" , "+op.getDate()+ " , "+op.getMontant()+" , "+op.getDescription()+" ]");

        }



    }
}
