package ProjetodeLoja;

import java.util.ArrayList; //para eu poder passar arraylist(s) como parâmetro para os métodos
import java.util.Scanner; //nem preciso explicar o pq,né?

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
	   
	   
	   public static Carro adicionarCarro(String Chassi,String Montadora,String Modelo,String Tipo,String Cambio,float Motorizacao,float Preco){ //método para adicionar o carro na instância do tipo Carro,e eu usei static para o método ser acessado por qualquer classe sem precisar instânciá-lo em todas as classes que eu vou utilizar,e com isso economizo área na Memória Principal
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
	   	System.out.println("Digite a Motorização(ponto flutuante)");
	   	novo.setMotorizacao(input.nextFloat());
	   	System.out.println("Digite o Preço(ponto flutuante)");
	   	novo.setPreco(input.nextFloat());
	   	return novo;
	   }
	   
	   public static Carro listarEstoqueCarro(ArrayList<Carro> EstoqueCarros){
		 Carro listarCarros = new Carro();
		 for(Carro MostrarEstoque: EstoqueCarros){
			    System.out.println("Chassi: "+MostrarEstoque.getChassi());
		    	System.out.println("Montadora: "+MostrarEstoque.getMontadora());
		    	System.out.println("Modelo: "+MostrarEstoque.getModelo());
		    	System.out.println("Tipo: "+MostrarEstoque.getTipo());
		    	System.out.println("Câmbio: "+MostrarEstoque.getCambio());
		    	System.out.println("Motorização: "+MostrarEstoque.getMotorizacao());
		    	System.out.println("Preï¿½o: "+MostrarEstoque.getPreco());
		 }
		 return listarCarros;
	   }
	   
	   public static Carro PesquisarCarro(String _Chassi,String _Montadora,String _Modelo,String _Tipo,String _Câmbio,float _Motorização,float _Preço,ArrayList<Carro> _EstoqueCarros){ // método para pesquisar carro com o static para acessá-lo de qualquer classe
		 Carro pesquisarCarro = new Carro();
		    System.out.println("Digite o Chassi");
		    _Chassi = input.next();
		   	System.out.println("Digite a Montadora");
		   	_Montadora = input.next();
		   	System.out.println("Digite o Modelo");
		   	_Modelo = input.next();
		   	System.out.println("Digite o Tipo");
		   	_Tipo = input.next();
		   	System.out.println("Digite o Câmbio");
		   	_Câmbio = input.next();
		   	System.out.println("Digite a Motorização(float)");
		   	_Motorização = input.nextFloat();
		   	System.out.println("Digite o Preço(float)");
		   	_Preço = input.nextFloat();
		   	
		 for(Carro MostrarEstoque: _EstoqueCarros){
			 if(_Chassi.equals(MostrarEstoque.getChassi()) && _Montadora.equals(MostrarEstoque.getMontadora()) && _Modelo.equals(MostrarEstoque.getModelo()) && _Tipo.equals(MostrarEstoque.getTipo()) && _Câmbio.equals(MostrarEstoque.getCambio()) && _Motorização == MostrarEstoque.getMotorizacao() && _Preço == MostrarEstoque.getPreco()){
				 System.out.println("Esse Carro existe,pois acabou de acha-lo");
				 return pesquisarCarro;
			 }
		 }
		 System.out.println("Não achou o Carro,talvez ele não exista");
		 return pesquisarCarro;
	   }
	   
	   public static Carro BuscarCarro(String Chassi,ArrayList<Carro> EstoqueCarros){
		   Carro buscarcarro = new Carro(); //eu criei essa instância para usar todas as váriáveis do carro e para poder retornar algo para o método
		   System.out.println("Digite o Chassi que procura");
		   buscarcarro.setChassi(input.next());
		   for(Carro MostrarEstoque: EstoqueCarros){ //loop para rodar toda a arraylist de EstoqueCarros 
			 if(Chassi.equals(MostrarEstoque.getChassi())){ //comparar o chassi digitado pelo chassi de cada indice da arraylist
				 System.out.println("Achou o Carro com o Chassi");
				 return buscarcarro; 
			 }
		 }
		System.out.println("Não achou o Carro com o Chassi");
		return buscarcarro;
		   
	   }
}
