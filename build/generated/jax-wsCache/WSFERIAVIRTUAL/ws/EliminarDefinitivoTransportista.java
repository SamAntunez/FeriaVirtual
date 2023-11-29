
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para eliminarDefinitivoTransportista complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="eliminarDefinitivoTransportista">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rutaeliminar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eliminarDefinitivoTransportista", propOrder = {
    "rutaeliminar"
})
public class EliminarDefinitivoTransportista {

    protected int rutaeliminar;

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

}
