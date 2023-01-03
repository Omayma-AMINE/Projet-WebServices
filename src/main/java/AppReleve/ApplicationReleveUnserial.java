package AppReleve;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class ApplicationReleveUnserial {
    public static void main(String[] args) throws Exception {
        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        Releve releve = (Releve)unmarshaller.unmarshal(new File("releve.XML"));
        System.out.println("Relevé Bancaire du compte :"+releve.getRIB());
        System.out.println("Date Relevé :"+releve.getDateReleve());
        System.out.println("Solde : "+releve.getSolde());
        System.out.println("Du "+releve.getOperations().getDateDebut()+" au "+releve.getOperations().getDateFin());
        for (Operation op:releve.getOperations().getOperation()) {
            System.out.println(op.toString());
        }
    }
}
