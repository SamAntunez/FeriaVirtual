
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para modificarConsultor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="modificarConsultor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreusuarioabuscar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contrasenausuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modificarConsultor", propOrder = {
    "nombreusuarioabuscar",
    "contrasenausuario"
})
public class ModificarConsultor {

    protected String nombreusuarioabuscar;
    protected String contrasenausuario;

    /**
     * Obtiene el valor de la propiedad nombreusuarioabuscar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreusuarioabuscar() {
        return nombreusuarioabuscar;
    }

    /**
     * Define el valor de la propiedad nombreusuarioabuscar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreusuarioabuscar(String value) {
        this.nombreusuarioabuscar = value;
    }

    /**
     * Obtiene el valor de la propiedad contrasenausuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrasenausuario() {
        return contrasenausuario;
    }

    /**
     * Define el valor de la propiedad contrasenausuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrasenausuario(String value) {
        this.contrasenausuario = value;
    }

}
