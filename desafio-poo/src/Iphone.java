public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    @Override
    public void ligar() {
        System.out.println("Ligando do meu Iphone.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo meu Iphone.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no meu Iphone.");
    }

    @Override
    public void exibirPagina() {
       System.out.println("Abrindo página no meu Iphone.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no meu Iphone.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no meu Iphone.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música no meu Iphone.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música no meu Iphone.");
    }

    @Override
    public void selecionarMusica(Integer numeroMusica) {
        System.out.println("Musica de número " + numeroMusica + " selecionada.");
    }
}
