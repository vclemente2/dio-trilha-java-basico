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

        System.out.println("Conta Bancária:");
        novaConta.exibirInformacoes();
    }

    protected void exibirInformacoes(){
        System.out.println(this.getTitular());
        System.out.println(this.getNumero());
        System.out.printf("Saldo: R$ %.1f\n", this.getSaldo());
    }
}
