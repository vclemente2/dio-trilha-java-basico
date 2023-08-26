import java.util.Scanner;
import java.util.Locale;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro número: ");
        Double firstNumber = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        Double secondNumber = scanner.nextDouble();

        System.out.println("Soma: " + Calculator.sum(firstNumber, secondNumber));
        System.out.println("Subtração: " + Calculator.subtract(firstNumber, secondNumber));
        System.out.println("Multiplicação: " + Calculator.multiply(firstNumber, secondNumber));
        System.out.println("Divisao: " + Calculator.divide(firstNumber, secondNumber));
    }

    public static double sum(double num01, double num02) {
        return num01 + num02;
    }

    public static double subtract(double num01, double num02) {
        return num01 - num02;
    }

    public static double multiply(double num01, double num02) {
        return num01 * num02;
    }

    public static double divide(double num01, double num02) {
        return num01 / num02;
    }

}
