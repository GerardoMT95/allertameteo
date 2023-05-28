//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.13 at 01:38:36 PM CET 
//


package it.eng.parer.xmlGen.serviziVersamento.wsRequestUnico;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfiloArchivisticoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfiloArchivisticoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FascicoloPrincipale" type="{}CamiciaFascicoloType"/>
 *         &lt;element name="FascicoliSecondari" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FascicoloSecondario" type="{}CamiciaFascicoloType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfiloArchivisticoType", propOrder = {
    "fascicoloPrincipale",
    "fascicoliSecondari"
})
public class ProfiloArchivisticoType {

    @XmlElement(name = "FascicoloPrincipale", required = true)
    protected CamiciaFascicoloType fascicoloPrincipale;
    @XmlElement(name = "FascicoliSecondari")
    protected ProfiloArchivisticoType.FascicoliSecondari fascicoliSecondari;

    /**
     * Gets the value of the fascicoloPrincipale property.
     * 
     * @return
     *     possible object is
     *     {@link CamiciaFascicoloType }
     *     
     */
    public CamiciaFascicoloType getFascicoloPrincipale() {
        return fascicoloPrincipale;
    }

    /**
     * Sets the value of the fascicoloPrincipale property.
     * 
     * @param value
     *     allowed object is
     *     {@link CamiciaFascicoloType }
     *     
     */
    public void setFascicoloPrincipale(CamiciaFascicoloType value) {
        this.fascicoloPrincipale = value;
    }

    /**
     * Gets the value of the fascicoliSecondari property.
     * 
     * @return
     *     possible object is
     *     {@link ProfiloArchivisticoType.FascicoliSecondari }
     *     
     */
    public ProfiloArchivisticoType.FascicoliSecondari getFascicoliSecondari() {
        return fascicoliSecondari;
    }

    /**
     * Sets the value of the fascicoliSecondari property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfiloArchivisticoType.FascicoliSecondari }
     *     
     */
    public void setFascicoliSecondari(ProfiloArchivisticoType.FascicoliSecondari value) {
        this.fascicoliSecondari = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FascicoloSecondario" type="{}CamiciaFascicoloType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fascicoloSecondario"
    })
    public static class FascicoliSecondari {

        @XmlElement(name = "FascicoloSecondario", required = true)
        protected List<CamiciaFascicoloType> fascicoloSecondario;

        /**
         * Gets the value of the fascicoloSecondario property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fascicoloSecondario property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFascicoloSecondario().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CamiciaFascicoloType }
         * 
         * 
         */
        public List<CamiciaFascicoloType> getFascicoloSecondario() {
            if (fascicoloSecondario == null) {
                fascicoloSecondario = new ArrayList<CamiciaFascicoloType>();
            }
            return this.fascicoloSecondario;
        }

    }

}
