/**
 * FindFasteignirByHeitiNrResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package fasteignaskra.landskra_wse;

public class FindFasteignirByHeitiNrResponse  implements java.io.Serializable {
    private fasteignaskra.landskra_wse.FindFasteignirByHeitiNrResponseFindFasteignirByHeitiNrResult findFasteignirByHeitiNrResult;

    public FindFasteignirByHeitiNrResponse() {
    }

    public FindFasteignirByHeitiNrResponse(
           fasteignaskra.landskra_wse.FindFasteignirByHeitiNrResponseFindFasteignirByHeitiNrResult findFasteignirByHeitiNrResult) {
           this.findFasteignirByHeitiNrResult = findFasteignirByHeitiNrResult;
    }


    /**
     * Gets the findFasteignirByHeitiNrResult value for this FindFasteignirByHeitiNrResponse.
     * 
     * @return findFasteignirByHeitiNrResult
     */
    public fasteignaskra.landskra_wse.FindFasteignirByHeitiNrResponseFindFasteignirByHeitiNrResult getFindFasteignirByHeitiNrResult() {
        return findFasteignirByHeitiNrResult;
    }


    /**
     * Sets the findFasteignirByHeitiNrResult value for this FindFasteignirByHeitiNrResponse.
     * 
     * @param findFasteignirByHeitiNrResult
     */
    public void setFindFasteignirByHeitiNrResult(fasteignaskra.landskra_wse.FindFasteignirByHeitiNrResponseFindFasteignirByHeitiNrResult findFasteignirByHeitiNrResult) {
        this.findFasteignirByHeitiNrResult = findFasteignirByHeitiNrResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FindFasteignirByHeitiNrResponse)) return false;
        FindFasteignirByHeitiNrResponse other = (FindFasteignirByHeitiNrResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.findFasteignirByHeitiNrResult==null && other.getFindFasteignirByHeitiNrResult()==null) || 
             (this.findFasteignirByHeitiNrResult!=null &&
              this.findFasteignirByHeitiNrResult.equals(other.getFindFasteignirByHeitiNrResult())));
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
        if (getFindFasteignirByHeitiNrResult() != null) {
            _hashCode += getFindFasteignirByHeitiNrResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FindFasteignirByHeitiNrResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">findFasteignirByHeitiNrResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("findFasteignirByHeitiNrResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", "findFasteignirByHeitiNrResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">>findFasteignirByHeitiNrResponse>findFasteignirByHeitiNrResult"));
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
