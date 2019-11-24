package ws;

public class DemoProxy implements ws.Demo {
  private String _endpoint = null;
  private ws.Demo demo = null;
  
  public DemoProxy() {
    _initDemoProxy();
  }
  
  public DemoProxy(String endpoint) {
    _endpoint = endpoint;
    _initDemoProxy();
  }
  
  private void _initDemoProxy() {
    try {
      demo = (new ws.DemoImplServiceLocator()).getDemoImplPort();
      if (demo != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)demo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)demo)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (demo != null)
      ((javax.xml.rpc.Stub)demo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ws.Demo getDemo() {
    if (demo == null)
      _initDemoProxy();
    return demo;
  }
  
  public java.lang.String helloWorld() throws java.rmi.RemoteException{
    if (demo == null)
      _initDemoProxy();
    return demo.helloWorld();
  }
  
  public java.lang.String hi(java.lang.String arg0) throws java.rmi.RemoteException{
    if (demo == null)
      _initDemoProxy();
    return demo.hi(arg0);
  }
  
  
}