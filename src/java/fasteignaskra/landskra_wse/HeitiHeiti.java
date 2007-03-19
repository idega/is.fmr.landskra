/**
 * HeitiHeiti.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package fasteignaskra.landskra_wse;

public class HeitiHeiti  implements java.io.Serializable {
    private java.lang.Integer landnr;

    private java.lang.Integer heitinr;

    private java.lang.String heiti;

    private java.lang.String husnumer;

    private java.lang.String sveitarfelagsnr;

    private java.lang.String sveitarfelag;

    private java.lang.String byggdarnr;

    private java.lang.String byggd;

    private java.lang.String postnr;

    private java.lang.String poststod;

    private java.lang.String thinglysingarandlag;

    private fasteignaskra.landskra_wse.HeitiHeitiFastaNr[] fastaNr;

    public HeitiHeiti() {
    }

    public HeitiHeiti(
           java.lang.Integer landnr,
           java.lang.Integer heitinr,
           java.lang.String heiti,
           java.lang.String husnumer,
           java.lang.String sveitarfelagsnr,
           java.lang.String sveitarfelag,
           java.lang.String byggdarnr,
           java.lang.String byggd,
           java.lang.String postnr,
           java.lang.String poststod,
           java.lang.String thinglysingarandlag,
           fasteignaskra.landskra_wse.HeitiHeitiFastaNr[] fastaNr) {
           this.landnr = landnr;
           this.heitinr = heitinr;
           this.heiti = heiti;
           this.husnumer = husnumer;
           this.sveitarfelagsnr = sveitarfelagsnr;
           this.sveitarfelag = sveitarfelag;
           this.byggdarnr = byggdarnr;
           this.byggd = byggd;
           this.postnr = postnr;
           this.poststod = poststod;
           this.thinglysingarandlag = thinglysingarandlag;
           this.fastaNr = fastaNr;
    }


    /**
     * Gets the landnr value for this HeitiHeiti.
     * 
     * @return landnr
     */
    public java.lang.Integer getLandnr() {
        return landnr;
    }


    /**
     * Sets the landnr value for this HeitiHeiti.
     * 
     * @param landnr
     */
    public void setLandnr(java.lang.Integer landnr) {
        this.landnr = landnr;
    }


    /**
     * Gets the heitinr value for this HeitiHeiti.
     * 
     * @return heitinr
     */
    public java.lang.Integer getHeitinr() {
        return heitinr;
    }


    /**
     * Sets the heitinr value for this HeitiHeiti.
     * 
     * @param heitinr
     */
    public void setHeitinr(java.lang.Integer heitinr) {
        this.heitinr = heitinr;
    }


    /**
     * Gets the heiti value for this HeitiHeiti.
     * 
     * @return heiti
     */
    public java.lang.String getHeiti() {
        return heiti;
    }


    /**
     * Sets the heiti value for this HeitiHeiti.
     * 
     * @param heiti
     */
    public void setHeiti(java.lang.String heiti) {
        this.heiti = heiti;
    }


    /**
     * Gets the husnumer value for this HeitiHeiti.
     * 
     * @return husnumer
     */
    public java.lang.String getHusnumer() {
        return husnumer;
    }


    /**
     * Sets the husnumer value for this HeitiHeiti.
     * 
     * @param husnumer
     */
    public void setHusnumer(java.lang.String husnumer) {
        this.husnumer = husnumer;
    }


    /**
     * Gets the sveitarfelagsnr value for this HeitiHeiti.
     * 
     * @return sveitarfelagsnr
     */
    public java.lang.String getSveitarfelagsnr() {
        return sveitarfelagsnr;
    }


    /**
     * Sets the sveitarfelagsnr value for this HeitiHeiti.
     * 
     * @param sveitarfelagsnr
     */
    public void setSveitarfelagsnr(java.lang.String sveitarfelagsnr) {
        this.sveitarfelagsnr = sveitarfelagsnr;
    }


    /**
     * Gets the sveitarfelag value for this HeitiHeiti.
     * 
     * @return sveitarfelag
     */
    public java.lang.String getSveitarfelag() {
        return sveitarfelag;
    }


    /**
     * Sets the sveitarfelag value for this HeitiHeiti.
     * 
     * @param sveitarfelag
     */
    public void setSveitarfelag(java.lang.String sveitarfelag) {
        this.sveitarfelag = sveitarfelag;
    }


    /**
     * Gets the byggdarnr value for this HeitiHeiti.
     * 
     * @return byggdarnr
     */
    public java.lang.String getByggdarnr() {
        return byggdarnr;
    }


    /**
     * Sets the byggdarnr value for this HeitiHeiti.
     * 
     * @param byggdarnr
     */
    public void setByggdarnr(java.lang.String byggdarnr) {
        this.byggdarnr = byggdarnr;
    }


    /**
     * Gets the byggd value for this HeitiHeiti.
     * 
     * @return byggd
     */
    public java.lang.String getByggd() {
        return byggd;
    }


    /**
     * Sets the byggd value for this HeitiHeiti.
     * 
     * @param byggd
     */
    public void setByggd(java.lang.String byggd) {
        this.byggd = byggd;
    }


    /**
     * Gets the postnr value for this HeitiHeiti.
     * 
     * @return postnr
     */
    public java.lang.String getPostnr() {
        return postnr;
    }


    /**
     * Sets the postnr value for this HeitiHeiti.
     * 
     * @param postnr
     */
    public void setPostnr(java.lang.String postnr) {
        this.postnr = postnr;
    }


    /**
     * Gets the poststod value for this HeitiHeiti.
     * 
     * @return poststod
     */
    public java.lang.String getPoststod() {
        return poststod;
    }


    /**
     * Sets the poststod value for this HeitiHeiti.
     * 
     * @param poststod
     */
    public void setPoststod(java.lang.String poststod) {
        this.poststod = poststod;
    }


    /**
     * Gets the thinglysingarandlag value for this HeitiHeiti.
     * 
     * @return thinglysingarandlag
     */
    public java.lang.String getThinglysingarandlag() {
        return thinglysingarandlag;
    }


    /**
     * Sets the thinglysingarandlag value for this HeitiHeiti.
     * 
     * @param thinglysingarandlag
     */
    public void setThinglysingarandlag(java.lang.String thinglysingarandlag) {
        this.thinglysingarandlag = thinglysingarandlag;
    }


    /**
     * Gets the fastaNr value for this HeitiHeiti.
     * 
     * @return fastaNr
     */
    public fasteignaskra.landskra_wse.HeitiHeitiFastaNr[] getFastaNr() {
        return fastaNr;
    }


    /**
     * Sets the fastaNr value for this HeitiHeiti.
     * 
     * @param fastaNr
     */
    public void setFastaNr(fasteignaskra.landskra_wse.HeitiHeitiFastaNr[] fastaNr) {
        this.fastaNr = fastaNr;
    }

    public fasteignaskra.landskra_wse.HeitiHeitiFastaNr getFastaNr(int i) {
        return this.fastaNr[i];
    }

    public void setFastaNr(int i, fasteignaskra.landskra_wse.HeitiHeitiFastaNr _value) {
        this.fastaNr[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HeitiHeiti)) return false;
        HeitiHeiti other = (HeitiHeiti) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.landnr==null && other.getLandnr()==null) || 
             (this.landnr!=null &&
              this.landnr.equals(other.getLandnr()))) &&
            ((this.heitinr==null && other.getHeitinr()==null) || 
             (this.heitinr!=null &&
              this.heitinr.equals(other.getHeitinr()))) &&
            ((this.heiti==null && other.getHeiti()==null) || 
             (this.heiti!=null &&
              this.heiti.equals(other.getHeiti()))) &&
            ((this.husnumer==null && other.getHusnumer()==null) || 
             (this.husnumer!=null &&
              this.husnumer.equals(other.getHusnumer()))) &&
            ((this.sveitarfelagsnr==null && other.getSveitarfelagsnr()==null) || 
             (this.sveitarfelagsnr!=null &&
              this.sveitarfelagsnr.equals(other.getSveitarfelagsnr()))) &&
            ((this.sveitarfelag==null && other.getSveitarfelag()==null) || 
             (this.sveitarfelag!=null &&
              this.sveitarfelag.equals(other.getSveitarfelag()))) &&
            ((this.byggdarnr==null && other.getByggdarnr()==null) || 
             (this.byggdarnr!=null &&
              this.byggdarnr.equals(other.getByggdarnr()))) &&
            ((this.byggd==null && other.getByggd()==null) || 
             (this.byggd!=null &&
              this.byggd.equals(other.getByggd()))) &&
            ((this.postnr==null && other.getPostnr()==null) || 
             (this.postnr!=null &&
              this.postnr.equals(other.getPostnr()))) &&
            ((this.poststod==null && other.getPoststod()==null) || 
             (this.poststod!=null &&
              this.poststod.equals(other.getPoststod()))) &&
            ((this.thinglysingarandlag==null && other.getThinglysingarandlag()==null) || 
             (this.thinglysingarandlag!=null &&
              this.thinglysingarandlag.equals(other.getThinglysingarandlag()))) &&
            ((this.fastaNr==null && other.getFastaNr()==null) || 
             (this.fastaNr!=null &&
              java.util.Arrays.equals(this.fastaNr, other.getFastaNr())));
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
        if (getLandnr() != null) {
            _hashCode += getLandnr().hashCode();
        }
        if (getHeitinr() != null) {
            _hashCode += getHeitinr().hashCode();
        }
        if (getHeiti() != null) {
            _hashCode += getHeiti().hashCode();
        }
        if (getHusnumer() != null) {
            _hashCode += getHusnumer().hashCode();
        }
        if (getSveitarfelagsnr() != null) {
            _hashCode += getSveitarfelagsnr().hashCode();
        }
        if (getSveitarfelag() != null) {
            _hashCode += getSveitarfelag().hashCode();
        }
        if (getByggdarnr() != null) {
            _hashCode += getByggdarnr().hashCode();
        }
        if (getByggd() != null) {
            _hashCode += getByggd().hashCode();
        }
        if (getPostnr() != null) {
            _hashCode += getPostnr().hashCode();
        }
        if (getPoststod() != null) {
            _hashCode += getPoststod().hashCode();
        }
        if (getThinglysingarandlag() != null) {
            _hashCode += getThinglysingarandlag().hashCode();
        }
        if (getFastaNr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFastaNr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFastaNr(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HeitiHeiti.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">>Heiti>Heiti"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landnr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "landnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("heiti");
        elemField.setXmlName(new javax.xml.namespace.QName("", "heiti"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("husnumer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "husnumer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sveitarfelagsnr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sveitarfelagsnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sveitarfelag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sveitarfelag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("byggdarnr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "byggdarnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("byggd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "byggd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postnr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poststod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "poststod"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fastaNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FastaNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">>>Heiti>Heiti>FastaNr"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
