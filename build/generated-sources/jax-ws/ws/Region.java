
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para region complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="region">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idregion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreregion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pais_idpais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "region", propOrder = {
    "idregion",
    "nombreregion",
    "paisIdpais"
})
public class Region {

    protected String idregion;
    protected String nombreregion;
    @XmlElement(name = "pais_idpais")
    protected String paisIdpais;

    /**
     * Obtiene el valor de la propiedad idregion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdregion() {
        return idregion;
    }

    /**
     * Define el valor de la propiedad idregion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdregion(String value) {
        this.idregion = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreregion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreregion() {
        return nombreregion;
    }

    /**
     * Define el valor de la propiedad nombreregion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreregion(String value) {
        this.nombreregion = value;
    }

    /**
     * Obtiene el valor de la propiedad paisIdpais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisIdpais() {
        return paisIdpais;
    }

    /**
     * Define el valor de la propiedad paisIdpais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisIdpais(String value) {
        this.paisIdpais = value;
    }

}
