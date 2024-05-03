
public class Car {

	public String marca;
	public String modelo;
	public int ano;
	public String cor;
	
	public Car() {
		
	}
	
	public Car(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public String acelerar() {
		return "Acelarando";
	}
	
	public String frear() {
		return "Freando";
	}
	
	// package protected for default so visible only from this package
	String buzinar() {
		return "Bii Biii";
	}
}
