
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para modificarClienteEmpresa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="modificarClienteEmpresa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificadorabuscar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correoelectronico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contrasena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="razonsocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comuna_idcomuna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modificarClienteEmpresa", propOrder = {
    "identificadorabuscar",
    "direccion",
    "correoelectronico",
    "contrasena",
    "razonsocial",
    "comunaIdcomuna"
})
public class ModificarClienteEmpresa {

    protected String identificadorabuscar;
    protected String direccion;
    protected String correoelectronico;
    protected String contrasena;
    protected String razonsocial;
    @XmlElement(name = "comuna_idcomuna")
    protected String comunaIdcomuna;

    /**
     * Obtiene el valor de la propiedad identificadorabuscar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorabuscar() {
        return identificadorabuscar;
    }

    /**
     * Define el valor de la propiedad identificadorabuscar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorabuscar(String value) {
        this.identificadorabuscar = value;
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

}
