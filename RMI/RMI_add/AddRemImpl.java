//implementation of interface
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class AddRemImpl extends UnicastRemoteObject implements AddRem {

	public AddRemImpl() throws RemoteException {}

	private static final long serialVersionUID = 1L;

	@Override
	public int addNum(int a, int b) throws RemoteException {
		return a+b;
	}

}
