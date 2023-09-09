import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
        String nomeTitular = scanner.nextLine();
        double saldo = scanner.nextDouble();

       ContaBancaria.criarConta(numeroConta, nomeTitular, saldo);
    }
}