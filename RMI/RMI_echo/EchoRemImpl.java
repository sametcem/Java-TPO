//implementation of interface
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class EchoRemImpl extends UnicastRemoteObject implements EchoRem {
	public EchoRemImpl() throws RemoteException {}

	private static final long serialVersionUID = 1L;

	@Override
	public String echo(String s) throws RemoteException {
		return s;
	}

}
