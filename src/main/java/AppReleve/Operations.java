package AppReleve;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;

import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
public class Operations {
    @XmlAttribute
    private String dateDebut;
    @XmlAttribute
    private String dateFin;


    private List<Operation> operation = new ArrayList<>();

    public Operations() {
    }

    public Operations(String dateDebut, String dateFin) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;

    }

    public Operations(String dateDebut, String dateFin, List<Operation> operation) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.operation = operation;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public List<Operation> getOperation() {
        return operation;
    }

    public void setOperation(List<Operation> operation) {
        this.operation = operation;
    }

    public double totalDebit (){
        double totalDebit = 0;
        for (Operation op: operation) {
            if (op.getType().equals("Debit"))
                totalDebit = totalDebit+op.getMontant();
        }
        return totalDebit;
    }
    public double totalCredit (){
        double totalCredit = 0;
        for (Operation op: operation) {
            if (op.getType().equals("Credit"))
                totalCredit = totalCredit+op.getMontant();
        }
        return totalCredit;
    }


    @Override
    public String toString() {
        String details = "";
        details += "Listes des opérations du "+getDateDebut()+ " au "+getDateFin()+" : ";
        for (Operation op: operation) {
            details += "\n" +op.toString();
        }
        details += "\nTotal operation credit :" +totalCredit() +"\n" ;
        details += "Total operation debit :" +totalDebit() +"\n" ;
        details += "Total Releve :" +(totalCredit()-totalDebit()) +"\n" ;
        return details;
    }

    public String afficheOperationCredit(){
        String detailCredit = "";
        detailCredit += "Listes des opérations du "+getDateDebut()+ " au "+getDateFin()+" : ";
        for (Operation op: operation) {
            if (op.getType().equals("Credit"))
            detailCredit += "\n" +op.toString();
        }
        detailCredit += "\nTotal operation credit :" +totalCredit() +"\n" ;
        return detailCredit;
    }
}
