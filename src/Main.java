import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//ArrayAndListExercise.verificarSeJaEstaNaLista(scanner);
		//ArrayAndListExercise.listWithoutOddNumbers(scanner);
		//ArrayAndListExercise.createWords(scanner);
		
		// Criação de ArrayLists para teste
        ArrayList<Integer> lista1 = new ArrayList<>(List.of(10, 4, 3, 9, 90, 76, 11, 7));
        ArrayList<Integer> lista2 = new ArrayList<>(List.of(4, 1, 76, 7, 90, 30, 47, 32));

        int soma = CalculoArrayList.calcularSoma(lista1);
        System.out.println("Soma: " + soma);

        double media = CalculoArrayList.calcularMedia(lista1);
        System.out.println("Média: " + media);

        ArrayList<Integer> listaOrdenada = CalculoArrayList.ordenar(lista1);
        System.out.println("Lista Ordenada: " + listaOrdenada);

        ArrayList<Integer> listaOrdenadaDecr = CalculoArrayList.ordenarDecr(lista1);
        System.out.println("Lista Ordenada Decrescente: " + listaOrdenadaDecr);

        ArrayList<Integer> listaConcatenada = CalculoArrayList.concatenar(lista1, lista2);
        System.out.println("Lista Concatenada: " + listaConcatenada);

        ArrayList<Integer> iguais = CalculoArrayList.trazerIguais(lista1, lista2);
        System.out.println("Elementos Iguais: " + iguais);

		scanner.close();
	}
}
