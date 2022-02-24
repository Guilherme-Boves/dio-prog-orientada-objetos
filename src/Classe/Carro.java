package Classe;

/**
 * 
 * @author Guilherme Boves
 * Classe de exemplo para o exercício sobre Orientação a Objetos
 */

class Carro {
	
	String cor;
	String modelo;
	int capacidadeTanque;

	
	public Carro() {}
	
	public Carro(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	
	public Carro(String cor, String modelo, int capacidadeTanque) {
		this.cor = cor;
		this.modelo = modelo;
		this.capacidadeTanque = capacidadeTanque;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	
	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public double calculaPrecoGasolina(double valorCombustivel) { 
		return getCapacidadeTanque() * valorCombustivel;
	}
	
	
}
