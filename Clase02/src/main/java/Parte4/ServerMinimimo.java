package Parte4;

import com.sun.corba.se.spi.activation.Server;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMinimimo {

    public static void main(String[] args) {
        String mensaje = " Mister Kraken Server ";
        try { // try with resources
            ServerSocket ss = new ServerSocket(8000);
            while (true) {
                System.out.println("ya se van a conectar, trank");
                try(    Socket so = ss.accept();
                        OutputStream out=so.getOutputStream();
                ) {
                    
                    System.out.println("se conecto" + so.getInetAddress());
                    out.write(mensaje.getBytes());
                
                
                } catch (Exception e) {
                    e.printStackTrace();
                }

               // so.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
