
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para crearNuevaOfertaEnSubasta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="crearNuevaOfertaEnSubasta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="montosubasta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="subasta_id_subasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transportista_rut" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "crearNuevaOfertaEnSubasta", propOrder = {
    "montosubasta",
    "subastaIdSubasta",
    "transportistaRut",
    "pedidoIdpedido"
})
public class CrearNuevaOfertaEnSubasta {

    protected int montosubasta;
    @XmlElement(name = "subasta_id_subasta")
    protected String subastaIdSubasta;
    @XmlElement(name = "transportista_rut")
    protected int transportistaRut;
    @XmlElement(name = "pedido_idpedido")
    protected String pedidoIdpedido;

    /**
     * Obtiene el valor de la propiedad montosubasta.
     * 
     */
    public int getMontosubasta() {
        return montosubasta;
    }

    /**
     * Define el valor de la propiedad montosubasta.
     * 
     */
    public void setMontosubasta(int value) {
        this.montosubasta = value;
    }

    /**
     * Obtiene el valor de la propiedad subastaIdSubasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubastaIdSubasta() {
        return subastaIdSubasta;
    }

    /**
     * Define el valor de la propiedad subastaIdSubasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubastaIdSubasta(String value) {
        this.subastaIdSubasta = value;
    }

    /**
     * Obtiene el valor de la propiedad transportistaRut.
     * 
     */
    public int getTransportistaRut() {
        return transportistaRut;
    }

    /**
     * Define el valor de la propiedad transportistaRut.
     * 
     */
    public void setTransportistaRut(int value) {
        this.transportistaRut = value;
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
