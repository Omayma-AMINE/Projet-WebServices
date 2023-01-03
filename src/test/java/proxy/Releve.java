
package proxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour releve complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="releve">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="dateReleve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="solde" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="operations" type="{http://AppReleveWS/}operations" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="rib" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "releve", propOrder = {
    "dateReleve",
    "solde",
    "operations"
})
public class Releve {

    protected String dateReleve;
    protected double solde;
    protected Operations operations;
    @XmlAttribute(name = "rib", required = true)
    protected long rib;

    /**
     * Obtient la valeur de la propri�t� dateReleve.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateReleve() {
        return dateReleve;
    }

    /**
     * D�finit la valeur de la propri�t� dateReleve.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateReleve(String value) {
        this.dateReleve = value;
    }

    /**
     * Obtient la valeur de la propri�t� solde.
     * 
     */
    public double getSolde() {
        return solde;
    }

    /**
     * D�finit la valeur de la propri�t� solde.
     * 
     */
    public void setSolde(double value) {
        this.solde = value;
    }

    /**
     * Obtient la valeur de la propri�t� operations.
     * 
     * @return
     *     possible object is
     *     {@link Operations }
     *     
     */
    public Operations getOperations() {
        return operations;
    }

    /**
     * D�finit la valeur de la propri�t� operations.
     * 
     * @param value
     *     allowed object is
     *     {@link Operations }
     *     
     */
    public void setOperations(Operations value) {
        this.operations = value;
    }

    /**
     * Obtient la valeur de la propri�t� rib.
     * 
     */
    public long getRib() {
        return rib;
    }

    /**
     * D�finit la valeur de la propri�t� rib.
     * 
     */
    public void setRib(long value) {
        this.rib = value;
    }

}
