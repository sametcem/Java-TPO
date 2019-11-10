import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        System.setProperty("java.security.policy","D:\\Cem-PJAIT\\LECTURES\\3. year\\5. semester\\TPO_ITN\\rmi-client.policy");
        
        try {
            LocateRegistry.createRegistry(1099);
            Message echoResponse = new Message();
            Naming.rebind("RMISERVER", echoResponse);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
