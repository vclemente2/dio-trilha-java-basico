public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

//        Testando métodos da interface AparelhoTelefonico
        meuIphone.atender();
        meuIphone.ligar();
        meuIphone.iniciarCorreioVoz();

//        Testando métodos da interface NavegadorInternet
        meuIphone.exibirPagina();
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();

//        Testando métodos da interface ReprodutorMusical
        meuIphone.selecionarMusica(
                1
        );
        meuIphone.tocar();
        meuIphone.pausar();

    }
}