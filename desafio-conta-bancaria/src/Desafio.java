import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeTitular = scanner.nextLine();
        int numeroConta = scanner.nextInt();
        double saldo = scanner.nextDouble();
        float taxaJuros = scanner.nextFloat();

       ContaPoupanca.criarConta(numeroConta, nomeTitular, saldo, taxaJuros);
    }
}