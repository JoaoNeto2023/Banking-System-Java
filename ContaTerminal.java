import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[]args) throws Exception {

        Scanner ler = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo = 237.48;

        System.out.println("Por favor, digite o número da agência: ");
        agencia = ler.next();

        System.out.println("Por favor, digite o número do campo: ");
        numero = ler.nextInt();

        System.out.println("Por favor, digite o seu primeiro nome: ");
        nomeCliente = ler.next();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
   
    }
}
