package ProjetodeLoja;

import java.util.ArrayList;
import java.util.Scanner;

public class Motocicleta {
  static Scanner input = new Scanner(System.in);
    String ChassiMoto;
    String MontadoraMoto;
    String ModeloMoto;
    String TipoMoto; 
    String CorMoto;
    int Cilindrada;
    int CapacidadeTanque;
    float PrecoMoto;
    
    public String getChassiMoto() {
		return ChassiMoto;
	}

	public void setChassiMoto(String chassiMoto) {
		ChassiMoto = chassiMoto;
	}

	public String getMontadoraMoto() {
		return MontadoraMoto;
	}

	public void setMontadoraMoto(String montadoraMoto) {
		MontadoraMoto = montadoraMoto;
	}

	public String getModeloMoto() {
		return ModeloMoto;
	}

	public void setModeloMoto(String modeloMoto) {
		ModeloMoto = modeloMoto;
	}

	public String getTipoMoto() {
		return TipoMoto;
	}

	public void setTipoMoto(String tipoMoto) {
		TipoMoto = tipoMoto;
	}

	public String getCorMoto() {
		return CorMoto;
	}

	public void setCorMoto(String corMoto) {
		CorMoto = corMoto;
	}

	public int getCilindrada() {
		return Cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		Cilindrada = cilindrada;
	}

	public int getCapacidadeTanque() {
		return CapacidadeTanque;
	}

	public void setCapacidadeTanque(int capacidadeTanque) {
		CapacidadeTanque = capacidadeTanque;
	}

	public float getPrecoMoto() {
		return PrecoMoto;
	}

	public void setPrecoMoto(float precoMoto) {
		PrecoMoto = precoMoto;
	}
    
    public static Motocicleta adicionarMotocicleta(String ChassiMoto,String MontadoraMoto,String ModeloMoto,String TipoMoto,String CorMoto,int Cilindrada,int CapacidadeTanque,float PrecoMoto){
    	Motocicleta nova = new Motocicleta();
    	System.out.println("Digite o Chassi da Moto");
    	ChassiMoto = input.next();
    	System.out.println("Digite a Montadora da Moto");
    	MontadoraMoto = input.next();
    	System.out.println("Digite o Modelo da Moto");
    	ModeloMoto = input.next();
    	System.out.println("Digite o Tipo da Moto");
    	TipoMoto = input.next();
    	System.out.println("Digite a Cor da Moto");
    	CorMoto = input.next();
    	System.out.println("Digite a Cilindrada da Moto(valor inteiro)");
    	Cilindrada = input.nextInt();
    	System.out.println("Digite a Capacidade do Tanque");
    	CapacidadeTanque = input.nextInt();
    	System.out.println("Digite o Preço da Moto");
    	PrecoMoto = input.nextFloat();
    	return nova;
    }
    
    public static Motocicleta listarMotocicleta(ArrayList<Motocicleta> EstoqueMotos){
    	Motocicleta listarmotos = new Motocicleta();
    	for(Motocicleta MostrarMotos: EstoqueMotos){
    	System.out.println("Chassi: "+MostrarMotos.getChassiMoto());
    	System.out.println("Montadora: "+MostrarMotos.getMontadoraMoto());
    	System.out.println("Modelo: "+MostrarMotos.getModeloMoto());
    	System.out.println("Tipo: "+MostrarMotos.getTipoMoto());
    	System.out.println("Cor: "+MostrarMotos.getCorMoto());
    	System.out.println("Cilindrada: "+MostrarMotos.getCilindrada());
    	System.out.println("Capacidade do Tanque: "+MostrarMotos.getCapacidadeTanque());
    	System.out.println("Preço da Moto: "+MostrarMotos.getPrecoMoto());
    	}
    	return listarmotos;
    }
    
    public static Motocicleta pesquisarMotocicleta(String ChassiMoto,String MontadoraMoto,String ModeloMoto,String TipoMoto,String CorMoto,int Cilindrada,int CapacidadeTanque,float PrecoMoto){
    	Motocicleta pesquisarMoto = new Motocicleta();
    	System.out.println("Digite o Chassi da Moto");
    	ChassiMoto = input.next();
    	System.out.println("Digite a Montadora da Moto");
    	MontadoraMoto = input.next();
    	System.out.println("Digite o Modelo da Moto");
    	ModeloMoto = input.next();
    	System.out.println("Digite o Tipo da Moto");
    	TipoMoto = input.next();
    	System.out.println("Digite a Cor da Moto");
    	CorMoto = input.next();
    	System.out.println("Digite a Cilindrada da Moto(valor inteiro)");
    	Cilindrada = input.nextInt();
    	System.out.println("Digite a Capacidade do Tanque");
    	CapacidadeTanque = input.nextInt();
    	System.out.println("Digite o Preço da Moto");
    	PrecoMoto = input.nextFloat();
    	for(Motocicleta pesquisa: Loja.EstoqueMotos){
    		if(ChassiMoto.equals(pesquisa.getChassiMoto()) && MontadoraMoto.equals(pesquisa.getMontadoraMoto()) && ModeloMoto.equals(pesquisa.getModeloMoto()) && TipoMoto.equals(pesquisa.getTipoMoto()) && CorMoto.equals(pesquisa.getCorMoto()) && Cilindrada == pesquisa.getCilindrada() && CapacidadeTanque == pesquisa.getCapacidadeTanque() && PrecoMoto == pesquisa.getPrecoMoto()){
    			System.out.println("Você achou a Moto que procurava");
    			return pesquisarMoto;
    		}
    	}
    	System.out.println("Você não achou a Moto que procurava,talvez ela não exista");
    	return pesquisarMoto;
    }
    
    public static Motocicleta buscarMotocicleta(String ChassiMoto,ArrayList<Motocicleta> EstoqueMotos){
    	Motocicleta buscarMoto = new Motocicleta();
    	System.out.println("Digite o Chassi que procura da moto");
    	ChassiMoto = input.next();
    	for(Motocicleta buscar: EstoqueMotos){
    		if(ChassiMoto.equals(buscar.getChassiMoto())){
    			System.out.println("Você achou a moto com o chassi");
    			return buscarMoto;
    		}
    	}
    	System.out.println("Não achou a moto com o chassi");
		return buscarMoto;
    }
    
}
