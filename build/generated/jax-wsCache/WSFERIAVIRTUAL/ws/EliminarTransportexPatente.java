
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para eliminarTransportexPatente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="eliminarTransportexPatente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="patenteaeliminar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eliminarTransportexPatente", propOrder = {
    "patenteaeliminar"
})
public class EliminarTransportexPatente {

    protected String patenteaeliminar;

    /**
     * Obtiene el valor de la propiedad patenteaeliminar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatenteaeliminar() {
        return patenteaeliminar;
    }

    /**
     * Define el valor de la propiedad patenteaeliminar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatenteaeliminar(String value) {
        this.patenteaeliminar = value;
    }

}
