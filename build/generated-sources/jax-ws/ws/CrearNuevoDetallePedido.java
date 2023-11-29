
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para crearNuevoDetallePedido complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="crearNuevoDetallePedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idproducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productor_rut" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pedido_idpedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calibre_idcalibre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crearNuevoDetallePedido", propOrder = {
    "cantidad",
    "idproducto",
    "productorRut",
    "pedidoIdpedido",
    "calibreIdcalibre"
})
public class CrearNuevoDetallePedido {

    protected int cantidad;
    protected String idproducto;
    @XmlElement(name = "productor_rut")
    protected int productorRut;
    @XmlElement(name = "pedido_idpedido")
    protected String pedidoIdpedido;
    @XmlElement(name = "calibre_idcalibre")
    protected String calibreIdcalibre;

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad idproducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdproducto() {
        return idproducto;
    }

    /**
     * Define el valor de la propiedad idproducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdproducto(String value) {
        this.idproducto = value;
    }

    /**
     * Obtiene el valor de la propiedad productorRut.
     * 
     */
    public int getProductorRut() {
        return productorRut;
    }

    /**
     * Define el valor de la propiedad productorRut.
     * 
     */
    public void setProductorRut(int value) {
        this.productorRut = value;
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

    /**
     * Obtiene el valor de la propiedad calibreIdcalibre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalibreIdcalibre() {
        return calibreIdcalibre;
    }

    /**
     * Define el valor de la propiedad calibreIdcalibre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalibreIdcalibre(String value) {
        this.calibreIdcalibre = value;
    }

}
