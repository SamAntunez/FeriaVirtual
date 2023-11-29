
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para productorProducto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="productorProducto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calibre_idcalibre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idcalibre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="img" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre_productor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreproducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="producto_idproducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productor_rut" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="stock" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productorProducto", propOrder = {
    "calibreIdcalibre",
    "idcalibre",
    "img",
    "nombreProductor",
    "nombreproducto",
    "precio",
    "productoIdproducto",
    "productorRut",
    "stock"
})
public class ProductorProducto {

    @XmlElement(name = "calibre_idcalibre")
    protected String calibreIdcalibre;
    protected String idcalibre;
    protected String img;
    @XmlElement(name = "nombre_productor")
    protected String nombreProductor;
    protected String nombreproducto;
    protected int precio;
    @XmlElement(name = "producto_idproducto")
    protected String productoIdproducto;
    @XmlElement(name = "productor_rut")
    protected int productorRut;
    protected int stock;

    /**
     * Obtiene el valor de la propiedad calibreIdcalibre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalibreIdcalibre() {
        return calibreIdcalibre;
    }

    /**
     * Define el valor de la propiedad calibreIdcalibre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalibreIdcalibre(String value) {
        this.calibreIdcalibre = value;
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
     * Obtiene el valor de la propiedad nombreProductor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreProductor() {
        return nombreProductor;
    }

    /**
     * Define el valor de la propiedad nombreProductor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreProductor(String value) {
        this.nombreProductor = value;
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

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     */
    public void setPrecio(int value) {
        this.precio = value;
    }

    /**
     * Obtiene el valor de la propiedad productoIdproducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductoIdproducto() {
        return productoIdproducto;
    }

    /**
     * Define el valor de la propiedad productoIdproducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductoIdproducto(String value) {
        this.productoIdproducto = value;
    }

    /**
     * Obtiene el valor de la propiedad productorRut.
     * 
     */
    public int getProductorRut() {
        return productorRut;
    }

    /**
     * Define el valor de la propiedad productorRut.
     * 
     */
    public void setProductorRut(int value) {
        this.productorRut = value;
    }

    /**
     * Obtiene el valor de la propiedad stock.
     * 
     */
    public int getStock() {
        return stock;
    }

    /**
     * Define el valor de la propiedad stock.
     * 
     */
    public void setStock(int value) {
        this.stock = value;
    }

}
