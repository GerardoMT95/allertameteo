//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.13 at 01:41:50 PM CET 
//


package it.eng.parer.xmlGen.serviziVersamento.rapportoVersamento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ECWarningType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ECWarningType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodiceWarning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessaggioWarning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ECWarningType", propOrder = {
    "codiceWarning",
    "messaggioWarning"
})
public class ECWarningType {

    @XmlElement(name = "CodiceWarning")
    protected String codiceWarning;
    @XmlElement(name = "MessaggioWarning")
    protected String messaggioWarning;

    /**
     * Gets the value of the codiceWarning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceWarning() {
        return codiceWarning;
    }

    /**
     * Sets the value of the codiceWarning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceWarning(String value) {
        this.codiceWarning = value;
    }

    /**
     * Gets the value of the messaggioWarning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessaggioWarning() {
        return messaggioWarning;
    }

    /**
     * Sets the value of the messaggioWarning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessaggioWarning(String value) {
        this.messaggioWarning = value;
    }

}
