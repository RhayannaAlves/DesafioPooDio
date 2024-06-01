package celular;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {


    public void tocar() {
        System.out.println("O Iphone está tocando música");
    }

    public void pausar() {
    	System.out.println("A música está pausada");
    }

    public void selecionarMusica(String musica) {
    	System.out.println("Selecionando uma música");
    }

    public void ligar(String numero) {
    	System.out.println("O Iphone está ligando");
    }

    public void atender() {
    	System.out.println("Atendendo a ligação");
    }

    public void iniciarCorreioVoz() {
    	System.out.println("Iniciando correio de voz");
    }

    public void exibirPagina(String url) {
    	System.out.println("Navegador: exibindo página");
    }

    public void adicionarNovaAba() {
    	System.out.println("Navegador: adicionando nova aba");
    }

    public void atualizarPagina() {
    	System.out.println("Navegador: atualizando página");
    }
	    

}
