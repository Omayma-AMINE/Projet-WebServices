package AppReleve;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.*;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Releve {
    @XmlAttribute
    private long RIB ;
    private String dateReleve ;
    private double solde;

    private Operations operations;

    public Releve() {
    }

    public Releve(long RIB, String dateReleve, double solde, Operations operations) {
        this.RIB = RIB;
        this.dateReleve = dateReleve;
        this.solde = solde;
        this.operations = operations;
    }

    public long getRIB() {
        return RIB;
    }

    public void setRIB(long RIB) {
        this.RIB = RIB;
    }

    public String getDateReleve() {
        return dateReleve;
    }

    public void setDateReleve(String dateReleve) {
        this.dateReleve = dateReleve;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Operations getOperations() {
        return operations;
    }

    public void setOperations(Operations operations) {
        this.operations = operations;
    }


    @Override
    public String toString() {
        String detailReleve = "Relevé Bancaire \n";
        detailReleve += "RIB : "+getRIB();
        detailReleve += "\nSolde : "+getSolde();
        detailReleve += " \nDate Relevé : "+getDateReleve()+"\n";
        detailReleve += operations.toString();
        return detailReleve ;
    }



    public String afficheReleveCredit(){
        String releveCredit = "Relevé Bancaire \n";
        releveCredit += "RIB : "+getRIB();
        releveCredit += "\nSolde : "+getSolde();
        releveCredit += " \nDate Relevé : "+getDateReleve()+"\n";
        releveCredit += operations.afficheOperationCredit();

        return releveCredit;
    }

}
