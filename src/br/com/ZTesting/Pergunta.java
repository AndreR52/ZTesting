package br.com.ZTesting;

import java.util.Scanner;

public class Pergunta {
	
	 Scanner entrada= new Scanner(System.in);
	 
	 private char marcaProcessador;
	 private char marcaPlaca;
	 private char modeloPlaca;
	 private char modeloProcessador;
	 private double memoriaRam;
	 
	 
	 void escolhaMarcaProcessador () {
		 System.out.println("Qual a Marca do seu processador?\n1.Intel\n2.AMD");
		 marcaProcessador = entrada.next().charAt(0);
		 
		 while(getMarcaProcessador() != '1' && getMarcaProcessador() != '2') {
			 System.out.println("Valor digitado invalido. \nQual o Marca do seu processador?\n1.Intel\n2.AMD");
			 setMarcaProcessador(entrada.next().charAt(0));	
		 }
		 
		 if(getMarcaProcessador() == '1') {
			 escolhaProcessadorIntel();
		 }
		 
		 else {
			 escolhaProcessadorAMD();
			 
		 }	 
	 }
	 
	 void escolhaProcessadorIntel () { 
	 
			 System.out.println("Selecione o Modelo Intel do seu processador:");
			 System.out.println("1.Core 2 duo E4500\n2.I3 4330\n3.i5-8400");
			 setModeloProcessador(entrada.next().charAt(0));
			 
			 while(getModeloProcessador() != '1' && getModeloProcessador() != '2' && getModeloProcessador()!= '3') {
				 System.out.println("Valor digitado invalido. \nQual o Modelo do seu processador?");
				 System.out.println("1.Core 2 duo E4500\n2.I3 4330\n3.i5-8400");
				 setModeloProcessador(entrada.next().charAt(0));	
			 }			 
	 }
			 
	void escolhaProcessadorAMD() {
		
			 System.out.println("Selecione o Modelo AMD do seu processador:");
			 System.out.println("1.Athlon 64 X2 4800 plus\n2.ryzen 3 1200\n3.ryzen 3 3300x");
			 setModeloProcessador(entrada.next().charAt(0));	
			 
			 while(getModeloProcessador() != '1' && getModeloProcessador() != '2' && getModeloProcessador()!= '3') {
				 System.out.println("Valor digitado invalido. \nQual o Modelo do seu processador?");
				 System.out.println("1.Athlon 64 X2 4800 plus\n2.ryzen 3 1200\n3.ryzen 3 3300x");
				 setModeloProcessador(entrada.next().charAt(0));	
			 }
	 }
	
	void escolhaPlacaDeVideo() {
		
		System.out.println("Qual a marca da sua placa de vídeo? \n1.Integrada \n2.Nvidia \n3.AMD");
		setMarcaPlaca(entrada.next().charAt(0));
		
		 while(getMarcaPlaca() != '1' && getMarcaPlaca() != '2' && getMarcaPlaca() != '3') {
			 System.out.println("Valor digitado invalido. \nQual o Marca da sua placa de vídeo?\n1.Integrada\n2.Nvidia\n3.AMD");
			 setMarcaPlaca(entrada.next().charAt(0));	
		 }
		 
		 if(getMarcaPlaca() == '2') {
			 
			 escolhaPlacaDeVideoNvidia();
			
		 }
		 
		 else if(getMarcaPlaca() == '3') {
			 
			 escolhaPlacaDeVideoAMD();
			 			 
		 }
		 
		 else {
			 
		 }		 
	}

	void escolhaPlacaDeVideoNvidia() {
		
		 System.out.println("Selecione o Modelo Nvidia da sua Placa de Vídeo:");
		 System.out.println("1.Geforce GT 520\n2.Geforce GT 730\n3.Geforce GTX 650");
		 setModeloPlaca(entrada.next().charAt(0));
		 
		 while(getModeloPlaca() != '1' && getModeloPlaca() != '2' && getModeloPlaca()!= '3') {
			 System.out.println("Valor digitado invalido. \nQual o Modelo da sua Placa de Vídeo?");
			 System.out.println("1.Geforce GT 520\n2.Geforce GT 730\n3.Geforce GTX 650");
			 setModeloPlaca(entrada.next().charAt(0));	
		 }		
	}
	
	void escolhaPlacaDeVideoAMD() {
		
		 System.out.println("Selecione o Modelo AMD da sua Placa de Vídeo:");
		 System.out.println("1.Geforce GT 520\n2.Geforce GT 730\n3.Geforce GTX 650");
		 setModeloPlaca(entrada.next().charAt(0));
		 
		 while(getModeloPlaca() != '1' && getModeloPlaca() != '2' && getModeloPlaca()!= '3') {
			 System.out.println("Valor digitado invalido. \nQual o Modelo da sua Placa de Vídeo?");
			 System.out.println("1.Radeon HD 5570\n2.Radeon R7 240\n3.Radeon RX 550");
			 setModeloPlaca(entrada.next().charAt(0));	
		 }		
	}
	
	void escolhaMemoriaRam() {
		
		System.out.println("Digite o valor da sua memoria RAM: ");
		setMemoriaRam(entrada.nextDouble());
		
		if(getMemoriaRam() % (int)getMemoriaRam() == 1) {
			System.out.println("teste");
			
		}
	}
	

	public char getMarcaProcessador() {
		return marcaProcessador;
	}

	public void setMarcaProcessador(char marcaProcessador) {
		this.marcaProcessador = marcaProcessador;
	}

	public char getModeloProcessador() {
		return modeloProcessador;
	}

	public void setModeloProcessador(char modeloProcessador) {
		this.modeloProcessador = modeloProcessador;
	}

	public char getMarcaPlaca() {
		return marcaPlaca;
	}

	public void setMarcaPlaca(char marcaPlaca) {
		this.marcaPlaca = marcaPlaca;
	}

	public char getModeloPlaca() {
		return modeloPlaca;
	}

	public void setModeloPlaca(char modeloPlaca) {
		this.modeloPlaca = modeloPlaca;
	}

	public double getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(double memoriaRam) {
		this.memoriaRam = memoriaRam;
	}
	
}
