//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.13 at 01:38:36 PM CET 
//


package it.eng.parer.xmlGen.serviziVersamento.wsRequestUnico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfiloDocumentoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfiloDocumentoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Descrizione" type="{}StringMax4000Type" minOccurs="0"/>
 *         &lt;element name="Autore" type="{}StringMax4000Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfiloDocumentoType", propOrder = {
    "descrizione",
    "autore"
})
public class ProfiloDocumentoType {

    @XmlElement(name = "Descrizione")
    protected String descrizione;
    @XmlElement(name = "Autore")
    protected String autore;

    /**
     * Gets the value of the descrizione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Sets the value of the descrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizione(String value) {
        this.descrizione = value;
    }

    /**
     * Gets the value of the autore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutore() {
        return autore;
    }

    /**
     * Sets the value of the autore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutore(String value) {
        this.autore = value;
    }

}
