
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para crearPago complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="crearPago">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pago_exitoso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pedido_idpedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crearPago", propOrder = {
    "pagoExitoso",
    "pedidoIdpedido"
})
public class CrearPago {

    @XmlElement(name = "pago_exitoso")
    protected String pagoExitoso;
    @XmlElement(name = "pedido_idpedido")
    protected String pedidoIdpedido;

    /**
     * Obtiene el valor de la propiedad pagoExitoso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagoExitoso() {
        return pagoExitoso;
    }

    /**
     * Define el valor de la propiedad pagoExitoso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagoExitoso(String value) {
        this.pagoExitoso = value;
    }

    /**
     * Obtiene el valor de la propiedad pedidoIdpedido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPedidoIdpedido() {
        return pedidoIdpedido;
    }

    /**
     * Define el valor de la propiedad pedidoIdpedido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPedidoIdpedido(String value) {
        this.pedidoIdpedido = value;
    }

}
