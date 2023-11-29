
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para eliminarProductoDelProductor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="eliminarProductoDelProductor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rutproductor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idcalibre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idproducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eliminarProductoDelProductor", propOrder = {
    "rutproductor",
    "idcalibre",
    "idproducto"
})
public class EliminarProductoDelProductor {

    protected int rutproductor;
    protected String idcalibre;
    protected String idproducto;

    /**
     * Obtiene el valor de la propiedad rutproductor.
     * 
     */
    public int getRutproductor() {
        return rutproductor;
    }

    /**
     * Define el valor de la propiedad rutproductor.
     * 
     */
    public void setRutproductor(int value) {
        this.rutproductor = value;
    }

    /**
     * Obtiene el valor de la propiedad idcalibre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcalibre() {
        return idcalibre;
    }

    /**
     * Define el valor de la propiedad idcalibre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcalibre(String value) {
        this.idcalibre = value;
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

}
