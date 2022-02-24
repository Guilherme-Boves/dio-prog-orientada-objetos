package Classe;

public class Application {

	public static void main(String[] args) {

		Carro car = new Carro();
		
		car.setCor("Cinza");
		car.setModelo("Civic");
		car.setCapacidadeTanque(40);
		
		System.out.println("Cor: " + car.getCor());
		System.out.println("Modelo: " + car.getModelo());
		System.out.println("Capacidade do Tanque: " + car.getCapacidadeTanque() + "L");
		System.out.println("Preço Gasolina: R$" + car.calculaPrecoGasolina(1.99));

		Carro car2 = new Carro("Vermelho", "BMW", 20);
				
		System.out.println("\nCor: " + car2.getCor());
		System.out.println("Modelo: " + car2.getModelo());
		System.out.println("Capacidade do Tanque: " + car2.getCapacidadeTanque() + "L");
		System.out.println("Preço Gasolina: R$" + car2.calculaPrecoGasolina(6.29));
		
	}

}
