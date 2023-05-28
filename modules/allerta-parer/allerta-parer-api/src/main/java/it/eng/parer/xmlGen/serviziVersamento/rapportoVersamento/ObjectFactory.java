//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.13 at 01:41:50 PM CET 
//


package it.eng.parer.xmlGen.serviziVersamento.rapportoVersamento;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.eng.javaClass package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RapportoVersamento_QNAME = new QName("", "RapportoVersamento");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.eng.javaClass
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DocumentoSIPType }
     * 
     */
    public DocumentoSIPType createDocumentoSIPType() {
        return new DocumentoSIPType();
    }

    /**
     * Create an instance of {@link SIPType }
     * 
     */
    public SIPType createSIPType() {
        return new SIPType();
    }

    /**
     * Create an instance of {@link ECWarningSecondariType }
     * 
     */
    public ECWarningSecondariType createECWarningSecondariType() {
        return new ECWarningSecondariType();
    }

    /**
     * Create an instance of {@link ECEsitoGeneraleType }
     * 
     */
    public ECEsitoGeneraleType createECEsitoGeneraleType() {
        return new ECEsitoGeneraleType();
    }

    /**
     * Create an instance of {@link ECErroreType }
     * 
     */
    public ECErroreType createECErroreType() {
        return new ECErroreType();
    }

    /**
     * Create an instance of {@link ECErroriSecondariType }
     * 
     */
    public ECErroriSecondariType createECErroriSecondariType() {
        return new ECErroriSecondariType();
    }

    /**
     * Create an instance of {@link SCVersatoreType }
     * 
     */
    public SCVersatoreType createSCVersatoreType() {
        return new SCVersatoreType();
    }

    /**
     * Create an instance of {@link SCChiaveType }
     * 
     */
    public SCChiaveType createSCChiaveType() {
        return new SCChiaveType();
    }

    /**
     * Create an instance of {@link UnitaDocumentariaSIPType }
     * 
     */
    public UnitaDocumentariaSIPType createUnitaDocumentariaSIPType() {
        return new UnitaDocumentariaSIPType();
    }

    /**
     * Create an instance of {@link RapportoVersamentoType }
     * 
     */
    public RapportoVersamentoType createRapportoVersamentoType() {
        return new RapportoVersamentoType();
    }

    /**
     * Create an instance of {@link DocumentoSIPType.Componenti }
     * 
     */
    public DocumentoSIPType.Componenti createDocumentoSIPTypeComponenti() {
        return new DocumentoSIPType.Componenti();
    }

    /**
     * Create an instance of {@link ECWarningType }
     * 
     */
    public ECWarningType createECWarningType() {
        return new ECWarningType();
    }

    /**
     * Create an instance of {@link ComponenteSIPType }
     * 
     */
    public ComponenteSIPType createComponenteSIPType() {
        return new ComponenteSIPType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RapportoVersamentoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RapportoVersamento")
    public JAXBElement<RapportoVersamentoType> createRapportoVersamento(RapportoVersamentoType value) {
        return new JAXBElement<RapportoVersamentoType>(_RapportoVersamento_QNAME, RapportoVersamentoType.class, null, value);
    }

}
