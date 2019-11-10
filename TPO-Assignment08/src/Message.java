import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Message extends UnicastRemoteObject implements IEchoResponse {

	private static final long serialVersionUID = 1L;

	public Message() throws RemoteException {}

    @Override
    public EchoResponse reply(EchoRequest req) throws RemoteException {
        EchoResponse resp = new EchoResponse();
        if (req.message != null)
        {
            resp.message = req.message;
        }
        return resp;
    }

    @Override
    public AddResponse add(AddRequest req) throws RemoteException {
        AddResponse resp = new AddResponse();
        if(req.a != null && req.b != null)
            resp.result = req.a+req.b;
        return resp;
    }
}