package br.com.ZTesting;

public class Requisicao extends Pergunta {	
	
	void rodaOuNao() {
		Requisicao p = new Requisicao();
		
		p.escolhaMarcaProcessador();
		p.escolhaPlacaDeVideo();
		p.escolhaMemoriaRam();
		
		//Funciona
		if(p.getE() >= 2 && p.getV() >= 2 && p.getM() >= 4) {
			System.out.println("Hora de jogar!!!!");
			System.out.println("Seu computador comporta o jogo Valorant!!!");
		}
		//Não funciona por causa do processador
		else if(p.getE() < 2 && p.getV() >= 2 && p.getM() >= 4) {
			System.out.println("Game Over :(");
			System.out.println("Sua placa de vídeo e memoria Ram são suficientes, "
					+ "mas seu processador está abaixo do mínimo exigido pelo Valorant.");			
		}
		//Não funciona por causa da Placa de Vídeo
		else if(p.getE() >= 2 && p.getV() < 2 && p.getM() >= 4) {
			System.out.println("Game Over :(");
			System.out.println("Seu processador e memoria Ram são suficientes, "
					+ "mas sua placa de vídeo está abaixo do mínimo exigido pelo Valorant.");
		}
		//Não funciona por causa da memoria RAM
		else if(p.getE() >= 2 && p.getV() >= 2 && p.getM() < 4) {
			System.out.println("Game Over :(");
			System.out.println("Seu processador e placa de vídeo são suficientes, "
					+ "mas sua memoria Ram está abaixo do mínimo exigido pelo Valorant.");		
		}
		//Não funcina por causa do processador e placa de video
		else if(p.getE() < 2 && p.getV() < 2 && p.getM() >= 4) {
			System.out.println("Game Over :(");
			System.out.println("Sua memoria Ram é suficiente, "
					+ "mas seu processador e placa de vídeo estão abaixo do mínimo exigido pelo Valorant.");			
		}
		//Não funcina por causa do processador e memoria RAM
		else if(p.getE() < 2 && p.getV() >= 2 && p.getM() < 4) {
			System.out.println("Game Over :(");
			System.out.println("Sua placa de vídeo é suficiente, "
					+ "mas seu processador e memoria Ram estão abaixo do mínimo exigido pelo Valorant.");			
		}
		//Não funcina por causa da placa de video e memoria RAM
		else if(p.getE() >= 2 && p.getV() < 2 && p.getM() < 4) {
			System.out.println("Game Over :(");
			System.out.println("Sua placa de vídeo é suficiente, "
					+ "mas seu processador e memoria Ram estão abaixo do mínimo exigido pelo Valorant.");			
		}
		else {
			System.out.println("Game Over :(");
			System.out.println("Seu computador não cumpre nenhum dos requisitos de Valorant");
		}
	}
}
