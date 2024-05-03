import java.util.ArrayList;
import java.util.Scanner;

public class ArrayAndListExercise {

	/*
	 * 1) Escreva um programa que cria um ArrayList de strings e insira nomes de
	 * frutas. Peça ao usuário para digitar o nome de uma fruta e verifique se essa
	 * fruta está presente no ArrayList.
	 */
	public static void verificarSeJaEstaNaLista(Scanner scanner) {

		boolean found = false;

		ArrayList<String> listaDaFeira = new ArrayList<>();

		listaDaFeira.add("maçã");
		listaDaFeira.add("banana");
		listaDaFeira.add("morango");
		listaDaFeira.add("uva");
		listaDaFeira.add("abacaxi");

		System.out.println("Digite o nome de uma fruta:");

		String frutaPesquisada = scanner.nextLine();

		for (String item : listaDaFeira) {
			if (item.equalsIgnoreCase(frutaPesquisada)) {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println(frutaPesquisada + " já está na lista");
		} else {
			System.out.println(frutaPesquisada + " não está na lista");
		}

		System.out.println("Fim da aplicação");

	}

	/*
	 * 2) Escreva um programa que cria um ArrayList de inteiros. Para preencher,
	 * peça para que o usuário digite números até que ele digite 0 (zero). Em
	 * seguida, remova todos os números ímpares do ArrayList e imprima o ArrayList
	 * resultante.
	 */
	public static void listWithoutOddNumbers(Scanner scanner) {
		ArrayList<Integer> numbers = new ArrayList<>();

		System.out.println("Digite os números ou digite 0 para parar:");
		int number;
		do {
			number = scanner.nextInt();
			if (number != 0) {
				numbers.add(number);
			}
		} while (number != 0);

		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) % 2 != 0) {
				numbers.remove(i);
				i--;
			}
		}

		System.out.println("ArrayList resultante:");
		for (int num : numbers) {
			System.out.print(num + " ");
		}

	}
	
	/*3) Escreva um programa que cria um ArrayList de palavras.
	 * Para preencher, peça para que o usuário digite palavras até que ele digite 0 (zero).
	 * Em seguida, remova todas as palavras repetidas do ArrayList e imprima o ArrayList resultante.
	 * */
	public static void createWords(Scanner scanner) {
		ArrayList<String> words = new ArrayList<>();

		System.out.println("Digite as palavras ou digite 0 para parar:");
		String word;
		do {
			word = scanner.next();
			if (!word.equals("0")) {
				words.add(word);
			}
		} while (!word.equals("0"));

		for (int i = 0; i < words.size(); i++) {
			String currentWord = words.get(i);
			for (int j = i + 1; j < words.size(); j++) {
                if (currentWord.equals(words.get(j))) {
                    words.remove(j);
                    j--;
                }
            }
		}
		
		System.out.println("ArrayList resultante:");
        for (String w : words) {
            System.out.print(w + " ");
        }
	}
}
