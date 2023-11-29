
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para calibre complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="calibre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="desccalibre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idcalibre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calibre", propOrder = {
    "desccalibre",
    "idcalibre"
})
public class Calibre {

    protected String desccalibre;
    protected String idcalibre;

    /**
     * Obtiene el valor de la propiedad desccalibre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesccalibre() {
        return desccalibre;
    }

    /**
     * Define el valor de la propiedad desccalibre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesccalibre(String value) {
        this.desccalibre = value;
    }

    /**
     * Obtiene el valor de la propiedad idcalibre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcalibre() {
        return idcalibre;
    }

    /**
     * Define el valor de la propiedad idcalibre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcalibre(String value) {
        this.idcalibre = value;
    }

}
