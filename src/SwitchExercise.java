import java.util.Scanner;

public class SwitchExercise {
	public static void main(String[] args) {
		SwitchExercise menu = new SwitchExercise();
		
		//menu.bankMenu();
		//menu.soccerMenu();
		menu.ternaryExample();
		
	}
	
	public void bankMenu() {
		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);
		
		// Prompt the user to enter an option
		System.out.println("Digite uma opção:\n +"
					+ "1.SACAR \n"
					+ "2.DEPOSITAR\n"
					+ "3.VERIFICAR SALDO"
				);
		
		// Read the input number from the user
		int option = Integer.parseInt(scanner.nextLine());
		
		// Check what option to present
		switch(option) {
			case 1: 
				System.out.println("Você escolheu a opção sacar");
				break;
			case 2:
				System.out.println("Você escolheu a opção depositar");
				break;
			case 3: 
				System.out.println("Você escolheu a opção verificar saldo");
				break;
			default:
				System.out.println("Opção inválida");
				break;
		}
		
		// Ending message
		System.out.println("Fim da aplicação");
	}
	
	public void soccerMenu() {
		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);
		
		// Prompt the user to make the question
		System.out.println("Digite qual o nome de um dos três países com mais títulos da copa do mundo?\n");
		
		// Read what the user typed
		String country = scanner.next();
		
		// Close scanner to prevent memory leak
		scanner.close();
		
		// Choose what to present
		switch(country.toLowerCase()) {
			case "itália": 
			case "italia":
			case "brasil":
			case "alemanha": 
				System.out.println("Parabéns você acertou!");
				break;
			default:
				System.out.println("Este não é um dos países com mais copas do mundo");
				break;
		}
		
		// Ending message
		System.out.println("Fim da aplicação");
		
	}
	
	public void ternaryExample() {
		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);
		
		// Prompt the user to make the question
		System.out.println("Informe sua idade: \n");
			
		// Read what the user typed
		int age = Integer.parseInt(scanner.nextLine());
		
		String message = age > 17 ? "maior de idade" : "menor de idade";
		System.out.println("Você é " + message);
		
		// Ending message
		System.out.println("Fim da aplicação");
	}
}

