
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para subasta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="subasta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidadTotal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="comunaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comunaOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccionDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccionOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaSubasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horarioTermino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idPedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idSubasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreClienteEmp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pesototalpedido" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="totalTransporte" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subasta", propOrder = {
    "cantidadTotal",
    "comunaDestino",
    "comunaOrigen",
    "direccionDestino",
    "direccionOrigen",
    "fechaSubasta",
    "horarioTermino",
    "idPedido",
    "idSubasta",
    "nombreCliente",
    "nombreClienteEmp",
    "pesototalpedido",
    "totalTransporte"
})
public class Subasta {

    protected int cantidadTotal;
    protected String comunaDestino;
    protected String comunaOrigen;
    protected String direccionDestino;
    protected String direccionOrigen;
    protected String fechaSubasta;
    protected String horarioTermino;
    protected String idPedido;
    protected String idSubasta;
    protected String nombreCliente;
    protected String nombreClienteEmp;
    protected float pesototalpedido;
    protected int totalTransporte;

    /**
     * Obtiene el valor de la propiedad cantidadTotal.
     * 
     */
    public int getCantidadTotal() {
        return cantidadTotal;
    }

    /**
     * Define el valor de la propiedad cantidadTotal.
     * 
     */
    public void setCantidadTotal(int value) {
        this.cantidadTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad comunaDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComunaDestino() {
        return comunaDestino;
    }

    /**
     * Define el valor de la propiedad comunaDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComunaDestino(String value) {
        this.comunaDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad comunaOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComunaOrigen() {
        return comunaOrigen;
    }

    /**
     * Define el valor de la propiedad comunaOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComunaOrigen(String value) {
        this.comunaOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionDestino() {
        return direccionDestino;
    }

    /**
     * Define el valor de la propiedad direccionDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionDestino(String value) {
        this.direccionDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionOrigen() {
        return direccionOrigen;
    }

    /**
     * Define el valor de la propiedad direccionOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionOrigen(String value) {
        this.direccionOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaSubasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaSubasta() {
        return fechaSubasta;
    }

    /**
     * Define el valor de la propiedad fechaSubasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaSubasta(String value) {
        this.fechaSubasta = value;
    }

    /**
     * Obtiene el valor de la propiedad horarioTermino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHorarioTermino() {
        return horarioTermino;
    }

    /**
     * Define el valor de la propiedad horarioTermino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorarioTermino(String value) {
        this.horarioTermino = value;
    }

    /**
     * Obtiene el valor de la propiedad idPedido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPedido() {
        return idPedido;
    }

    /**
     * Define el valor de la propiedad idPedido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPedido(String value) {
        this.idPedido = value;
    }

    /**
     * Obtiene el valor de la propiedad idSubasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSubasta() {
        return idSubasta;
    }

    /**
     * Define el valor de la propiedad idSubasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSubasta(String value) {
        this.idSubasta = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * Define el valor de la propiedad nombreCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCliente(String value) {
        this.nombreCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreClienteEmp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreClienteEmp() {
        return nombreClienteEmp;
    }

    /**
     * Define el valor de la propiedad nombreClienteEmp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreClienteEmp(String value) {
        this.nombreClienteEmp = value;
    }

    /**
     * Obtiene el valor de la propiedad pesototalpedido.
     * 
     */
    public float getPesototalpedido() {
        return pesototalpedido;
    }

    /**
     * Define el valor de la propiedad pesototalpedido.
     * 
     */
    public void setPesototalpedido(float value) {
        this.pesototalpedido = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTransporte.
     * 
     */
    public int getTotalTransporte() {
        return totalTransporte;
    }

    /**
     * Define el valor de la propiedad totalTransporte.
     * 
     */
    public void setTotalTransporte(int value) {
        this.totalTransporte = value;
    }

}
