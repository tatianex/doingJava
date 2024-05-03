
public class Student {
	
	/*Exercício 1 de orientação a objetos:
	Faça um programa que peça o nome e três notas de um aluno, calcule a média e informe: (se a média for maior ou igual a 6: "Aluno aprovado". Caso contrário, "Aluno reprovado".
	Crie uma classe Aluno, com os seguintes atributos: nome do tipo string, nota1, nota2 e nota 3 do tipo double.
	Essa classe terá um método público calcularMedia, que retornará a média em double.
	Utilize encapsulamento, com os métodos get e set;
	Crie um construtor que receba todos os atributos por parâmetros;
	Crie um método substring mostrando o nome, as notas e a média.
	 * */

	private String name;
	private double firstGrade;
	private double secondGrade;
	private double thirdGrade;
	
	public Student(String name, double firstGrade, double secondGrade, double thirdGrade) {
		this.name = name;
		this.firstGrade = firstGrade;
		this.secondGrade = secondGrade;
		this.thirdGrade = thirdGrade;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public double calculateAverage() {
		double sum = firstGrade + secondGrade + thirdGrade;
		double average = sum/3;
		
		return Math.round(average * 100.0) / 100.0;
	}
	
	public String getResult() {
		double average = calculateAverage();
		return average >= 6? "Aluno aprovado" : "Aluno Reprovado";
	}
	
	public String toString() {
		StringBuilder message = new StringBuilder();
		message.append("Nome do aluno: ").append(name)
			.append(", Nota 1: ").append(firstGrade)
			.append(", Nota 2: ").append(secondGrade)
			.append(", Nota 3: ").append(thirdGrade)
			.append(", Média: ").append(calculateAverage());
		return message.toString();
	}
}
