/**
 * FasteignaskraFasteignEigandi.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package fasteignaskra.landskra_wse;

public class FasteignaskraFasteignEigandi  implements java.io.Serializable {
    private java.lang.Integer fastanr;

    private java.lang.String kennitala;

    private java.lang.String nafn;

    private java.math.BigDecimal eignarhluti;

    private java.lang.String eigandanumer;

    private java.util.Calendar kaupdagur;

    private java.util.Calendar afhendingardagur;

    public FasteignaskraFasteignEigandi() {
    }

    public FasteignaskraFasteignEigandi(
           java.lang.Integer fastanr,
           java.lang.String kennitala,
           java.lang.String nafn,
           java.math.BigDecimal eignarhluti,
           java.lang.String eigandanumer,
           java.util.Calendar kaupdagur,
           java.util.Calendar afhendingardagur) {
           this.fastanr = fastanr;
           this.kennitala = kennitala;
           this.nafn = nafn;
           this.eignarhluti = eignarhluti;
           this.eigandanumer = eigandanumer;
           this.kaupdagur = kaupdagur;
           this.afhendingardagur = afhendingardagur;
    }


    /**
     * Gets the fastanr value for this FasteignaskraFasteignEigandi.
     * 
     * @return fastanr
     */
    public java.lang.Integer getFastanr() {
        return fastanr;
    }


    /**
     * Sets the fastanr value for this FasteignaskraFasteignEigandi.
     * 
     * @param fastanr
     */
    public void setFastanr(java.lang.Integer fastanr) {
        this.fastanr = fastanr;
    }


    /**
     * Gets the kennitala value for this FasteignaskraFasteignEigandi.
     * 
     * @return kennitala
     */
    public java.lang.String getKennitala() {
        return kennitala;
    }


    /**
     * Sets the kennitala value for this FasteignaskraFasteignEigandi.
     * 
     * @param kennitala
     */
    public void setKennitala(java.lang.String kennitala) {
        this.kennitala = kennitala;
    }


    /**
     * Gets the nafn value for this FasteignaskraFasteignEigandi.
     * 
     * @return nafn
     */
    public java.lang.String getNafn() {
        return nafn;
    }


    /**
     * Sets the nafn value for this FasteignaskraFasteignEigandi.
     * 
     * @param nafn
     */
    public void setNafn(java.lang.String nafn) {
        this.nafn = nafn;
    }


    /**
     * Gets the eignarhluti value for this FasteignaskraFasteignEigandi.
     * 
     * @return eignarhluti
     */
    public java.math.BigDecimal getEignarhluti() {
        return eignarhluti;
    }


    /**
     * Sets the eignarhluti value for this FasteignaskraFasteignEigandi.
     * 
     * @param eignarhluti
     */
    public void setEignarhluti(java.math.BigDecimal eignarhluti) {
        this.eignarhluti = eignarhluti;
    }


    /**
     * Gets the eigandanumer value for this FasteignaskraFasteignEigandi.
     * 
     * @return eigandanumer
     */
    public java.lang.String getEigandanumer() {
        return eigandanumer;
    }


    /**
     * Sets the eigandanumer value for this FasteignaskraFasteignEigandi.
     * 
     * @param eigandanumer
     */
    public void setEigandanumer(java.lang.String eigandanumer) {
        this.eigandanumer = eigandanumer;
    }


    /**
     * Gets the kaupdagur value for this FasteignaskraFasteignEigandi.
     * 
     * @return kaupdagur
     */
    public java.util.Calendar getKaupdagur() {
        return kaupdagur;
    }


    /**
     * Sets the kaupdagur value for this FasteignaskraFasteignEigandi.
     * 
     * @param kaupdagur
     */
    public void setKaupdagur(java.util.Calendar kaupdagur) {
        this.kaupdagur = kaupdagur;
    }


    /**
     * Gets the afhendingardagur value for this FasteignaskraFasteignEigandi.
     * 
     * @return afhendingardagur
     */
    public java.util.Calendar getAfhendingardagur() {
        return afhendingardagur;
    }


    /**
     * Sets the afhendingardagur value for this FasteignaskraFasteignEigandi.
     * 
     * @param afhendingardagur
     */
    public void setAfhendingardagur(java.util.Calendar afhendingardagur) {
        this.afhendingardagur = afhendingardagur;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FasteignaskraFasteignEigandi)) return false;
        FasteignaskraFasteignEigandi other = (FasteignaskraFasteignEigandi) obj;
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
            ((this.kennitala==null && other.getKennitala()==null) || 
             (this.kennitala!=null &&
              this.kennitala.equals(other.getKennitala()))) &&
            ((this.nafn==null && other.getNafn()==null) || 
             (this.nafn!=null &&
              this.nafn.equals(other.getNafn()))) &&
            ((this.eignarhluti==null && other.getEignarhluti()==null) || 
             (this.eignarhluti!=null &&
              this.eignarhluti.equals(other.getEignarhluti()))) &&
            ((this.eigandanumer==null && other.getEigandanumer()==null) || 
             (this.eigandanumer!=null &&
              this.eigandanumer.equals(other.getEigandanumer()))) &&
            ((this.kaupdagur==null && other.getKaupdagur()==null) || 
             (this.kaupdagur!=null &&
              this.kaupdagur.equals(other.getKaupdagur()))) &&
            ((this.afhendingardagur==null && other.getAfhendingardagur()==null) || 
             (this.afhendingardagur!=null &&
              this.afhendingardagur.equals(other.getAfhendingardagur())));
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
        if (getKennitala() != null) {
            _hashCode += getKennitala().hashCode();
        }
        if (getNafn() != null) {
            _hashCode += getNafn().hashCode();
        }
        if (getEignarhluti() != null) {
            _hashCode += getEignarhluti().hashCode();
        }
        if (getEigandanumer() != null) {
            _hashCode += getEigandanumer().hashCode();
        }
        if (getKaupdagur() != null) {
            _hashCode += getKaupdagur().hashCode();
        }
        if (getAfhendingardagur() != null) {
            _hashCode += getAfhendingardagur().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FasteignaskraFasteignEigandi.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">>>Fasteignaskra>Fasteign>Eigandi"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fastanr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fastanr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kennitala");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kennitala"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nafn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nafn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eignarhluti");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eignarhluti"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eigandanumer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eigandanumer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kaupdagur");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kaupdagur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("afhendingardagur");
        elemField.setXmlName(new javax.xml.namespace.QName("", "afhendingardagur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
