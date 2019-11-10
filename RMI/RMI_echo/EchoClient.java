//Client programme

import java.rmi.*;
import java.net.*;
import java.io.*;
import java.util.*;

public class EchoClient {
	public static void main(String[] args) {
		String host = "localhost";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input");
		String s = sc.next();
		
			EchoRem remobj;
			try {
				remobj = (EchoRem) Naming.lookup("rmi://"+host+"/EchoRem");
				System.out.println("SUM ECHO: " + remobj.echo(s));
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NotBoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				sc.close();
			}
			
		
	}

}
