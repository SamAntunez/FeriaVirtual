
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para modelo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="modelo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descmodelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idmodelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marca_idmarca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modelo", propOrder = {
    "descmodelo",
    "idmodelo",
    "marcaIdmarca"
})
public class Modelo {

    protected String descmodelo;
    protected String idmodelo;
    @XmlElement(name = "marca_idmarca")
    protected String marcaIdmarca;

    /**
     * Obtiene el valor de la propiedad descmodelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescmodelo() {
        return descmodelo;
    }

    /**
     * Define el valor de la propiedad descmodelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescmodelo(String value) {
        this.descmodelo = value;
    }

    /**
     * Obtiene el valor de la propiedad idmodelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdmodelo() {
        return idmodelo;
    }

    /**
     * Define el valor de la propiedad idmodelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdmodelo(String value) {
        this.idmodelo = value;
    }

    /**
     * Obtiene el valor de la propiedad marcaIdmarca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcaIdmarca() {
        return marcaIdmarca;
    }

    /**
     * Define el valor de la propiedad marcaIdmarca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcaIdmarca(String value) {
        this.marcaIdmarca = value;
    }

}
