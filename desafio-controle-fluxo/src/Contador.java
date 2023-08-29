import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int numeroUm = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int numeroDois = scanner.nextInt();

        Contador contador = new Contador();

        contador.iniciarContador(numeroUm, numeroDois);
    }

    public void iniciarContador(int numeroUm, int numeroDois) throws ParametrosInvalidosException {
        try {
            int contador = this.calcularContador(numeroUm, numeroDois);

            if (contador == 0)
                throw new ParametrosInvalidosException();

            this.contar(contador);
        } catch (ParametrosInvalidosException error) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro e amnos devem ser positivos.");
        }
    }

    private void contar(int numeroContator) {
        for (int i = numeroContator; i > 0; i--) {
            System.out.println("Imprimindo o número: " + (numeroContator - i + 1));
        }
    }

    private int calcularContador(int numeroUm, int numeroDois) {
        if (numeroUm >= numeroDois || numeroUm < 0 || numeroDois < 0)
            return 0;

        return numeroDois - numeroUm;
    }
}
