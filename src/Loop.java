import java.util.Scanner;

public class Loop {

	public void MakeItWhile() {
//		int number = 0;
//		while(number < 1000) {
//			number ++;
//			System.out.println(number);
//		}
		
		// FOR IS INDICATED TO USE WHEN I KNOW HOW MANY TIMES I WANT TO DO SOMETHING
		for (int number = 0; number < 1000; number++) {
			System.out.println(number);
		}
	}
	
	public void MakeItDoWhile() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número");
		
		int firstNumber = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Digite o segundo número");
		
		int secondNumber = Integer.parseInt(scanner.nextLine());
		
		// WHILE IS INDICATED WHEN I DO NOT KNOW HOW MANY TIMES I WILL LOOP
		do {
			System.out.println(firstNumber++);
		} while (firstNumber < secondNumber);

	}
	
	public void printOddNumbers() {
		int number = 101;
		
		while (number <= 200) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
            number++;
        }
	}
	
	public void multiplyAndPrint() {
		Scanner scanner = new Scanner(System.in);

		int number = 0;
		
		while (number > -1) {
			System.out.println("Digite um número");
			number = Integer.parseInt(scanner.nextLine());
			if (number > -1) {
				System.out.println(number + " x 5 = " + number * 5);
			} else {
				System.out.println(
						"Não é possível com números negativos\n"
						+ "Fim da aplicação"
				);
				break;
			}
		}
		scanner.close();
	}
	
	public void printNumbers() {
		
		for (int number = 1000; number > 99; number--) {
			System.out.println(number);
		}
	}
	
	public void printEvenNumbers() {		
		for(int number = 0; number < 201; number++) {
            if (number %2 == 0) {
            	System.out.println(number);
            }
        }
	}
	
	public void MakeItRepeat() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número");
		
		int firstNumber = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Digite o segundo número");
		
		int secondNumber = Integer.parseInt(scanner.nextLine());
		
		for (int actualNumber = firstNumber; actualNumber <= secondNumber; actualNumber++) {
			System.out.println(actualNumber);
		}
	}
	
	public void printUntil100() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}
	
	public void printUntilJustOdd100() {
		for (int i = 1; i <= 100; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
	
	public void makeStandardX() {
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("X");
			}
			System.out.println();
		}
		
//		String desenho = "";
//		
//		for (int indice = 0; indice <= 5; indice ++) {	
//			desenho = desenho + "X";			
//			System.out.println(desenho);
//		}
	}
	
	public void makeStandardDollarBill() {
		for (int i = 5; i >= 1; i--) {
			for (int j = i; j >= i; j--) {
				System.out.print("X");
			}
			System.out.println();
		}
	}
	
	public void firstArray() {
		// só declarar sem inicializar
		String[] names = new String[5];
		int[] idades;
		
		// declarando e inicializando
		double grades[] = new double[20];
		
		// de forma literal
		int[] codigos = new int[]{100, 3, 234567, 123};
	}
}
