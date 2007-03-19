/**
 * FasteignaskraSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package fasteignaskra.landskra_wse;

public interface FasteignaskraSoap extends java.rmi.Remote {

    /**
     * Leit í fasteignaskrá eftir heiti fasteignar
     */
    public fasteignaskra.landskra_wse.FindHeitiByHeitiResponseFindHeitiByHeitiResult findHeitiByHeiti(java.lang.String heiti, java.lang.String sveitarfelagsNr) throws java.rmi.RemoteException;

    /**
     * Leit í fasteignaskrá eftir heiti og fastanúmeri fasteignar
     */
    public fasteignaskra.landskra_wse.FindFastaNrByHeitiResponseFindFastaNrByHeitiResult findFastaNrByHeiti(java.lang.String heiti, java.lang.String sveitarfelagsNr) throws java.rmi.RemoteException;

    /**
     * Sækir fasteignir eftir heitinúmeri
     */
    public fasteignaskra.landskra_wse.FindFasteignirByHeitiNrResponseFindFasteignirByHeitiNrResult findFasteignirByHeitiNr(java.lang.String heitiNr) throws java.rmi.RemoteException;

    /**
     * Sækir nákvæmar upplýsingar um fasteign eftir fastanúmeri
     */
    public fasteignaskra.landskra_wse.GetFasteignByFastaNrResponseGetFasteignByFastaNrResult getFasteignByFastaNr(java.lang.String fastaNr) throws java.rmi.RemoteException;

    /**
     * Sækir nákvæmar upplýsingar um land eftir landnúmeri
     */
    public fasteignaskra.landskra_wse.GetLandByLandNrResponseGetLandByLandNrResult getLandByLandNr(java.lang.String landNr) throws java.rmi.RemoteException;
}
