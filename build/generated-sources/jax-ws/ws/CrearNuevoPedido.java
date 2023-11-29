
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para crearNuevoPedido complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="crearNuevoPedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cliente_id_cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crearNuevoPedido", propOrder = {
    "clienteIdCliente"
})
public class CrearNuevoPedido {

    @XmlElement(name = "cliente_id_cliente")
    protected String clienteIdCliente;

    /**
     * Obtiene el valor de la propiedad clienteIdCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClienteIdCliente() {
        return clienteIdCliente;
    }

    /**
     * Define el valor de la propiedad clienteIdCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClienteIdCliente(String value) {
        this.clienteIdCliente = value;
    }

}
