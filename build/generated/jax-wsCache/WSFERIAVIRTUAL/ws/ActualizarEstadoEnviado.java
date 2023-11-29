
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizarEstadoEnviado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizarEstadoEnviado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idpedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizarEstadoEnviado", propOrder = {
    "idpedido"
})
public class ActualizarEstadoEnviado {

    protected String idpedido;

    /**
     * Obtiene el valor de la propiedad idpedido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdpedido() {
        return idpedido;
    }

    /**
     * Define el valor de la propiedad idpedido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdpedido(String value) {
        this.idpedido = value;
    }

}
