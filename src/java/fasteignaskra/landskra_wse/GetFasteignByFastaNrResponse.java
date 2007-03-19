/**
 * GetFasteignByFastaNrResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package fasteignaskra.landskra_wse;

public class GetFasteignByFastaNrResponse  implements java.io.Serializable {
    private fasteignaskra.landskra_wse.GetFasteignByFastaNrResponseGetFasteignByFastaNrResult getFasteignByFastaNrResult;

    public GetFasteignByFastaNrResponse() {
    }

    public GetFasteignByFastaNrResponse(
           fasteignaskra.landskra_wse.GetFasteignByFastaNrResponseGetFasteignByFastaNrResult getFasteignByFastaNrResult) {
           this.getFasteignByFastaNrResult = getFasteignByFastaNrResult;
    }


    /**
     * Gets the getFasteignByFastaNrResult value for this GetFasteignByFastaNrResponse.
     * 
     * @return getFasteignByFastaNrResult
     */
    public fasteignaskra.landskra_wse.GetFasteignByFastaNrResponseGetFasteignByFastaNrResult getGetFasteignByFastaNrResult() {
        return getFasteignByFastaNrResult;
    }


    /**
     * Sets the getFasteignByFastaNrResult value for this GetFasteignByFastaNrResponse.
     * 
     * @param getFasteignByFastaNrResult
     */
    public void setGetFasteignByFastaNrResult(fasteignaskra.landskra_wse.GetFasteignByFastaNrResponseGetFasteignByFastaNrResult getFasteignByFastaNrResult) {
        this.getFasteignByFastaNrResult = getFasteignByFastaNrResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFasteignByFastaNrResponse)) return false;
        GetFasteignByFastaNrResponse other = (GetFasteignByFastaNrResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getFasteignByFastaNrResult==null && other.getGetFasteignByFastaNrResult()==null) || 
             (this.getFasteignByFastaNrResult!=null &&
              this.getFasteignByFastaNrResult.equals(other.getGetFasteignByFastaNrResult())));
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
        if (getGetFasteignByFastaNrResult() != null) {
            _hashCode += getGetFasteignByFastaNrResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFasteignByFastaNrResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">getFasteignByFastaNrResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getFasteignByFastaNrResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", "getFasteignByFastaNrResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">>getFasteignByFastaNrResponse>getFasteignByFastaNrResult"));
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
