/**
 * FindFastaNrByHeiti.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package fasteignaskra.landskra_wse;

public class FindFastaNrByHeiti  implements java.io.Serializable {
    private java.lang.String heiti;

    private java.lang.String sveitarfelagsNr;

    public FindFastaNrByHeiti() {
    }

    public FindFastaNrByHeiti(
           java.lang.String heiti,
           java.lang.String sveitarfelagsNr) {
           this.heiti = heiti;
           this.sveitarfelagsNr = sveitarfelagsNr;
    }


    /**
     * Gets the heiti value for this FindFastaNrByHeiti.
     * 
     * @return heiti
     */
    public java.lang.String getHeiti() {
        return heiti;
    }


    /**
     * Sets the heiti value for this FindFastaNrByHeiti.
     * 
     * @param heiti
     */
    public void setHeiti(java.lang.String heiti) {
        this.heiti = heiti;
    }


    /**
     * Gets the sveitarfelagsNr value for this FindFastaNrByHeiti.
     * 
     * @return sveitarfelagsNr
     */
    public java.lang.String getSveitarfelagsNr() {
        return sveitarfelagsNr;
    }


    /**
     * Sets the sveitarfelagsNr value for this FindFastaNrByHeiti.
     * 
     * @param sveitarfelagsNr
     */
    public void setSveitarfelagsNr(java.lang.String sveitarfelagsNr) {
        this.sveitarfelagsNr = sveitarfelagsNr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FindFastaNrByHeiti)) return false;
        FindFastaNrByHeiti other = (FindFastaNrByHeiti) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.heiti==null && other.getHeiti()==null) || 
             (this.heiti!=null &&
              this.heiti.equals(other.getHeiti()))) &&
            ((this.sveitarfelagsNr==null && other.getSveitarfelagsNr()==null) || 
             (this.sveitarfelagsNr!=null &&
              this.sveitarfelagsNr.equals(other.getSveitarfelagsNr())));
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
        if (getHeiti() != null) {
            _hashCode += getHeiti().hashCode();
        }
        if (getSveitarfelagsNr() != null) {
            _hashCode += getSveitarfelagsNr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FindFastaNrByHeiti.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">findFastaNrByHeiti"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("heiti");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", "Heiti"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sveitarfelagsNr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", "SveitarfelagsNr"));
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
