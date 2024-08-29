import java.io.PrintStream;
import java.net.Socket;

public class cliente{
    public static void main(String[] args) {

        try{
            //Declarando Socket do cliente
            Socket cliente = new Socket("192.168.5.80" , 8000);

            System.out.println("Cliente iniciado.");

            //fluxo de dados para envio
            PrintStream ps = new PrintStream(cliente.getOutputStream());

            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                ps.println("Deu certo! " + i);
            }
            

            cliente.close();
            System.out.println("Cliente finalizado.");

        }catch(Exception e){
            System.out.println("Ocorreu um erro na execução do cliente.");
        }
    }
}