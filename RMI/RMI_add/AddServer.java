//server programme

import java.rmi.*;
import java.net.*;

public class AddServer {
	public static void main(String[] args) {
		try {
			AddRemImpl locobj = new AddRemImpl();
			Naming.rebind("rmi:///AddRem",locobj);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
