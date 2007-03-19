/**
 * FindFastaNrByHeitiResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package fasteignaskra.landskra_wse;

public class FindFastaNrByHeitiResponse  implements java.io.Serializable {
    private fasteignaskra.landskra_wse.FindFastaNrByHeitiResponseFindFastaNrByHeitiResult findFastaNrByHeitiResult;

    public FindFastaNrByHeitiResponse() {
    }

    public FindFastaNrByHeitiResponse(
           fasteignaskra.landskra_wse.FindFastaNrByHeitiResponseFindFastaNrByHeitiResult findFastaNrByHeitiResult) {
           this.findFastaNrByHeitiResult = findFastaNrByHeitiResult;
    }


    /**
     * Gets the findFastaNrByHeitiResult value for this FindFastaNrByHeitiResponse.
     * 
     * @return findFastaNrByHeitiResult
     */
    public fasteignaskra.landskra_wse.FindFastaNrByHeitiResponseFindFastaNrByHeitiResult getFindFastaNrByHeitiResult() {
        return findFastaNrByHeitiResult;
    }


    /**
     * Sets the findFastaNrByHeitiResult value for this FindFastaNrByHeitiResponse.
     * 
     * @param findFastaNrByHeitiResult
     */
    public void setFindFastaNrByHeitiResult(fasteignaskra.landskra_wse.FindFastaNrByHeitiResponseFindFastaNrByHeitiResult findFastaNrByHeitiResult) {
        this.findFastaNrByHeitiResult = findFastaNrByHeitiResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FindFastaNrByHeitiResponse)) return false;
        FindFastaNrByHeitiResponse other = (FindFastaNrByHeitiResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.findFastaNrByHeitiResult==null && other.getFindFastaNrByHeitiResult()==null) || 
             (this.findFastaNrByHeitiResult!=null &&
              this.findFastaNrByHeitiResult.equals(other.getFindFastaNrByHeitiResult())));
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
        if (getFindFastaNrByHeitiResult() != null) {
            _hashCode += getFindFastaNrByHeitiResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FindFastaNrByHeitiResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">findFastaNrByHeitiResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("findFastaNrByHeitiResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", "findFastaNrByHeitiResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">>findFastaNrByHeitiResponse>findFastaNrByHeitiResult"));
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
