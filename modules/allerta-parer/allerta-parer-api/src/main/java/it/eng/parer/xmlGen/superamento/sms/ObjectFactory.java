//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.16 at 05:24:51 PM CET 
//


package it.eng.parer.xmlGen.superamento.sms;

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

    private final static QName _DatiSpecifici_QNAME = new QName("", "DatiSpecifici");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.eng.javaClass
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DatiSpecificiTypeSuperamentoSms }
     * 
     */
    public DatiSpecificiTypeSuperamentoSms createDatiSpecificiType() {
        return new DatiSpecificiTypeSuperamentoSms();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatiSpecificiTypeSuperamentoSms }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DatiSpecifici")
    public JAXBElement<DatiSpecificiTypeSuperamentoSms> createDatiSpecifici(DatiSpecificiTypeSuperamentoSms value) {
        return new JAXBElement<DatiSpecificiTypeSuperamentoSms>(_DatiSpecifici_QNAME, DatiSpecificiTypeSuperamentoSms.class, null, value);
    }

}
