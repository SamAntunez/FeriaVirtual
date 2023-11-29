
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para comuna complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="comuna">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idcomuna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombrecomuna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="region_idregion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comuna", propOrder = {
    "idcomuna",
    "nombrecomuna",
    "regionIdregion"
})
public class Comuna {

    protected String idcomuna;
    protected String nombrecomuna;
    @XmlElement(name = "region_idregion")
    protected String regionIdregion;

    /**
     * Obtiene el valor de la propiedad idcomuna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcomuna() {
        return idcomuna;
    }

    /**
     * Define el valor de la propiedad idcomuna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcomuna(String value) {
        this.idcomuna = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrecomuna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrecomuna() {
        return nombrecomuna;
    }

    /**
     * Define el valor de la propiedad nombrecomuna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrecomuna(String value) {
        this.nombrecomuna = value;
    }

    /**
     * Obtiene el valor de la propiedad regionIdregion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionIdregion() {
        return regionIdregion;
    }

    /**
     * Define el valor de la propiedad regionIdregion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionIdregion(String value) {
        this.regionIdregion = value;
    }

}
