/**
 * Created by andrewmarionhunter on 1/27/17.
 */
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TCPClient {
    public static void main(String args[]) throws Exception {
        Socket clientSocket = null;
        try {
            clientSocket = new Socket("joey10.cs.clemson.edu", 6023);
        } catch (UnknownHostException e) {}
        catch (SocketException e) {}
        catch (IOException e) {}

        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        Scanner input = new Scanner(System.in);

        String i = input.nextLine();


        out.println(i);

        String fromServer = in.readLine();

        System.out.println(fromServer);

        clientSocket.close();
        in.close();
        out.close();
    }
}
