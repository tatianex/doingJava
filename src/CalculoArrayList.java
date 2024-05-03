import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CalculoArrayList {

	/*
	 * 4) Crie uma classe chamada CalculoArrayList com métodos estáticos que façam
	 * cálculos em arralists de números inteiros. Todos esses métodos recebem um
	 * arraylist por parâmetro e retornam um resultado. Crie os seguintes métodos: -
	 * calcularSoma: soma todos os elementos do arraylist e retorna um resultado
	 * int; - calcularMedia: calcula a média de todos os elementos do arraylist e
	 * retorna um resultado double; - ordernar: ordena o arraylist em ordem
	 * crescente e retorna o arraylist ordenado; - ordernarDecr: ordena o arraylist
	 * em ordem decrescente e retorna o arraylist ordenado. - concatenar: recebe
	 * como parâmetro dois arraylists de números inteiros e retornará outro
	 * arraylist que tem os elementos desses dois arraylists juntos. -
	 * getIntersecao: recebe como parâmetro dois arraylists de números inteiros e
	 * retornará outro arraylist que contenha a interseção dos elementos dos dois
	 * primeiros ArrayLists (ou seja, os elementos que aparecem em ambos).
	 */

	CalculoArrayList() {
	}

	public static int calcularSoma(ArrayList<Integer> intArray) {
		int soma = 0;
		for (int num : intArray) {
			soma += num;
		}
		return soma;
	}

	public static double calcularMedia(ArrayList<Integer> intArray) {
		int soma = calcularSoma(intArray);
		return (double) soma / intArray.size();
	}

	public static ArrayList<Integer> ordenar(ArrayList<Integer> intArray) {
		ArrayList<Integer> sortedArray = new ArrayList<>(intArray);
		Collections.sort(sortedArray);
		return sortedArray;
	}

	public static ArrayList<Integer> ordenarDecr(ArrayList<Integer> intArray) {
		ArrayList<Integer> sortedArray = new ArrayList<>(intArray);
		Collections.sort(sortedArray, Collections.reverseOrder());
		return sortedArray;
	}

	public static ArrayList<Integer> concatenar(ArrayList<Integer> intArray1, ArrayList<Integer> intArray2) {
        ArrayList<Integer> concatenatedArray = new ArrayList<>();
        concatenatedArray.addAll(intArray1);
        concatenatedArray.addAll(intArray2);
        return concatenatedArray;
    }
	
	public static ArrayList<Integer> trazerIguais(ArrayList<Integer> intArray1, ArrayList<Integer> intArray2) {
		ArrayList<Integer> iguais = new ArrayList<>();
		for (Integer num : intArray1) {
            if (intArray2.contains(num)) {
                iguais.add(num);
            }
        }
        
        return iguais;
	}
}
