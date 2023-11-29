
package sw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reporte complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reporte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bodegamp_idbodega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cliente_id_cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comisionmaipogrande" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="desccalibre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionestado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadopedido_idestado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechainicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechapedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechatermino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idpedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iva" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombrebodega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreproducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pesototalpedido" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rutproductor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiposeguro_idtiposeguro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalfinal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalpedido" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totaltransporte" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reporte", propOrder = {
    "bodegampIdbodega",
    "cantidad",
    "clienteIdCliente",
    "comisionmaipogrande",
    "desccalibre",
    "descripcionestado",
    "estadopedidoIdestado",
    "fechainicio",
    "fechapedido",
    "fechatermino",
    "idpedido",
    "iva",
    "nombrebodega",
    "nombreproducto",
    "pesototalpedido",
    "rutproductor",
    "tiposeguroIdtiposeguro",
    "totalfinal",
    "totalpedido",
    "totaltransporte"
})
public class Reporte {

    @XmlElement(name = "bodegamp_idbodega")
    protected String bodegampIdbodega;
    protected int cantidad;
    @XmlElement(name = "cliente_id_cliente")
    protected String clienteIdCliente;
    protected int comisionmaipogrande;
    protected String desccalibre;
    protected String descripcionestado;
    @XmlElement(name = "estadopedido_idestado")
    protected String estadopedidoIdestado;
    protected String fechainicio;
    protected String fechapedido;
    protected String fechatermino;
    protected String idpedido;
    protected int iva;
    protected String nombrebodega;
    protected String nombreproducto;
    protected int pesototalpedido;
    protected String rutproductor;
    @XmlElement(name = "tiposeguro_idtiposeguro")
    protected String tiposeguroIdtiposeguro;
    protected int totalfinal;
    protected int totalpedido;
    protected int totaltransporte;

    /**
     * Obtiene el valor de la propiedad bodegampIdbodega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBodegampIdbodega() {
        return bodegampIdbodega;
    }

    /**
     * Define el valor de la propiedad bodegampIdbodega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBodegampIdbodega(String value) {
        this.bodegampIdbodega = value;
    }

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

    /**
     * Obtiene el valor de la propiedad comisionmaipogrande.
     * 
     */
    public int getComisionmaipogrande() {
        return comisionmaipogrande;
    }

    /**
     * Define el valor de la propiedad comisionmaipogrande.
     * 
     */
    public void setComisionmaipogrande(int value) {
        this.comisionmaipogrande = value;
    }

    /**
     * Obtiene el valor de la propiedad desccalibre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesccalibre() {
        return desccalibre;
    }

    /**
     * Define el valor de la propiedad desccalibre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesccalibre(String value) {
        this.desccalibre = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionestado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionestado() {
        return descripcionestado;
    }

    /**
     * Define el valor de la propiedad descripcionestado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionestado(String value) {
        this.descripcionestado = value;
    }

    /**
     * Obtiene el valor de la propiedad estadopedidoIdestado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadopedidoIdestado() {
        return estadopedidoIdestado;
    }

    /**
     * Define el valor de la propiedad estadopedidoIdestado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadopedidoIdestado(String value) {
        this.estadopedidoIdestado = value;
    }

    /**
     * Obtiene el valor de la propiedad fechainicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechainicio() {
        return fechainicio;
    }

    /**
     * Define el valor de la propiedad fechainicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechainicio(String value) {
        this.fechainicio = value;
    }

    /**
     * Obtiene el valor de la propiedad fechapedido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechapedido() {
        return fechapedido;
    }

    /**
     * Define el valor de la propiedad fechapedido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechapedido(String value) {
        this.fechapedido = value;
    }

    /**
     * Obtiene el valor de la propiedad fechatermino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechatermino() {
        return fechatermino;
    }

    /**
     * Define el valor de la propiedad fechatermino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechatermino(String value) {
        this.fechatermino = value;
    }

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

    /**
     * Obtiene el valor de la propiedad iva.
     * 
     */
    public int getIva() {
        return iva;
    }

    /**
     * Define el valor de la propiedad iva.
     * 
     */
    public void setIva(int value) {
        this.iva = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrebodega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrebodega() {
        return nombrebodega;
    }

    /**
     * Define el valor de la propiedad nombrebodega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrebodega(String value) {
        this.nombrebodega = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreproducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreproducto() {
        return nombreproducto;
    }

    /**
     * Define el valor de la propiedad nombreproducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreproducto(String value) {
        this.nombreproducto = value;
    }

    /**
     * Obtiene el valor de la propiedad pesototalpedido.
     * 
     */
    public int getPesototalpedido() {
        return pesototalpedido;
    }

    /**
     * Define el valor de la propiedad pesototalpedido.
     * 
     */
    public void setPesototalpedido(int value) {
        this.pesototalpedido = value;
    }

    /**
     * Obtiene el valor de la propiedad rutproductor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRutproductor() {
        return rutproductor;
    }

    /**
     * Define el valor de la propiedad rutproductor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRutproductor(String value) {
        this.rutproductor = value;
    }

    /**
     * Obtiene el valor de la propiedad tiposeguroIdtiposeguro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiposeguroIdtiposeguro() {
        return tiposeguroIdtiposeguro;
    }

    /**
     * Define el valor de la propiedad tiposeguroIdtiposeguro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiposeguroIdtiposeguro(String value) {
        this.tiposeguroIdtiposeguro = value;
    }

    /**
     * Obtiene el valor de la propiedad totalfinal.
     * 
     */
    public int getTotalfinal() {
        return totalfinal;
    }

    /**
     * Define el valor de la propiedad totalfinal.
     * 
     */
    public void setTotalfinal(int value) {
        this.totalfinal = value;
    }

    /**
     * Obtiene el valor de la propiedad totalpedido.
     * 
     */
    public int getTotalpedido() {
        return totalpedido;
    }

    /**
     * Define el valor de la propiedad totalpedido.
     * 
     */
    public void setTotalpedido(int value) {
        this.totalpedido = value;
    }

    /**
     * Obtiene el valor de la propiedad totaltransporte.
     * 
     */
    public int getTotaltransporte() {
        return totaltransporte;
    }

    /**
     * Define el valor de la propiedad totaltransporte.
     * 
     */
    public void setTotaltransporte(int value) {
        this.totaltransporte = value;
    }

}
