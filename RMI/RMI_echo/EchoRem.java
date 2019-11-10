//define remote interface
import java.rmi.*;

public interface EchoRem extends Remote{
	public String echo(String s) throws RemoteException;
}
