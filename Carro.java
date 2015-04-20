package ProjetodeLoja;

import java.util.ArrayList;
import java.util.Scanner;

public class Carro {
	static Scanner input = new Scanner(System.in);
	   String Chassi;
	   String Montadora;
	   String Modelo;
	   String Tipo;
	   String Cambio;
	   float Preco;
	   float Motorizacao;
	   
	   public String getChassi() {
			return Chassi;
		}

		public void setChassi(String chassi) {
			Chassi = chassi;
		}

		public String getMontadora() {
			return Montadora;
		}

		public void setMontadora(String montadora) {
			Montadora = montadora;
		}

		public String getModelo() {
			return Modelo;
		}

		public void setModelo(String modelo) {
			Modelo = modelo;
		}

		public String getTipo() {
			return Tipo;
		}

		public void setTipo(String tipo) {
			Tipo = tipo;
		}

		public float getMotorizacao() {
			return Motorizacao;
		}

		public void setMotorizacao(float motorizacao) {
			Motorizacao = motorizacao;
		}

		public String getCambio() {
			return Cambio;
		}

		public void setCambio(String cambio) {
			Cambio = cambio;
		}

		public float getPreco() {
			return Preco;
		}

		public void setPreco(float preco) {
			Preco = preco;
		}
	   
	   
	   public Carro adicionarCarro(String Chassi,String Montadora,String Modelo,String Tipo,String Cambio,float Motorizacao,float Preco){
	   	Carro novo = new Carro();
	   	System.out.println("Digite o Chassi");
	    novo.setChassi(input.next());
	   	System.out.println("Digite a Montadora");
	    novo.setMontadora(input.next());
	   	System.out.println("Digite o Modelo");
	   	novo.setModelo(input.next());
	   	System.out.println("Digite o Tipo");
	   	novo.setTipo(input.next());
	   	System.out.println("Digite o Câmbio");
	   	novo.setCambio(input.next());
	   	System.out.println("Digite a Motorização(float)");
	   	novo.setMotorizacao(input.nextFloat());
	   	System.out.println("Digite o Preço(float)");
	   	novo.setPreco(input.nextFloat());
	   	return novo;
	   }
	   
	   public Carro listarEstoqueCarro(String Chassi,String Montadora,String Modelo,String Tipo,String Câmbio,float Motorização,float Preço,ArrayList<Carro> EstoqueCarros){
		 Carro listarCarros = new Carro();
		 for(Carro MostrarEstoque: EstoqueCarros){
			 System.out.println("Chassi: "+MostrarEstoque.getChassi());
		    	System.out.println("Montadora: "+MostrarEstoque.getMontadora());
		    	System.out.println("Modelo: "+MostrarEstoque.getModelo());
		    	System.out.println("Tipo: "+MostrarEstoque.getTipo());
		    	System.out.println("Câmbio: "+MostrarEstoque.getCambio());
		    	System.out.println("Motorização: "+MostrarEstoque.getMotorizacao());
		    	System.out.println("Preço: "+MostrarEstoque.getPreco());
		 }
		 return listarCarros;
	   }
	   
	   public static Carro PesquisarCarro(String Chassi,String Montadora,String Modelo,String Tipo,String Câmbio,float Motorização,float Preço,ArrayList<Carro> EstoqueCarros){
		 Carro pesquisarCarro = new Carro();
		    System.out.println("Digite o Chassi");
		    pesquisarCarro.setChassi(input.next());
		   	System.out.println("Digite a Montadora");
		   	pesquisarCarro.setMontadora(input.next());
		   	System.out.println("Digite o Modelo");
		   	pesquisarCarro.setModelo(input.next());
		   	System.out.println("Digite o Tipo");
		   	pesquisarCarro.setTipo(input.next());
		   	System.out.println("Digite o Câmbio");
		   	pesquisarCarro.setCambio(input.next());
		   	System.out.println("Digite a Motorização");
		   	pesquisarCarro.setMotorizacao(input.nextFloat());
		   	System.out.println("Digite o Preço");
		   	pesquisarCarro.setPreco(input.nextFloat());
		   	
		 for(Carro MostrarEstoque: EstoqueCarros){
			 if(Chassi == MostrarEstoque.getChassi() && Montadora == MostrarEstoque.getMontadora() && Modelo == MostrarEstoque.getModelo() && Tipo == MostrarEstoque.getTipo() && Câmbio == MostrarEstoque.getCambio() && Motorização == MostrarEstoque.getMotorizacao() && Preço == MostrarEstoque.getPreco()){
				 System.out.println("Esse Carro existe,pois acabou de achá-lo");
				 return pesquisarCarro;
			 }
		 }
		 System.out.println("Não achou o Carro,talvez ele não exista");
		 return pesquisarCarro;
	   }
	   
	   public static Carro BuscarCarro(String Chassi,ArrayList<Carro> EstoqueCarros){
		   Carro buscarcarro = new Carro();
		   System.out.println("Digite o Chassi que procura");
		   buscarcarro.setChassi(input.next());
		 for(Carro MostrarEstoque: EstoqueCarros){
			 if(Chassi == MostrarEstoque.getChassi()){
				 System.out.println("Achou o Carro com o Chassi");
				 return buscarcarro;
			 }
		 }
		System.out.println("Não achou o Carro com o Chassi");
		return buscarcarro;
		   
	   }
}
