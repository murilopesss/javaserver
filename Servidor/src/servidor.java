import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class servidor {
    public static void main(String[] args) {
        try {
            ServerSocket servidor = new ServerSocket(8000);
            System.out.println();
            System.out.println("Servidor iniciado");

            while (true) {
                Socket cliente = servidor.accept();

                System.out.println("cliente conectado: "+ cliente.getInetAddress());


                /*InputStreamReader converte bytes em caracteres, permitindo a leitura de dados em formato de texto 
                a partir do fluxo de entrada do socket.
                BufferedReader usa o InputStreamReader para fornecer uma maneira eficiente de ler texto, mantendo um 
                buffer interno para melhorar o desempenho. */
                InputStreamReader fluxoDados = new InputStreamReader(cliente.getInputStream());
                BufferedReader dado = new BufferedReader(fluxoDados);
                System.out.println(dado.readLine());
            }
        } catch (Exception e) {
            System.out.println("Erro!");
        }
    }
}
