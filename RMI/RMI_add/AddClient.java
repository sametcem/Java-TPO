//Client programme

import java.rmi.*;
import java.net.*;
import java.io.*;
import java.util.*;

public class AddClient {
	public static void main(String[] args) {
		String host = "localhost";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd number");
		int b = sc.nextInt();
		
			AddRem remobj;
			try {
				remobj = (AddRem) Naming.lookup("rmi://"+host+"/AddRem");
				System.out.println("SUM: " + remobj.addNum(a, b));
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
