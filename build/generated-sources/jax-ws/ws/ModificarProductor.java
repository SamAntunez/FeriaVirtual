
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para modificarProductor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="modificarProductor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rutabuscar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apellidopat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apellidomat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechanacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correoelectronico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contrasena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "modificarProductor", propOrder = {
    "rutabuscar",
    "nombre",
    "apellidopat",
    "apellidomat",
    "fechanacimiento",
    "direccion",
    "correoelectronico",
    "contrasena",
    "comunaIdcomuna"
})
public class ModificarProductor {

    protected int rutabuscar;
    protected String nombre;
    protected String apellidopat;
    protected String apellidomat;
    protected String fechanacimiento;
    protected String direccion;
    protected String correoelectronico;
    protected String contrasena;
    @XmlElement(name = "comuna_idcomuna")
    protected String comunaIdcomuna;

    /**
     * Obtiene el valor de la propiedad rutabuscar.
     * 
     */
    public int getRutabuscar() {
        return rutabuscar;
    }

    /**
     * Define el valor de la propiedad rutabuscar.
     * 
     */
    public void setRutabuscar(int value) {
        this.rutabuscar = value;
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
