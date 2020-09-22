package entites;

public class opera {

	public int numero1;
	public int numero2;
	public int resultado;
	public String opcao;

	public int subtrair() {

		resultado = numero1 - numero2;

		
		return resultado;

	}

	public int adicao() {

		resultado = numero1 + numero2;

		return resultado;

	}
	
	public int multiplicar() {

		resultado = numero1 * numero2;

		return resultado;

	}
	
	public int dividir() {
		
		

		resultado = numero1 / numero2;

		return resultado;
		

	}
}
