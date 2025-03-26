package desafio;

import desafio.celular.Celular;

public class Main {
	public static void main(String[] args) {
		Celular iphone = new Celular();
		iphone.ligar("35 99999999");
		iphone.atender();
		iphone.iniciarCorreioVoz();
		iphone.exibrPagina("https://github.com");
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica("Onde Anda Voce");
		
	}
}
