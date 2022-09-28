import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       //TODO: Conhecer e importar a classe Scanner

       //Exibir as mensagens ao úsuario

       //Obter pela Scanner os valores digitados no terminal

       //Exibir a mensagem da conta criada

       int numero;
       String agencia, nomeCliente;
       double saldo;

       java.util.Scanner sc = new Scanner(System.in);

       System.out.println("Por favor, digite o número da conta: ");
       numero = sc.nextInt();

       System.out.println("Digite o número da sua Agência: ");
       agencia = sc.next();

       sc.nextLine();

       System.out.println("Digite seu Nome: ");
       nomeCliente = sc.nextLine();

       System.out.println("Agora, digite seu saldo: ");
       saldo = sc.nextDouble();

       System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: "+ agencia +", conta: "+ numero +" e seu saldo: "+ saldo +" já está disponível para saque");

    }
}
