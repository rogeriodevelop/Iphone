public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{


    @Override
    public void ligar() {
        System.out.println("ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Iniciando correrio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("pausando");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("selecionando Musica");
    }
}
