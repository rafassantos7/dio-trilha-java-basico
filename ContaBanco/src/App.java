import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    ContaTerminal contaTerminal = new ContaTerminal();
    
    System.out.println("Digite seu nome: ");
    contaTerminal.nomeCliente = scanner.next();
    
    System.out.println("Digite sua agencia: ");
    contaTerminal.agencia = scanner.next();
    
    System.out.println("Digite seu numero: ");
    contaTerminal.numero = scanner.nextInt();

    System.out.println("Digite seu saldo: ");
    contaTerminal.saldo = scanner.nextDouble();

    System.out.println("Olá " + contaTerminal.nomeCliente
    + " obrigado por criar uma conta em nosso banco, sua agencia é: "
    + contaTerminal.agencia + ", conta " + contaTerminal.numero
    + " e seu saldo: " + contaTerminal.saldo
    + " já está disponível para saque.");

}
}
