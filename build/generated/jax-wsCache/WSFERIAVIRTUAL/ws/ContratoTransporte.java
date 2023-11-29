
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para contratoTransporte complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="contratoTransporte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fechacontrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_contrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idordent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contratoTransporte", propOrder = {
    "fechacontrato",
    "idContrato",
    "idordent"
})
public class ContratoTransporte {

    protected String fechacontrato;
    @XmlElement(name = "id_contrato")
    protected String idContrato;
    protected String idordent;

    /**
     * Obtiene el valor de la propiedad fechacontrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechacontrato() {
        return fechacontrato;
    }

    /**
     * Define el valor de la propiedad fechacontrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechacontrato(String value) {
        this.fechacontrato = value;
    }

    /**
     * Obtiene el valor de la propiedad idContrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdContrato() {
        return idContrato;
    }

    /**
     * Define el valor de la propiedad idContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdContrato(String value) {
        this.idContrato = value;
    }

    /**
     * Obtiene el valor de la propiedad idordent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdordent() {
        return idordent;
    }

    /**
     * Define el valor de la propiedad idordent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdordent(String value) {
        this.idordent = value;
    }

}
