/**
 * GetFasteignByFastaNr.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package fasteignaskra.landskra_wse;

public class GetFasteignByFastaNr  implements java.io.Serializable {
    private java.lang.String fastaNr;

    public GetFasteignByFastaNr() {
    }

    public GetFasteignByFastaNr(
           java.lang.String fastaNr) {
           this.fastaNr = fastaNr;
    }


    /**
     * Gets the fastaNr value for this GetFasteignByFastaNr.
     * 
     * @return fastaNr
     */
    public java.lang.String getFastaNr() {
        return fastaNr;
    }


    /**
     * Sets the fastaNr value for this GetFasteignByFastaNr.
     * 
     * @param fastaNr
     */
    public void setFastaNr(java.lang.String fastaNr) {
        this.fastaNr = fastaNr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFasteignByFastaNr)) return false;
        GetFasteignByFastaNr other = (GetFasteignByFastaNr) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fastaNr==null && other.getFastaNr()==null) || 
             (this.fastaNr!=null &&
              this.fastaNr.equals(other.getFastaNr())));
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
        if (getFastaNr() != null) {
            _hashCode += getFastaNr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFasteignByFastaNr.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">getFasteignByFastaNr"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fastaNr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", "FastaNr"));
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
