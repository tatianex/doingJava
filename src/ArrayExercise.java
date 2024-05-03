import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercise {

	public static void main(String[] args) {
		ArrayExercise myArray = new ArrayExercise();
		myArray.invertNumbers();
	}
	
	/*
	 * Aula 4 - Exercícios Array Unidimensional:

1) Escreva um programa que cria um array com 10 números inteiros (números a sua escolha) e calcula a soma de todos os elementos desse array.
2) Escreva um programa que cria um array com 10 números double (números a sua escolha) e calcula a  média dos elementos.
3) Escreva um programa em que o usuário informa o tamanho do array, cria um array de inteiros com esse tamanho e peça para o usuário informar números até encher o array. Depois, calcula a soma e a média dos elementos.
4) Escreva um programa em que o usuário informa o tamanho do array, cria um array de doubles com esse tamanho e peça para o usuário informar números até encher o array. Depois, encontrar o maior e o menor elementos desse array.
5) Escreva um programa que cria um array de strings com 10 palavras a sua escolha, peça para o usuário digitar uma palavra e verifica se um essa palavra está presente nesse array.
6) Escreva um programa em que o usuário informa o tamanho do array, cria um array de inteiros com esse tamanho e peça para o usuário informar números até encher o array. Depois inverta a ordem dos elementos desse array.
7) Escreva um programa em que o usuário informa o tamanho do array, cria um array de inteiros com esse tamanho e peça para o usuário informar números até encher o array. Depois ordena os elementos em ordem crescente e decrescente.
8) Escreva um programa que cria um array com 10 números inteiros (números a sua escolha), peça para o usuário digitar um número e verifica se esse número existe no array. Caso positivo, remova esse número do array, mantendo a ordem dos outros elementos. Caso não exista, informe ao usuário que esse número não existe no array.
9) Escreva um programa que cria um array com 10 números inteiros (números a sua escolha), peça para o usuário digitar dois números e substitui todas as ocorrências do primeiro número no array pelo segundo número.
10) Escreva um programa em que o usuário informa o tamanho do array, cria um array de strings com esse tamanho e peça para o usuário informar palavras até encher o array. Depois ordena os elementos em ordem alfabética.
	 * */
	
	public void example() {
		// Declarando sem inicializar
		String[] nomes;
		int[] idades;
		double notas[];
		
		nomes = new String[5];
		idades = new int [5];
		notas = new double[10];
		
		// Declarando e inicializando (ainda sem valores)
		String[] names = new String[5];
		int[] ages = new int[5];
		double grades[] = new double[10];
		
		String[] lastNames = {"Jesus", "Souza", "Silva", "Matos", "Cordeiro"};
		int[] myInts = {9, 6, 5, 7, 4};
		double workHours[] = new double[] {8.3, 6, 4.5, 7.2, 8};
		int[] codes = new int[] {8, 91, 43, 888};
		
		System.out.println(nomes);
		System.out.println(idades);
		System.out.println(notas);
		
		System.out.println("-------");
		
		System.out.println(names);
		System.out.println(ages);
		System.out.println(grades);
		
		System.out.println("-------");
		
		System.out.println(lastNames[2]);
		System.out.println(myInts);
		System.out.println(workHours);
		System.out.println(codes);
		
	}
	
	 /* 1) Escreva um programa que cria um array com 10 números inteiros (números a sua escolha)
	  * e calcula a soma de todos os elementos desse array.
	  * */
	public void sumNumbers() {
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers = new int[10];
		int sum = 0;
		for (int index = 0; index < numbers.length; index++) {
			System.out.println("Informe um número: " + (index+1));
			numbers[index] = scanner.nextInt();
		}
		System.out.println("Os números informados foram: ");
		for (int number: numbers) {
			sum += number;
			System.out.print(number + " ");
		}
		System.out.println("Sua soma é: " + sum);
		System.out.println("Fim da aplicação");
		scanner.close();
	}
	
	/*2) Escreva um programa que cria um array com 10 números double (números a sua escolha)
	 * e calcula a  média dos elementos.
	 * */
	public void calculateNumbersMedia() {
		Scanner scanner = new Scanner(System.in);
		
		double[] numbers = new double[10];
		double media = 0;
		double mediaFormatted = 0;
		for (int index = 0; index < numbers.length; index++) {
			System.out.println("Informe um número: " + (index+1));
			numbers[index] = scanner.nextDouble();
		}
		System.out.println("Os números informados foram: ");
		for (double number: numbers) {
			media += number;
			System.out.print(number + " ");
		}
		
		media = media/numbers.length;
		// Formata a média para duas casas decimais
        DecimalFormat df = new DecimalFormat("#.##");
        String formattedMedia = df.format(media);
		
		System.out.println("Sua soma é: " + formattedMedia);
		System.out.println("Fim da aplicação");
		scanner.close();
	}
	
	/* 3) Escreva um programa em que o usuário informa o tamanho do array, 
	 * cria um array de inteiros com esse tamanho 
	 * e peça para o usuário informar números até encher o array. 
	 * Depois, calcula a soma e a média dos elementos.
	 * */
	
	public void calculateAndMakeMediaForNumbers() {
		Scanner scanner = new Scanner(System.in);
		
		// Pergunta o tamanho do array
		System.out.println("Informe o tamanho do array: ");
		int size = scanner.nextInt();
		
		int[] numbers = new int[size];
	
		// Pede para preencher o array
		System.out.println("Informe os números do array:");
		for (int index = 0; index < numbers.length; index++) {
			System.out.print("Número " + (index +1) + ": ");
			numbers[index] = scanner.nextInt();
		}
		
		// Calcula a soma
		int sum = 0;
		for (int number: numbers) {
			sum += number;
		}
				
		// Calcula a media
		double media = (double) sum/numbers.length;
		
		// Apresenta a soma e a média
		System.out.println("Sua soma é: " + sum);
		System.out.println("A média é: " + media);
		System.out.println("Fim da aplicação");
		
		scanner.close();
	}
	
	/* 4) Escreva um programa em que o usuário informa o tamanho do array,
	 *  cria um array de doubles com esse tamanho
	 *  e peça para o usuário informar números até encher o array.
	 *  Depois, encontrar o maior e o menor elementos desse array.
	 * */
	
	public void findTheBiggesAndSmallestNumber() {
		Scanner scanner = new Scanner(System.in);
		
		// Pergunta o tamanho do array
		System.out.println("Informe o tamanho do array: ");
		int size = scanner.nextInt();
		
		double[] numbers = new double[size];
		double biggestNumber = Double.MIN_VALUE;
		double smallestNumber = Double.MAX_VALUE;
		
		// Pede para preencher o array
		System.out.println("Informe os números do array:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Número " + (i +1) + ": ");
			numbers[i] = scanner.nextDouble();
			if (numbers[i] > biggestNumber) {
				biggestNumber = numbers[i];
			}
			if (numbers[i] < smallestNumber) {
				smallestNumber = numbers[i];
			}
		}
		
		System.out.println("The biggest number is: " + biggestNumber);
		System.out.println("The smallest number is: " + smallestNumber);
		System.out.println("Fim da aplicação");
		
		scanner.close();
	}
	
	/* 5) Escreva um programa que cria um array de strings com 10 palavras a sua escolha,
	 * peça para o usuário digitar uma palavra
	 * e verifica se essa palavra está presente nesse array.
	 * */
	public void verifyIfIsInTheList() {
		Scanner scanner = new Scanner(System.in);
		
		boolean found = false;
		
		String shoppingList[] = new String[] {
				"banana",
				"café",
				"arroz",
				"leite",
				"açucar",
				"iogurte",
				"água mineral",
				"óleo",
				"pimenta",
				"sal"
		};
		
		System.out.println("Informe um item: ");
		String listItem = scanner.nextLine();
				
		for (String item: shoppingList) {
			if (item.equalsIgnoreCase(listItem)) {
				found = true;
				break;
			}
		}
		
		if (found) {
			System.out.println("Já está na lista");
		} else {
			System.out.println("Não está na lista");
		}
		
		System.out.println("Fim da aplicação");
		
		scanner.close();
	}

	/* 6) Escreva um programa em que o usuário informa o tamanho do array,
	 * cria um array de inteiros com esse tamanho
	 * e peça para o usuário informar números até encher o array.
	 * Depois inverta a ordem dos elementos desse array. 
	 * */
	public void invertNumbers() {
		Scanner scanner = new Scanner(System.in);
		
		// Pergunta o tamanho do array
		System.out.println("Informe o tamanho do array: ");
		int size = scanner.nextInt();
		
		int[] numbers = new int[size];
	
		// Pede para preencher o array
		System.out.println("Informe os números do array:");
		for (int index = 0; index < numbers.length; index++) {
			System.out.print("Número " + (index +1) + ": ");
			numbers[index] = scanner.nextInt();
		}
		
		System.out.println("Array de trás pra frente:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
        
        System.out.println("Fim da aplicação");
		
		scanner.close();
	}
	
	/* 7) Escreva um programa em que o usuário informa o tamanho do array,
	 * cria um array de inteiros com esse tamanho
	 * e peça para o usuário informar números até encher o array.
	 * Depois ordena os elementos em ordem crescente e decrescente.
	 * */
	public void printIncreasingAndDecreasingNumbers() {
		Scanner scanner = new Scanner(System.in);
		
		// Pergunta o tamanho do array
		System.out.println("Informe o tamanho do array: ");
		int size = scanner.nextInt();
		
		int[] numbers = new int[size];
		
		// Pede para preencher o array
		System.out.println("Informe os números do array:");
		for (int index = 0; index < numbers.length; index++) {
			System.out.print("Número " + (index +1) + ": ");
			numbers[index] = scanner.nextInt();
		}
		
		System.out.println("Array normal");
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		
		// Verificar como 
		Arrays.sort(numbers);
		
		System.out.println();
		System.out.println("Array de trás pra frente:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
		System.out.println();
        
        System.out.println("Fim da aplicação");
		
		scanner.close();
	}
 	
	
	
	
	
	
	
	
	
	
	
	
	
}
