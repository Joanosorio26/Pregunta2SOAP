//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.10.23 a las 04:13:01 AM PET 
//


package pe.edu.cibertec.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para animalws complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="animalws"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idanimal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="especie" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="edad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="habitat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "animalws", propOrder = {
    "idanimal",
    "nombre",
    "especie",
    "edad",
    "habitat"
})
public class Animalws {

    protected int idanimal;
    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(required = true)
    protected String especie;
    protected int edad;
    @XmlElement(required = true)
    protected String habitat;

    /**
     * Obtiene el valor de la propiedad idanimal.
     * 
     */
    public int getIdanimal() {
        return idanimal;
    }

    /**
     * Define el valor de la propiedad idanimal.
     * 
     */
    public void setIdanimal(int value) {
        this.idanimal = value;
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
     * Obtiene el valor de la propiedad especie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * Define el valor de la propiedad especie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEspecie(String value) {
        this.especie = value;
    }

    /**
     * Obtiene el valor de la propiedad edad.
     * 
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Define el valor de la propiedad edad.
     * 
     */
    public void setEdad(int value) {
        this.edad = value;
    }

    /**
     * Obtiene el valor de la propiedad habitat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabitat() {
        return habitat;
    }

    /**
     * Define el valor de la propiedad habitat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabitat(String value) {
        this.habitat = value;
    }

}
