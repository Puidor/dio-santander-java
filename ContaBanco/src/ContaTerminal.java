import java.util.Scanner;

public class ContaTerminal {
    // Atributos
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        conta.coletarDados();
        conta.exibirMensagem();
    }

    // Método para coletar os dados do usuário via terminal
    public void coletarDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta:");
        this.numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a linha restante após o número

        System.out.println("Por favor, digite o número da Agência:");
        this.agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        this.nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        this.saldo = scanner.nextDouble();

        scanner.close(); // Feche o scanner após o uso.
    }

    // Método para exibir a mensagem com os dados coletados
    public void exibirMensagem() {
        System.out.println("Olá " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + this.agencia + ", conta " + this.numero + " e seu saldo " + this.saldo
                + " já está disponível para saque.");
    }
}
