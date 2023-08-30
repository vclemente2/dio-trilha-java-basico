import java.util.Scanner;

public class CondicionalmenteRico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int saldoTotal = scanner.nextInt();
        int valorSaque = scanner.nextInt();

        if (saldoTotal <= valorSaque)
            System.out.println("Saldo insuficiente. Saque nao realizado!");
        else {
            saldoTotal -= valorSaque;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + saldoTotal);
        }

    }
}