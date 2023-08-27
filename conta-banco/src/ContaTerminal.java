import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    private String agencia;
    private int conta;
    private String nome;
    private double saldo;

    public ContaTerminal(String agencia, int conta, String nome, double saldo) {
        this.agencia = agencia;
        this.conta = conta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o nome do cliente");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o número da agência");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o saldo");
        double saldo = scanner.nextDouble();

        ContaTerminal conta = new ContaTerminal(agencia, numero, nome, saldo);

        conta.imprimirDadosUsuario();
    }

    public void imprimirDadosUsuario() {
        String templateDadosUsuario = this.criarStringDadosUsuario();

        System.out.println(templateDadosUsuario);
    }

    private String criarStringDadosUsuario() {
        return String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de R$ %.2f já está disponível para saque.",
                this.nome, this.agencia, this.conta, this.saldo);
    }
}
