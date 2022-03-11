package br.com.ZTesting;

public class MainZTesting extends Requisicao {
	
	public static void main(String[] args) {
		
		System.out.println("==================================================================");
		System.out.println("                            ZTESTING                              ");
		System.out.println("==================================================================\n");
		System.out.println();
		
		System.out.println("============================TUTORIAL==============================\n");
		System.out.println();
		System.out.println("1- Na barra de pesquisa do Windows digite -Gerenciador de tarefas");
		System.out.println("2- Abra a aba -Desempenho-");
		System.out.println("3- Clique em -CPU- para ver seu processador");
		System.out.println("4- Clique em -Memoria- para ver sua memoria Ram");
		System.out.println("5- Clique em -GPU- para ver sua placa de vídeo");
		System.out.println("\n==================================================================\n");
		Requisicao p = new Requisicao();
		
		p.rodaOuNao();
	}
	
}
