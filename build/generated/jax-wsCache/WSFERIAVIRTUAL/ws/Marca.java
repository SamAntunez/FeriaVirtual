
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para marca complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="marca">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descmarca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idmarca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "marca", propOrder = {
    "descmarca",
    "idmarca"
})
public class Marca {

    protected String descmarca;
    protected String idmarca;

    /**
     * Obtiene el valor de la propiedad descmarca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescmarca() {
        return descmarca;
    }

    /**
     * Define el valor de la propiedad descmarca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescmarca(String value) {
        this.descmarca = value;
    }

    /**
     * Obtiene el valor de la propiedad idmarca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdmarca() {
        return idmarca;
    }

    /**
     * Define el valor de la propiedad idmarca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdmarca(String value) {
        this.idmarca = value;
    }

}
