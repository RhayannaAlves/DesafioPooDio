package celular;

public class Smartphone {

	    public static void main(String[] args) {
	       
	        Iphone iphone = new Iphone();

	        // Utilizando as funcionalidades do Iphone
	        iphone.tocar();
	        iphone.selecionarMusica("Nome da música");
	        iphone.pausar();

	        iphone.ligar("123456789");
	        iphone.atender();
	        iphone.iniciarCorreioVoz();

	        iphone.exibirPagina("https://www.google.com");
	        iphone.adicionarNovaAba();
	        iphone.atualizarPagina();
	    }

}
