
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IEchoResponse extends Remote {

    EchoResponse reply(EchoRequest echoRequest) throws RemoteException;
    AddResponse add(AddRequest echoRequest) throws RemoteException;

}
