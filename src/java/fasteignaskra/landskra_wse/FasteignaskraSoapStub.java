/**
 * FasteignaskraSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package fasteignaskra.landskra_wse;

public class FasteignaskraSoapStub extends org.apache.axis.client.Stub implements fasteignaskra.landskra_wse.FasteignaskraSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[5];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findHeitiByHeiti");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", "Heiti"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", "SveitarfelagsNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">>findHeitiByHeitiResponse>findHeitiByHeitiResult"));
        oper.setReturnClass(fasteignaskra.landskra_wse.FindHeitiByHeitiResponseFindHeitiByHeitiResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", "findHeitiByHeitiResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findFastaNrByHeiti");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", "Heiti"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", "SveitarfelagsNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">>findFastaNrByHeitiResponse>findFastaNrByHeitiResult"));
        oper.setReturnClass(fasteignaskra.landskra_wse.FindFastaNrByHeitiResponseFindFastaNrByHeitiResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", "findFastaNrByHeitiResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findFasteignirByHeitiNr");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", "HeitiNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">>findFasteignirByHeitiNrResponse>findFasteignirByHeitiNrResult"));
        oper.setReturnClass(fasteignaskra.landskra_wse.FindFasteignirByHeitiNrResponseFindFasteignirByHeitiNrResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", "findFasteignirByHeitiNrResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFasteignByFastaNr");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", "FastaNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">>getFasteignByFastaNrResponse>getFasteignByFastaNrResult"));
        oper.setReturnClass(fasteignaskra.landskra_wse.GetFasteignByFastaNrResponseGetFasteignByFastaNrResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", "getFasteignByFastaNrResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLandByLandNr");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", "LandNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">>getLandByLandNrResponse>getLandByLandNrResult"));
        oper.setReturnClass(fasteignaskra.landskra_wse.GetLandByLandNrResponseGetLandByLandNrResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", "getLandByLandNrResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

    }

    public FasteignaskraSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public FasteignaskraSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public FasteignaskraSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">>>Fasteignaskra>Fasteign>Abuandi");
            cachedSerQNames.add(qName);
            cls = fasteignaskra.landskra_wse.FasteignaskraFasteignAbuandi.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">>>Fasteignaskra>Fasteign>Eigandi");
            cachedSerQNames.add(qName);
            cls = fasteignaskra.landskra_wse.FasteignaskraFasteignEigandi.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">>>Fasteignaskra>Fasteign>Matseining");
            cachedSerQNames.add(qName);
            cls = fasteignaskra.landskra_wse.FasteignaskraFasteignMatseining.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">>>Fasteignaskra>Fasteign>Umradandi");
            cachedSerQNames.add(qName);
            cls = fasteignaskra.landskra_wse.FasteignaskraFasteignUmradandi.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">>>Heiti>Heiti>FastaNr");
            cachedSerQNames.add(qName);
            cls = fasteignaskra.landskra_wse.HeitiHeitiFastaNr.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">>Fasteignaskra>Fasteign");
            cachedSerQNames.add(qName);
            cls = fasteignaskra.landskra_wse.FasteignaskraFasteign.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">>findFastaNrByHeitiResponse>findFastaNrByHeitiResult");
            cachedSerQNames.add(qName);
            cls = fasteignaskra.landskra_wse.FindFastaNrByHeitiResponseFindFastaNrByHeitiResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">>findFasteignirByHeitiNrResponse>findFasteignirByHeitiNrResult");
            cachedSerQNames.add(qName);
            cls = fasteignaskra.landskra_wse.FindFasteignirByHeitiNrResponseFindFasteignirByHeitiNrResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">>findHeitiByHeitiResponse>findHeitiByHeitiResult");
            cachedSerQNames.add(qName);
            cls = fasteignaskra.landskra_wse.FindHeitiByHeitiResponseFindHeitiByHeitiResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">>getFasteignByFastaNrResponse>getFasteignByFastaNrResult");
            cachedSerQNames.add(qName);
            cls = fasteignaskra.landskra_wse.GetFasteignByFastaNrResponseGetFasteignByFastaNrResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">>getLandByLandNrResponse>getLandByLandNrResult");
            cachedSerQNames.add(qName);
            cls = fasteignaskra.landskra_wse.GetLandByLandNrResponseGetLandByLandNrResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">>Heiti>Heiti");
            cachedSerQNames.add(qName);
            cls = fasteignaskra.landskra_wse.HeitiHeiti.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">Fasteignaskra");
            cachedSerQNames.add(qName);
            cls = fasteignaskra.landskra_wse.Fasteignaskra_Element.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">findFastaNrByHeiti");
            cachedSerQNames.add(qName);
            cls = fasteignaskra.landskra_wse.FindFastaNrByHeiti.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">findFastaNrByHeitiResponse");
            cachedSerQNames.add(qName);
            cls = fasteignaskra.landskra_wse.FindFastaNrByHeitiResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">findFasteignirByHeitiNr");
            cachedSerQNames.add(qName);
            cls = fasteignaskra.landskra_wse.FindFasteignirByHeitiNr.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">findFasteignirByHeitiNrResponse");
            cachedSerQNames.add(qName);
            cls = fasteignaskra.landskra_wse.FindFasteignirByHeitiNrResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">getFasteignByFastaNr");
            cachedSerQNames.add(qName);
            cls = fasteignaskra.landskra_wse.GetFasteignByFastaNr.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">getFasteignByFastaNrResponse");
            cachedSerQNames.add(qName);
            cls = fasteignaskra.landskra_wse.GetFasteignByFastaNrResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">getLandByLandNr");
            cachedSerQNames.add(qName);
            cls = fasteignaskra.landskra_wse.GetLandByLandNr.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">getLandByLandNrResponse");
            cachedSerQNames.add(qName);
            cls = fasteignaskra.landskra_wse.GetLandByLandNrResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", ">Heiti");
            cachedSerQNames.add(qName);
            cls = fasteignaskra.landskra_wse.Heiti.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", "BillingInfo");
            cachedSerQNames.add(qName);
            cls = fasteignaskra.landskra_wse.BillingInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public fasteignaskra.landskra_wse.FindHeitiByHeitiResponseFindHeitiByHeitiResult findHeitiByHeiti(java.lang.String heiti, java.lang.String sveitarfelagsNr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:landskra-wse:fasteignaskra/findHeitiByHeiti");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", "findHeitiByHeiti"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {heiti, sveitarfelagsNr});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (fasteignaskra.landskra_wse.FindHeitiByHeitiResponseFindHeitiByHeitiResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (fasteignaskra.landskra_wse.FindHeitiByHeitiResponseFindHeitiByHeitiResult) org.apache.axis.utils.JavaUtils.convert(_resp, fasteignaskra.landskra_wse.FindHeitiByHeitiResponseFindHeitiByHeitiResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public fasteignaskra.landskra_wse.FindFastaNrByHeitiResponseFindFastaNrByHeitiResult findFastaNrByHeiti(java.lang.String heiti, java.lang.String sveitarfelagsNr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:landskra-wse:fasteignaskra/findFastaNrByHeiti");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", "findFastaNrByHeiti"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {heiti, sveitarfelagsNr});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (fasteignaskra.landskra_wse.FindFastaNrByHeitiResponseFindFastaNrByHeitiResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (fasteignaskra.landskra_wse.FindFastaNrByHeitiResponseFindFastaNrByHeitiResult) org.apache.axis.utils.JavaUtils.convert(_resp, fasteignaskra.landskra_wse.FindFastaNrByHeitiResponseFindFastaNrByHeitiResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public fasteignaskra.landskra_wse.FindFasteignirByHeitiNrResponseFindFasteignirByHeitiNrResult findFasteignirByHeitiNr(java.lang.String heitiNr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:landskra-wse:fasteignaskra/findFasteignirByHeitiNr");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", "findFasteignirByHeitiNr"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {heitiNr});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (fasteignaskra.landskra_wse.FindFasteignirByHeitiNrResponseFindFasteignirByHeitiNrResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (fasteignaskra.landskra_wse.FindFasteignirByHeitiNrResponseFindFasteignirByHeitiNrResult) org.apache.axis.utils.JavaUtils.convert(_resp, fasteignaskra.landskra_wse.FindFasteignirByHeitiNrResponseFindFasteignirByHeitiNrResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public fasteignaskra.landskra_wse.GetFasteignByFastaNrResponseGetFasteignByFastaNrResult getFasteignByFastaNr(java.lang.String fastaNr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:landskra-wse:fasteignaskra/getFasteignByFastaNr");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", "getFasteignByFastaNr"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fastaNr});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (fasteignaskra.landskra_wse.GetFasteignByFastaNrResponseGetFasteignByFastaNrResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (fasteignaskra.landskra_wse.GetFasteignByFastaNrResponseGetFasteignByFastaNrResult) org.apache.axis.utils.JavaUtils.convert(_resp, fasteignaskra.landskra_wse.GetFasteignByFastaNrResponseGetFasteignByFastaNrResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public fasteignaskra.landskra_wse.GetLandByLandNrResponseGetLandByLandNrResult getLandByLandNr(java.lang.String landNr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:landskra-wse:fasteignaskra/getLandByLandNr");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:landskra-wse:fasteignaskra", "getLandByLandNr"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {landNr});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (fasteignaskra.landskra_wse.GetLandByLandNrResponseGetLandByLandNrResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (fasteignaskra.landskra_wse.GetLandByLandNrResponseGetLandByLandNrResult) org.apache.axis.utils.JavaUtils.convert(_resp, fasteignaskra.landskra_wse.GetLandByLandNrResponseGetLandByLandNrResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
