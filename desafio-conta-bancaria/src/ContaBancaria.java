public class ContaBancaria {
    private Integer numero;
    private String titular;
    private double saldo;

    public ContaBancaria(int numero, String titular, double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumero(){
        String numeroConta = String.valueOf(this.numero);
        if(numeroConta.length() < 6){
            while(numeroConta.length() < 6)
                numeroConta += "0";
        }
        return numeroConta;
    }

    public String getTitular(){
        return this.titular;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public static void criarConta(int numeroConta, String nomeTitular, double saldoInicial){
        ContaBancaria novaConta = new ContaBancaria(numeroConta,nomeTitular,saldoInicial);
        novaConta.imprimirDadosConta();
    }

    private void imprimirDadosConta(){
        System.out.println("Informações:");
        System.out.println("Conta: " + this.getNumero());
        System.out.println("Titular: " + this.getTitular());
        System.out.printf("Saldo: R$ %.1f", this.getSaldo());
    }
}
