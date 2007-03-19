/**
 * HeitiHeitiFastaNr.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package fasteignaskra.landskra_wse;

public class HeitiHeitiFastaNr  implements java.io.Serializable {
    private java.lang.Integer fastanr;

    private java.lang.String merking;

    private java.lang.Integer heitinr;

    private java.lang.Short notkunarlykill;

    private java.lang.String notkun;

    private java.lang.String byggingarar;

    private java.math.BigDecimal flatarmal;

    private java.lang.String flatarmalseining;

    private java.lang.String thinglysingarandlag;

    public HeitiHeitiFastaNr() {
    }

    public HeitiHeitiFastaNr(
           java.lang.Integer fastanr,
           java.lang.String merking,
           java.lang.Integer heitinr,
           java.lang.Short notkunarlykill,
           java.lang.String notkun,
           java.lang.String byggingarar,
           java.math.BigDecimal flatarmal,
           java.lang.String flatarmalseining,
           java.lang.String thinglysingarandlag) {
           this.fastanr = fastanr;
           this.merking = merking;
           this.heitinr = heitinr;
           this.notkunarlykill = notkunarlykill;
           this.notkun = notkun;
           this.byggingarar = byggingarar;
           this.flatarmal = flatarmal;
           this.flatarmalseining = flatarmalseining;
           this.thinglysingarandlag = thinglysingarandlag;
    }


    /**
     * Gets the fastanr value for this HeitiHeitiFastaNr.
     * 
     * @return fastanr
     */
    public java.lang.Integer getFastanr() {
        return fastanr;
    }


    /**
     * Sets the fastanr value for this HeitiHeitiFastaNr.
     * 
     * @param fastanr
     */
    public void setFastanr(java.lang.Integer fastanr) {
        this.fastanr = fastanr;
    }


    /**
     * Gets the merking value for this HeitiHeitiFastaNr.
     * 
     * @return merking
     */
    public java.lang.String getMerking() {
        return merking;
    }


    /**
     * Sets the merking value for this HeitiHeitiFastaNr.
     * 
     * @param merking
     */
    public void setMerking(java.lang.String merking) {
        this.merking = merking;
    }


    /**
     * Gets the heitinr value for this HeitiHeitiFastaNr.
     * 
     * @return heitinr
     */
    public java.lang.Integer getHeitinr() {
        return heitinr;
    }


    /**
     * Sets the heitinr value for this HeitiHeitiFastaNr.
     * 
     * @param heitinr
     */
    public void setHeitinr(java.lang.Integer heitinr) {
        this.heitinr = heitinr;
    }


    /**
     * Gets the notkunarlykill value for this HeitiHeitiFastaNr.
     * 
     * @return notkunarlykill
     */
    public java.lang.Short getNotkunarlykill() {
        return notkunarlykill;
    }


    /**
     * Sets the notkunarlykill value for this HeitiHeitiFastaNr.
     * 
     * @param notkunarlykill
     */
    public void setNotkunarlykill(java.lang.Short notkunarlykill) {
        this.notkunarlykill = notkunarlykill;
    }


    /**
     * Gets the notkun value for this HeitiHeitiFastaNr.
     * 
     * @return notkun
     */
    public java.lang.String getNotkun() {
        return notkun;
    }


    /**
     * Sets the notkun value for this HeitiHeitiFastaNr.
     * 
     * @param notkun
     */
    public void setNotkun(java.lang.String notkun) {
        this.notkun = notkun;
    }


    /**
     * Gets the byggingarar value for this HeitiHeitiFastaNr.
     * 
     * @return byggingarar
     */
    public java.lang.String getByggingarar() {
        return byggingarar;
    }


    /**
     * Sets the byggingarar value for this HeitiHeitiFastaNr.
     * 
     * @param byggingarar
     */
    public void setByggingarar(java.lang.String byggingarar) {
        this.byggingarar = byggingarar;
    }


    /**
     * Gets the flatarmal value for this HeitiHeitiFastaNr.
     * 
     * @return flatarmal
     */
    public java.math.BigDecimal getFlatarmal() {
        return flatarmal;
    }


    /**
     * Sets the flatarmal value for this HeitiHeitiFastaNr.
     * 
     * @param flatarmal
     */
    public void setFlatarmal(java.math.BigDecimal flatarmal) {
        this.flatarmal = flatarmal;
    }


    /**
     * Gets the flatarmalseining value for this HeitiHeitiFastaNr.
     * 
     * @return flatarmalseining
     */
    public java.lang.String getFlatarmalseining() {
        return flatarmalseining;
    }


    /**
     * Sets the flatarmalseining value for this HeitiHeitiFastaNr.
     * 
     * @param flatarmalseining
     */
    public void setFlatarmalseining(java.lang.String flatarmalseining) {
        this.flatarmalseining = flatarmalseining;
    }


    /**
     * Gets the thinglysingarandlag value for this HeitiHeitiFastaNr.
     * 
     * @return thinglysingarandlag
     */
    public java.lang.String getThinglysingarandlag() {
        return thinglysingarandlag;
    }


    /**
     * Sets the thinglysingarandlag value for this HeitiHeitiFastaNr.
     * 
     * @param thinglysingarandlag
     */
    public void setThinglysingarandlag(java.lang.String thinglysingarandlag) {
        this.thinglysingarandlag = thinglysingarandlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HeitiHeitiFastaNr)) return false;
        HeitiHeitiFastaNr other = (HeitiHeitiFastaNr) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fastanr==null && other.getFastanr()==null) || 
             (this.fastanr!=null &&
              this.fastanr.equals(other.getFastanr()))) &&
            ((this.merking==null && other.getMerking()==null) || 
             (this.merking!=null &&
              this.merking.equals(other.getMerking()))) &&
            ((this.heitinr==null && other.getHeitinr()==null) || 
             (this.heitinr!=null &&
              this.heitinr.equals(other.getHeitinr()))) &&
            ((this.notkunarlykill==null && other.getNotkunarlykill()==null) || 
             (this.notkunarlykill!=null &&
              this.notkunarlykill.equals(other.getNotkunarlykill()))) &&
            ((this.notkun==null && other.getNotkun()==null) || 
             (this.notkun!=null &&
              this.notkun.equals(other.getNotkun()))) &&
            ((this.byggingarar==null && other.getByggingarar()==null) || 
             (this.byggingarar!=null &&
              this.byggingarar.equals(other.getByggingarar()))) &&
            ((this.flatarmal==null && other.getFlatarmal()==null) || 
             (this.flatarmal!=null &&
              this.flatarmal.equals(other.getFlatarmal()))) &&
            ((this.flatarmalseining==null && other.getFlatarmalseining()==null) || 
             (this.flatarmalseining!=null &&
              this.flatarmalseining.equals(other.getFlatarmalseining()))) &&
            ((this.thinglysingarandlag==null && other.getThinglysingarandlag()==null) || 
             (this.thinglysingarandlag!=null &&
              this.thinglysingarandlag.equals(other.getThinglysingarandlag())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFastanr() != null) {
            _hashCode += getFastanr().hashCode();
        }
        if (getMerking() != null) {
            _hashCode += getMerking().hashCode();
        }
        if (getHeitinr() != null) {
            _hashCode += getHeitinr().hashCode();
        }
        if (getNotkunarlykill() != null) {
            _hashCode += getNotkunarlykill().hashCode();
        }
        if (getNotkun() != null) {
            _hashCode += getNotkun().hashCode();
        }
        if (getByggingarar() != null) {
            _hashCode += getByggingarar().hashCode();
        }
        if (getFlatarmal() != null) {
            _hashCode += getFlatarmal().hashCode();
        }
        if (getFlatarmalseining() != null) {
            _hashCode += getFlatarmalseining().hashCode();
        }
        if (getThinglysingarandlag() != null) {
            _hashCode += getThinglysingarandlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HeitiHeitiFastaNr.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">>>Heiti>Heiti>FastaNr"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fastanr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fastanr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merking");
        elemField.setXmlName(new javax.xml.namespace.QName("", "merking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("heitinr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "heitinr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notkunarlykill");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notkunarlykill"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notkun");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notkun"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("byggingarar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "byggingarar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flatarmal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flatarmal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flatarmalseining");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flatarmalseining"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thinglysingarandlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "thinglysingarandlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
