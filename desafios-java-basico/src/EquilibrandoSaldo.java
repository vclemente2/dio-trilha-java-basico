import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

        if (valorDeposito < 0 || valorRetirada < 0) {
            System.out.println("O valor de depósito e retirada devem ser positivos.");
        } else if (valorRetirada >= (saldoAtual + valorDeposito)) {
            System.out.println("Operações não realizadas. O valor de retirada é maior do que o saldo em conta.");
        } else {
            saldoAtual = saldoAtual + valorDeposito - valorRetirada;
            System.out.println("Saldo atualizado na conta: " + saldoAtual);
        }
    }

}