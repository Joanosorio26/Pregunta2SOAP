//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.10.23 a las 04:32:44 AM PET 
//


package pe.edu.cibertec.ws.objects;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para visitaws complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="visitaws"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ticket" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombre_visitante" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fecha_visita" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="recorrido" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numero_personas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "visitaws", propOrder = {
    "ticket",
    "nombreVisitante",
    "fechaVisita",
    "recorrido",
    "numeroPersonas"
})
public class Visitaws {

    protected int ticket;
    @XmlElement(name = "nombre_visitante", required = true)
    protected String nombreVisitante;
    @XmlElement(name = "fecha_visita", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaVisita;
    @XmlElement(required = true)
    protected String recorrido;
    @XmlElement(name = "numero_personas")
    protected int numeroPersonas;

    /**
     * Obtiene el valor de la propiedad ticket.
     * 
     */
    public int getTicket() {
        return ticket;
    }

    /**
     * Define el valor de la propiedad ticket.
     * 
     */
    public void setTicket(int value) {
        this.ticket = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreVisitante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreVisitante() {
        return nombreVisitante;
    }

    /**
     * Define el valor de la propiedad nombreVisitante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreVisitante(String value) {
        this.nombreVisitante = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVisita.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVisita() {
        return fechaVisita;
    }

    /**
     * Define el valor de la propiedad fechaVisita.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVisita(XMLGregorianCalendar value) {
        this.fechaVisita = value;
    }

    /**
     * Obtiene el valor de la propiedad recorrido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecorrido() {
        return recorrido;
    }

    /**
     * Define el valor de la propiedad recorrido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecorrido(String value) {
        this.recorrido = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroPersonas.
     * 
     */
    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    /**
     * Define el valor de la propiedad numeroPersonas.
     * 
     */
    public void setNumeroPersonas(int value) {
        this.numeroPersonas = value;
    }

}
