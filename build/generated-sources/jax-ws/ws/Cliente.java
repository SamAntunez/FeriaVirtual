
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cliente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apellidomat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apellidopat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comuna_idcomuna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contrasena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correoelectronico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoactivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechanacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificadorempresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="razonsocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rut" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipocliente_idcliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cliente", propOrder = {
    "apellidomat",
    "apellidopat",
    "comunaIdcomuna",
    "contrasena",
    "correoelectronico",
    "direccion",
    "dv",
    "estadoactivo",
    "fechanacimiento",
    "idCliente",
    "identificadorempresa",
    "nombre",
    "razonsocial",
    "rut",
    "tipoclienteIdcliente"
})
public class Cliente {

    protected String apellidomat;
    protected String apellidopat;
    @XmlElement(name = "comuna_idcomuna")
    protected String comunaIdcomuna;
    protected String contrasena;
    protected String correoelectronico;
    protected String direccion;
    protected String dv;
    protected String estadoactivo;
    protected String fechanacimiento;
    @XmlElement(name = "id_cliente")
    protected String idCliente;
    protected String identificadorempresa;
    protected String nombre;
    protected String razonsocial;
    protected int rut;
    @XmlElement(name = "tipocliente_idcliente")
    protected String tipoclienteIdcliente;

    /**
     * Obtiene el valor de la propiedad apellidomat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidomat() {
        return apellidomat;
    }

    /**
     * Define el valor de la propiedad apellidomat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidomat(String value) {
        this.apellidomat = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidopat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidopat() {
        return apellidopat;
    }

    /**
     * Define el valor de la propiedad apellidopat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidopat(String value) {
        this.apellidopat = value;
    }

    /**
     * Obtiene el valor de la propiedad comunaIdcomuna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComunaIdcomuna() {
        return comunaIdcomuna;
    }

    /**
     * Define el valor de la propiedad comunaIdcomuna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComunaIdcomuna(String value) {
        this.comunaIdcomuna = value;
    }

    /**
     * Obtiene el valor de la propiedad contrasena.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Define el valor de la propiedad contrasena.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrasena(String value) {
        this.contrasena = value;
    }

    /**
     * Obtiene el valor de la propiedad correoelectronico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoelectronico() {
        return correoelectronico;
    }

    /**
     * Define el valor de la propiedad correoelectronico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoelectronico(String value) {
        this.correoelectronico = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad dv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDv() {
        return dv;
    }

    /**
     * Define el valor de la propiedad dv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDv(String value) {
        this.dv = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoactivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoactivo() {
        return estadoactivo;
    }

    /**
     * Define el valor de la propiedad estadoactivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoactivo(String value) {
        this.estadoactivo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechanacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechanacimiento() {
        return fechanacimiento;
    }

    /**
     * Define el valor de la propiedad fechanacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechanacimiento(String value) {
        this.fechanacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad idCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCliente() {
        return idCliente;
    }

    /**
     * Define el valor de la propiedad idCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCliente(String value) {
        this.idCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad identificadorempresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorempresa() {
        return identificadorempresa;
    }

    /**
     * Define el valor de la propiedad identificadorempresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorempresa(String value) {
        this.identificadorempresa = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad razonsocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonsocial() {
        return razonsocial;
    }

    /**
     * Define el valor de la propiedad razonsocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonsocial(String value) {
        this.razonsocial = value;
    }

    /**
     * Obtiene el valor de la propiedad rut.
     * 
     */
    public int getRut() {
        return rut;
    }

    /**
     * Define el valor de la propiedad rut.
     * 
     */
    public void setRut(int value) {
        this.rut = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoclienteIdcliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoclienteIdcliente() {
        return tipoclienteIdcliente;
    }

    /**
     * Define el valor de la propiedad tipoclienteIdcliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoclienteIdcliente(String value) {
        this.tipoclienteIdcliente = value;
    }

}
