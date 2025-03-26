package desafio.celular;

public class Celular implements ReprodutorMusical, NavegadorNaInternet, AparelhoTelefonico {

	@Override
	public void ligar(String numero) {
		System.out.println("ligando para " + numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
	}

	@Override
	public void exibrPagina(String url) {
		System.out.println("Exbindo a página " + url);
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova página");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizano página");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando muusica");
		
	}

	@Override
	public void pausar() {

		System.out.println("Pausando a musica");		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Seelecionando a musica " + musica);
		
	}
	
}
