/**
 * FasteignaskraLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package fasteignaskra.landskra_wse;

public class FasteignaskraLocator extends org.apache.axis.client.Service implements fasteignaskra.landskra_wse.Fasteignaskra {

    public FasteignaskraLocator() {
    }


    public FasteignaskraLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FasteignaskraLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FasteignaskraSoap
    private java.lang.String FasteignaskraSoap_address = "http://ws-test.fmr.is/SvcFasteignaskra_0201/Fasteignaskra.asmx";

    public java.lang.String getFasteignaskraSoapAddress() {
        return FasteignaskraSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FasteignaskraSoapWSDDServiceName = "FasteignaskraSoap";

    public java.lang.String getFasteignaskraSoapWSDDServiceName() {
        return FasteignaskraSoapWSDDServiceName;
    }

    public void setFasteignaskraSoapWSDDServiceName(java.lang.String name) {
        FasteignaskraSoapWSDDServiceName = name;
    }

    public fasteignaskra.landskra_wse.FasteignaskraSoap getFasteignaskraSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FasteignaskraSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFasteignaskraSoap(endpoint);
    }

    public fasteignaskra.landskra_wse.FasteignaskraSoap getFasteignaskraSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            fasteignaskra.landskra_wse.FasteignaskraSoapStub _stub = new fasteignaskra.landskra_wse.FasteignaskraSoapStub(portAddress, this);
            _stub.setPortName(getFasteignaskraSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFasteignaskraSoapEndpointAddress(java.lang.String address) {
        FasteignaskraSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (fasteignaskra.landskra_wse.FasteignaskraSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                fasteignaskra.landskra_wse.FasteignaskraSoapStub _stub = new fasteignaskra.landskra_wse.FasteignaskraSoapStub(new java.net.URL(FasteignaskraSoap_address), this);
                _stub.setPortName(getFasteignaskraSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("FasteignaskraSoap".equals(inputPortName)) {
            return getFasteignaskraSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", "Fasteignaskra");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", "FasteignaskraSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FasteignaskraSoap".equals(portName)) {
            setFasteignaskraSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
