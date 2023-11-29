
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para eliminarDefinitivoClienteNormal complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="eliminarDefinitivoClienteNormal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rutaeliminar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idcliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eliminarDefinitivoClienteNormal", propOrder = {
    "rutaeliminar",
    "idcliente"
})
public class EliminarDefinitivoClienteNormal {

    protected int rutaeliminar;
    protected String idcliente;

    /**
     * Obtiene el valor de la propiedad rutaeliminar.
     * 
     */
    public int getRutaeliminar() {
        return rutaeliminar;
    }

    /**
     * Define el valor de la propiedad rutaeliminar.
     * 
     */
    public void setRutaeliminar(int value) {
        this.rutaeliminar = value;
    }

    /**
     * Obtiene el valor de la propiedad idcliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcliente() {
        return idcliente;
    }

    /**
     * Define el valor de la propiedad idcliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcliente(String value) {
        this.idcliente = value;
    }

}
