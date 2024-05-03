/*7) Crie uma classe em Java chamada Data que inclui três atributos int: dia, mes e ano.
 * A classe deve ter métodos get e set para cada atributo.
 * Forneça um método displayData que exibe o dia, o mês e o ano separados por barras normais ( / ).
 * No setter do atributo dia (setDia), não permita que o dia seja maior que 31,
 * disparando uma exceção em casos que o valor passado por parâmetro seja maior que 31.
 * No setter do atributo mes (setMes), não permita que o mês seja maior que 12,
 * disparando uma exceção em casos que o valor passado por parâmetro seja maior que 12;
 * Crie uma exceção personalizada chamada DataInvalidaException.
 * */
public class Data {
	int day;
	int month;
	int year;
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day > 31) {
			
		} else {
			this.day = day;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month > 12) {
			
		} else {
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public Data(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void displayData() {
		System.out.println(this.day + '/' + this.month + '/' + this.year);
	}

}
