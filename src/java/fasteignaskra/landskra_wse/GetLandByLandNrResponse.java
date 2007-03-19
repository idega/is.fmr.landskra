/**
 * GetLandByLandNrResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package fasteignaskra.landskra_wse;

public class GetLandByLandNrResponse  implements java.io.Serializable {
    private fasteignaskra.landskra_wse.GetLandByLandNrResponseGetLandByLandNrResult getLandByLandNrResult;

    public GetLandByLandNrResponse() {
    }

    public GetLandByLandNrResponse(
           fasteignaskra.landskra_wse.GetLandByLandNrResponseGetLandByLandNrResult getLandByLandNrResult) {
           this.getLandByLandNrResult = getLandByLandNrResult;
    }


    /**
     * Gets the getLandByLandNrResult value for this GetLandByLandNrResponse.
     * 
     * @return getLandByLandNrResult
     */
    public fasteignaskra.landskra_wse.GetLandByLandNrResponseGetLandByLandNrResult getGetLandByLandNrResult() {
        return getLandByLandNrResult;
    }


    /**
     * Sets the getLandByLandNrResult value for this GetLandByLandNrResponse.
     * 
     * @param getLandByLandNrResult
     */
    public void setGetLandByLandNrResult(fasteignaskra.landskra_wse.GetLandByLandNrResponseGetLandByLandNrResult getLandByLandNrResult) {
        this.getLandByLandNrResult = getLandByLandNrResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLandByLandNrResponse)) return false;
        GetLandByLandNrResponse other = (GetLandByLandNrResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getLandByLandNrResult==null && other.getGetLandByLandNrResult()==null) || 
             (this.getLandByLandNrResult!=null &&
              this.getLandByLandNrResult.equals(other.getGetLandByLandNrResult())));
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
        if (getGetLandByLandNrResult() != null) {
            _hashCode += getGetLandByLandNrResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetLandByLandNrResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">getLandByLandNrResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getLandByLandNrResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", "getLandByLandNrResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">>getLandByLandNrResponse>getLandByLandNrResult"));
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
