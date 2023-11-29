
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para producto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="producto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caterogia_idcategoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descproducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idproducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="img" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreproducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "producto", propOrder = {
    "caterogiaIdcategoria",
    "descproducto",
    "idproducto",
    "img",
    "nombreproducto"
})
public class Producto {

    @XmlElement(name = "caterogia_idcategoria")
    protected String caterogiaIdcategoria;
    protected String descproducto;
    protected String idproducto;
    protected String img;
    protected String nombreproducto;

    /**
     * Obtiene el valor de la propiedad caterogiaIdcategoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaterogiaIdcategoria() {
        return caterogiaIdcategoria;
    }

    /**
     * Define el valor de la propiedad caterogiaIdcategoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaterogiaIdcategoria(String value) {
        this.caterogiaIdcategoria = value;
    }

    /**
     * Obtiene el valor de la propiedad descproducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescproducto() {
        return descproducto;
    }

    /**
     * Define el valor de la propiedad descproducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescproducto(String value) {
        this.descproducto = value;
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

    /**
     * Obtiene el valor de la propiedad img.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImg() {
        return img;
    }

    /**
     * Define el valor de la propiedad img.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImg(String value) {
        this.img = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreproducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreproducto() {
        return nombreproducto;
    }

    /**
     * Define el valor de la propiedad nombreproducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreproducto(String value) {
        this.nombreproducto = value;
    }

}
