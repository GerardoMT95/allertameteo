//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.13 at 01:46:09 PM CET 
//


package it.eng.parer.xmlGen.serviziVersamento.wsEsitoUnico;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ECStatoConsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ECStatoConsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="IN_ATTESA_MEMORIZZAZIONE"/>
 *     &lt;enumeration value="IN_ATTESA_SCHED"/>
 *     &lt;enumeration value="IN_VOLUME_APERTO"/>
 *     &lt;enumeration value="IN_VOLUME_CHIUSO"/>
 *     &lt;enumeration value="IN_VOLUME_DA_CHIUDERE"/>
 *     &lt;enumeration value="IN_VOLUME_IN_ERRORE"/>
 *     &lt;enumeration value="NON_SELEZ_SCHED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ECStatoConsType")
@XmlEnum
public enum ECStatoConsType {

    IN_ATTESA_MEMORIZZAZIONE,
    IN_ATTESA_SCHED,
    IN_VOLUME_APERTO,
    IN_VOLUME_CHIUSO,
    IN_VOLUME_DA_CHIUDERE,
    IN_VOLUME_IN_ERRORE,
    NON_SELEZ_SCHED;

    public String value() {
        return name();
    }

    public static ECStatoConsType fromValue(String v) {
        return valueOf(v);
    }

}
