//server programme

import java.rmi.*;
import java.net.*;

public class EchoServer {
	public static void main(String[] args) {
		try {
			EchoRemImpl locobj = new EchoRemImpl();
			Naming.rebind("rmi:///EchoRem",locobj);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}