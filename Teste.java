package ProjetodeLoja;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	       int i;
		   int quantidade;
		   String resposta;  
		   
                System.out.println("Digite a quantidade de carros que você queira adicionar");
                quantidade = input.nextInt();
                for(i = 1;i <= quantidade;i++){
                Carro addcarro = Carro.adicionarCarro( "" , "" , "" , "" , "" , 0 , 0 );//aqui eu chamei o método adicionarCarro e atribui os valores para a variavel do tipo carro para adicionar facilmente na ArrayList do tipo Carro
                Loja.EstoqueCarros.add(addcarro);
                }
                
                if(Loja.EstoqueCarros.size() > 0){
                System.out.println("Você quer listar o(s) Carro(s)?");
                resposta = input.next();
                if(resposta.equals("sim")){
                Carro.listarEstoqueCarro(Loja.EstoqueCarros); //método para listar o estoque de carros que você adicionou
                }
                }
                
                if(Loja.EstoqueCarros.size() > 0){
                System.out.println("Você quer Pesquisar um Carro?");
                resposta = input.next();
                if(resposta.equals("sim")){
                   Carro.PesquisarCarro( "" , "" , "" , "" , "" , 0 , 0 , Loja.EstoqueCarros ); //método para pesquisar o carro
                }
                }
                
                if(Loja.EstoqueCarros.size() > 0){
                System.out.println("Você quer Buscar um Carro pelo Chassi?");
                resposta = input.next();
                if(resposta.equals("sim")){
                   Carro.BuscarCarro( "" , Loja.EstoqueCarros );         
                }
                }
                
                if(Loja.EstoqueMotos.size() > 0){
                System.out.println("Digite a quantidade de motos que você queira adicionar");
                quantidade = input.nextInt();
                for(i = 0;i <= quantidade;i++){
                	Motocicleta addmotos = Motocicleta.adicionarMotocicleta( "" , "" , "" , "" , "" , 0 , 0 , 0 );
                	Loja.EstoqueMotos.add(addmotos);
                }
                }
                
                if(Loja.EstoqueCarros.size() > 0){
                System.out.println("Você quer listar a(s) Moto(s)?");
                resposta = input.next();                
                if(resposta.equals("sim")){
                	Motocicleta.listarMotocicleta( Loja.EstoqueMotos );
                }
                }
                
                if(Loja.EstoqueMotos.size() > 0){
                	System.out.println("Você quer pesquisar uma Moto?");
                	resposta = input.next();
                	if(resposta.equals("sim")){
                		Motocicleta.pesquisarMotocicleta( "" , "" , "" , "" , "" , 0 , 0 , 0 );
                	}
                }
                
                if(Loja.EstoqueMotos.size() > 0){
                	System.out.println("Você quer buscar uma moto pelo chassi?");
                	resposta = input.next();
                	if(resposta.equals("sim")){
                		Motocicleta.buscarMotocicleta( "" , Loja.EstoqueMotos );
                	}
                }
                input.close();//sempre tem que fechar o input no final do código
            }
	  }
