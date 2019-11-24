/**
 * DemoImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public interface DemoImplService extends javax.xml.rpc.Service {
    public java.lang.String getDemoImplPortAddress();

    public ws.Demo getDemoImplPort() throws javax.xml.rpc.ServiceException;

    public ws.Demo getDemoImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
