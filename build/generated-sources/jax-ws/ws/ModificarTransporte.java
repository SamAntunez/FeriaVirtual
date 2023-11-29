
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para modificarTransporte complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="modificarTransporte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rutabuscar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="capacidadcarga" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="frigorificotrans" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="permisocirculacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modificarTransporte", propOrder = {
    "rutabuscar",
    "capacidadcarga",
    "frigorificotrans",
    "permisocirculacion"
})
public class ModificarTransporte {

    protected int rutabuscar;
    protected int capacidadcarga;
    protected String frigorificotrans;
    protected String permisocirculacion;

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
     * Obtiene el valor de la propiedad capacidadcarga.
     * 
     */
    public int getCapacidadcarga() {
        return capacidadcarga;
    }

    /**
     * Define el valor de la propiedad capacidadcarga.
     * 
     */
    public void setCapacidadcarga(int value) {
        this.capacidadcarga = value;
    }

    /**
     * Obtiene el valor de la propiedad frigorificotrans.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrigorificotrans() {
        return frigorificotrans;
    }

    /**
     * Define el valor de la propiedad frigorificotrans.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrigorificotrans(String value) {
        this.frigorificotrans = value;
    }

    /**
     * Obtiene el valor de la propiedad permisocirculacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermisocirculacion() {
        return permisocirculacion;
    }

    /**
     * Define el valor de la propiedad permisocirculacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermisocirculacion(String value) {
        this.permisocirculacion = value;
    }

}
