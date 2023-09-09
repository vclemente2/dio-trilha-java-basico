public class ContaPoupanca extends ContaBancaria{
    private float taxaJuros;

    public ContaPoupanca(int numero, String titular, double saldo, float taxaJuros){
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public static void criarConta(int numeroConta, String titularConta, double saldoInicial, float taxaJuros   ){
        ContaPoupanca novaConta = new ContaPoupanca(numeroConta,titularConta,saldoInicial,taxaJuros);

        System.out.println("Conta Poupanca:");
        novaConta.exibirInformacoes();
    };
    public String getTaxaJuros(){
        String taxaJuros = String.valueOf(this.taxaJuros) + "%";
        return taxaJuros;
    }
    @Override
    protected void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Taxa de juros: " + this.getTaxaJuros());
    }
}
