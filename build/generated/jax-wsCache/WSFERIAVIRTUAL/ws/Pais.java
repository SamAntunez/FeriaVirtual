
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para pais complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pais">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idpais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombrepais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pais", propOrder = {
    "idpais",
    "nombrepais"
})
public class Pais {

    protected String idpais;
    protected String nombrepais;

    /**
     * Obtiene el valor de la propiedad idpais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdpais() {
        return idpais;
    }

    /**
     * Define el valor de la propiedad idpais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdpais(String value) {
        this.idpais = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrepais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrepais() {
        return nombrepais;
    }

    /**
     * Define el valor de la propiedad nombrepais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrepais(String value) {
        this.nombrepais = value;
    }

}
