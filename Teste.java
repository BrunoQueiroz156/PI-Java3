package ProjetodeLoja;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		int quantidade;
		String resposta;
                Scanner input = new Scanner(System.in);
                Carro carro = new Carro();
                ArrayList<Carro> EstoqueCarros = new ArrayList<>();
                //ArrayList<Motocicleta> EstoqueMotos = new ArrayList<>();              
                System.out.println("Digite a quantidade de carros que você queira adicionar");
                quantidade = input.nextInt();
                for(int i = 0;i < quantidade;i++){
                Carro addcarro = carro.adicionarCarro( "" , "" , "" , "" , "" , 0 , 0 );//aqui eu chamei o método adicionarCarro e atribui os valores para a variavel do tipo carro para adicionar facilmente na ArrayList do tipo Carro
                EstoqueCarros.add(addcarro);
                }
                
                System.out.println("Você quer listar o Carro?");
                resposta = input.next();
                if(resposta.equals("sim")){
                carro.listarEstoqueCarro( "" , "" , "" , "" , "" , 0 , 0 , EstoqueCarros ); //método para listar o estoque de carros que você adicionou
                }
                
               
                System.out.println("Você quer Pesquisar um Carro?");
                resposta = input.next();
                if(resposta.equals("sim")){
                   carro.PesquisarCarro( "" , "" , "" , "" , "" , 0 , 0 , EstoqueCarros ); //método para pesquisar o carro
                }
                          
                System.out.println("Você quer Buscar um Carro pelo Chassi?");
                resposta = input.next();
                if(resposta.equals("sim")){
                   carro.BuscarCarro( "" , EstoqueCarros );
                   input.close();//sempre tem que fechar o input no final do código
                }
            }
	  }
//}
