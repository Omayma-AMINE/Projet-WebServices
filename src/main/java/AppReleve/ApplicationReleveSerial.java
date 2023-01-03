package AppReleve;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ApplicationReleveSerial {
    public static void main(String[] args) throws Exception{
        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);

        Operation op1 = new Operation("Credit","2021-01-01",9000,"Vers Espèce");
        Operation op2 = new Operation("Debit","2021-01-11",3400,"Chèque Guichet");


        Operations operations = new Operations("2021-01-01","2021-01-30");
        operations.getOperation().add(op1);
        operations.getOperation().add(op2);
        operations.getOperation().add(new Operation("Debit","2021-01-15",120, "Prélèvement Assurance"));
        operations.getOperation().add(new Operation("Credit", "2021-01-25", 70000, "Virement"));

        Releve releve = new Releve(53637,"2021-11-10",14500,operations);
        System.out.println(releve.toString());
        System.out.println("*************************************************");
        System.out.println(releve.afficheReleveCredit());



        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(releve,new File("releve.xml"));
    }
}
