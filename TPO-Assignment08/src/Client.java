import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client {

    static Scanner scanner;

    public static void main(String[] args) {
        System.setProperty("java.security.policy","D:\\Cem-PJAIT\\LECTURES\\3. year\\5. semester\\TPO_ITN\\rmi-client.policy");

        scanner = new Scanner(System.in);

        try {
            System.setSecurityManager(new RMISecurityManager());
            IEchoResponse respServer = (IEchoResponse) Naming.lookup("RMISERVER");
            String userInput;
            boolean checker = false;
            String inpA = "";
            String inpB = "";

            while (true){
                System.out.println("Enter message to echo or two doubles to sum/subtract ('end' terminates the program)");
                userInput = scanner.nextLine();
                if( userInput.equals("end") )
                    System.exit(0);
                else{

                    if (userInput.contains("+"))
                    {
                        inpA = userInput.split("\\+")[0];
                        inpB = userInput.split("\\+")[1];
                    }
                    if (userInput.contains("-"))
                    {
                        inpA = userInput.split("-")[0];
                        inpB = "-"+userInput.split("-")[1];
                    }

                    Matcher matcher = Pattern.compile("-?(\\d+)\\.?(\\d+)?").matcher(inpA);
                    if (matcher.matches())
                    {
                        matcher = Pattern.compile("-?(\\d+)\\.?(\\d+)?").matcher(inpB);
                        if (matcher.matches())
                        {
                            checker = true;
                        }
                    }

                    if (!checker)
                    {
                        EchoRequest request = new EchoRequest();
                        request.message = userInput;
                        EchoResponse response = respServer.reply(request);
                        System.out.println(response.message);
                    }else{
                        AddRequest myRequest = new AddRequest();
                        myRequest.a = Double.parseDouble(inpA);
                        myRequest.b = Double.parseDouble(inpB);
                        AddResponse response = respServer.add(myRequest);
                        System.out.println(response.result);
                    }


                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}