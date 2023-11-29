
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para pedido complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bodegamp_idbodega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cliente_id_cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comisionmaipogrande" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descripcionestado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direcciondestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccionorigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadopedido_idestado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechapedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idpedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="img_url_inicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="img_url_termino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iva" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombrebodega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pesototalpedido" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "pedido", propOrder = {
    "bodegampIdbodega",
    "clienteIdCliente",
    "comisionmaipogrande",
    "descripcionestado",
    "direcciondestino",
    "direccionorigen",
    "estadopedidoIdestado",
    "fechapedido",
    "idpedido",
    "imgUrlInicio",
    "imgUrlTermino",
    "iva",
    "nombrebodega",
    "pesototalpedido",
    "tiposeguroIdtiposeguro",
    "totalfinal",
    "totalpedido",
    "totaltransporte"
})
public class Pedido {

    @XmlElement(name = "bodegamp_idbodega")
    protected String bodegampIdbodega;
    @XmlElement(name = "cliente_id_cliente")
    protected String clienteIdCliente;
    protected int comisionmaipogrande;
    protected String descripcionestado;
    protected String direcciondestino;
    protected String direccionorigen;
    @XmlElement(name = "estadopedido_idestado")
    protected String estadopedidoIdestado;
    protected String fechapedido;
    protected String idpedido;
    @XmlElement(name = "img_url_inicio")
    protected String imgUrlInicio;
    @XmlElement(name = "img_url_termino")
    protected String imgUrlTermino;
    protected int iva;
    protected String nombrebodega;
    protected int pesototalpedido;
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
     * Obtiene el valor de la propiedad direcciondestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirecciondestino() {
        return direcciondestino;
    }

    /**
     * Define el valor de la propiedad direcciondestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirecciondestino(String value) {
        this.direcciondestino = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionorigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionorigen() {
        return direccionorigen;
    }

    /**
     * Define el valor de la propiedad direccionorigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionorigen(String value) {
        this.direccionorigen = value;
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
     * Obtiene el valor de la propiedad imgUrlInicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgUrlInicio() {
        return imgUrlInicio;
    }

    /**
     * Define el valor de la propiedad imgUrlInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgUrlInicio(String value) {
        this.imgUrlInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad imgUrlTermino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgUrlTermino() {
        return imgUrlTermino;
    }

    /**
     * Define el valor de la propiedad imgUrlTermino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgUrlTermino(String value) {
        this.imgUrlTermino = value;
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
