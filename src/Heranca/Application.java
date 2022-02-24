package Heranca;

public class Application {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		Moto moto = new Moto();
		Caminhao caminhao = new Caminhao();
		
		carro.acelerar();
		moto.acelerar();
		caminhao.acelerar();
		
		moto.setCapacidadeTanque(15);
		System.out.println(moto.getCapacidadeTanque()); 
	
		
	}
}
