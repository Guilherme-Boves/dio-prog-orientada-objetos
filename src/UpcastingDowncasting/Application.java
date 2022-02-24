package UpcastingDowncasting;

public class Application {

	public static void main(String[] args) {
		
		
		Funcionario funcionario = new Funcionario();
		
		/* Upcasting */
		Funcionario gerente = new Funcionario();
		Funcionario vendedor = new Funcionario();
		Funcionario faxineiro = new Funcionario();
		
		/* Downcasting */
		//Gerente gerente_ = new Funcionario();
		//Vendedor vendedor_ = (Vendedor) new Funcionario();
	}
}
